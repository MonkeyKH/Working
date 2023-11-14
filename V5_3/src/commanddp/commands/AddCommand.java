/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import adressverwaltung.model.AdressverwaltungModel;
import Controller.CommandInterface;
import adressverwaltung.model.*;
import v4.UI.MainWindow;

/**
 *
 * @author Bleich
 */
public class AddCommand implements CommandInterface
{
  private MainWindow view;
  private AdressverwaltungModel model;
  //private UndoDataHolder dataHolder;
  
  public AddCommand(MainWindow viewInput, AdressverwaltungModel modelInput)
  {
    view = viewInput;
    model = modelInput;
  }

  @Override
  public void execute()
  {
    int focusedRow = view.getjTable1().getSelectedRow();
      
    if(focusedRow < 0)              //set row to last item if no selection
        focusedRow = model.getRowCount();

    var tempEintrag = new Eintrag();
    model.insertRowData(focusedRow, tempEintrag.getArray());
    //dataHolder.pushRowAdd(focusedRow);
    model.pushRowAdd(focusedRow);
  }

  @Override
  public void undo()
  {
      int focusedRow = model.popRowAdd();
      
      if(focusedRow < 0)
          return;           //no rows to undo
      
      model.deleteRowData(focusedRow);
  }

  @Override
  public void redo()
  {
  }
}
