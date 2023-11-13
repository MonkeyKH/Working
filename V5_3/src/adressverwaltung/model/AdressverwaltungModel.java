/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adressverwaltung.model;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;
import java.util.prefs.Preferences;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author le
 */
public class AdressverwaltungModel extends AbstractTableModel
{
  private ArrayList<ArrayList<String>> daten;
  private ArrayList<String> adressEintraegeDaten;
  private ArrayList<String> adressEintraegeNamen;
  private UndoDataHolder undoData;
  private Preferences pref;
  
  public AdressverwaltungModel()
  {
    adressEintraegeDaten = new ArrayList<>();
    adressEintraegeNamen = new ArrayList<>();
    daten = new ArrayList<>();
    adressEintraegeNamen.add("Name");
    adressEintraegeDaten.add("Lehner");
    adressEintraegeNamen.add("Telefon");
    adressEintraegeDaten.add("122345");
    daten.add(adressEintraegeDaten);
    undoData = new UndoDataHolder();
  }

  @Override
  public int getRowCount()
  {
    return daten.size();
  }

  @Override
  public int getColumnCount()
  {
    return adressEintraegeDaten.size();
  }

  @Override
  public Object getValueAt(int row, int col)
  {
    return daten.get(row).get(col);
  }
  @Override
  public void setValueAt(Object value, int row, int col)
  {
    daten.get(row).set(col, (String)value);
  }
  
  @Override
  public boolean isCellEditable(int row, int col)
  {
    return true;
  }
  
  @Override
  public String getColumnName(int col)
  {
    return adressEintraegeNamen.get(col);
  }
  
  public ArrayList<String> getRowData(int row)
  {
    return daten.get(row);
  }
  
  public void insertRowData(int row, ArrayList<String> rowData)
  {
    daten.add(row, rowData);
    this.fireTableDataChanged();
  }
  
  public void deleteRowData(int row)
  {
    daten.remove(row);
    this.fireTableDataChanged();
  }

  public void leerenAdressEintragAnhaengen()
  {
    adressEintraegeDaten = new ArrayList<>();
    adressEintraegeNamen.forEach(s -> adressEintraegeDaten.add(s));
    daten.add(adressEintraegeDaten);
    this.fireTableDataChanged();
  }
  
  
  public void spalteHinzufuegen(int col, String name)
  {
    adressEintraegeNamen.add(name);
    daten.forEach(s -> s.add(col, " "));
    this.fireTableStructureChanged();
  }
  
  public void spalteLoeschen(int col)
  {
    adressEintraegeNamen.remove(col);
    daten.forEach(s -> s.remove(col));
    this.fireTableStructureChanged();
  }
  
  public void datenSpeichern(File datei) throws FileNotFoundException, IOException
  {
    FileOutputStream fos = new FileOutputStream(datei);
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(daten);
    oos.writeObject(adressEintraegeNamen);
    oos.flush();
    oos.close();
  }
  
  public void datenLesen(File datei) throws FileNotFoundException, IOException, ClassNotFoundException
  {
    FileInputStream fis = new FileInputStream(datei);
    BufferedInputStream bis = new BufferedInputStream(fis);
    ObjectInputStream ois = new ObjectInputStream(bis);
    daten = (ArrayList<ArrayList<String>>)ois.readObject();
    adressEintraegeNamen = (ArrayList<String>)ois.readObject();
    adressEintraegeDaten = daten.get(daten.size()-1);
    ois.close();
    this.fireTableDataChanged();
    // evtl. this.fireTableStructureChanged();
  }
  
  public void setPreference(String key, String value)
  {
      pref.put(key, value);
  }
  
  public String getPreference(String key)
  {
      pref = Preferences.userNodeForPackage(getClass());
      return pref.get(key, null);
  }
  
  public UndoDataHolder getUndoDataHolder()
  {
      return undoData;
  }
  
  public void pushRowAdd(int addedRow)
  {
      undoData.pushRowAdd(addedRow);
  }
  
  public void pushRowDelete(int deletedRow)
  {
      undoData.pushRowDelete(deletedRow);
  }
  
  public void pushData(ArrayList<String> data)
  {
      undoData.pushData(data);
  }
  
  public int popRowAdd()
  {
      return undoData.popRowAdd();
  }
  
  public int popRowDelete()
  {
      return undoData.popRowDelete();
  }
  
  public ArrayList<String> popData()
  {
      return undoData.popData();
  }
  
  public void clearUndoData()
  {
      undoData.clear();
  }
}


class UndoDataHolder
{
    /** Stack = LIFO = Last In First Out
     *  Queue = FIFO = First In First Out
     */
    private ArrayDeque<ArrayList<String>> stackFuerGeloeschteDatensaetze;
    private Stack<Integer> addedRows;
    private Stack<Integer> deletedRows;
    // etc.

    public UndoDataHolder()
    {
      stackFuerGeloeschteDatensaetze = new ArrayDeque<>();
      addedRows = new Stack<Integer>();
      deletedRows = new Stack<Integer>();
    }

    public void pushRowAdd(int addedRow)
    {
        addedRows.push(addedRow);
    }

    public void pushRowDelete(int deletedRow)
    {
        deletedRows.push(deletedRow);
    }

    public void pushData(ArrayList<String> data)
    {
        stackFuerGeloeschteDatensaetze.push(data);
    }

    public int popRowAdd()
    {
        if(addedRows.size() < 1)
            return -1;

        return addedRows.pop();
    }

    public int popRowDelete()
    {
        if(deletedRows.size() < 1)
            return -1;

        return deletedRows.pop();
    }

    public ArrayList<String> popData()
    {
        if(stackFuerGeloeschteDatensaetze.size() < 1)
            return new ArrayList<String>();

        return stackFuerGeloeschteDatensaetze.pop();
    }

    public void clear()
    {
        addedRows.clear();
        deletedRows.clear();
        stackFuerGeloeschteDatensaetze.clear();
    }
}