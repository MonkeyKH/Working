/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import Controller.CommandInterface;
import adressverwaltung.model.AdressverwaltungModel;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import v4.UI.MainWindow;

/**
 *
 * @author Kieran
 */
public class DeleteCommand implements CommandInterface
{
  private MainWindow view;
  private AdressverwaltungModel model;
  
  public DeleteCommand(MainWindow viewInput, AdressverwaltungModel modelInput)
  {
    view = viewInput;
    model = modelInput;
  }

  @Override
  public void execute()
  {
    int focusedRow = view.getjTable1().getSelectedRow();
      
    if(model.getRowCount() < 1)     //exit if no rows in model
        return;
    
    if(focusedRow < 0)              //set row to last item if no selection
        focusedRow = model.getRowCount() - 1;

    model.pushRowDelete(focusedRow);
    model.pushData(model.getRowData(focusedRow));
    model.deleteRowData(focusedRow);
  }

  @Override
  public void undo()
  {
      int focusedRow = model.popRowDelete();
      
      if(focusedRow < 0)
          return;
      
      model.insertRowData(focusedRow, model.popData());
  }

  @Override
  public void redo()
  {
  }
}
