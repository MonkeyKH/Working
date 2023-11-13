/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adressverwaltung.model;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author dblei
 */
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
