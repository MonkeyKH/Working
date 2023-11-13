/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import Controller.CommandInterface;
import adressverwaltung.model.AdressverwaltungModel;
import adressverwaltung.model.Eintrag;
import v4.UI.MainWindow;

/**
 *
 * @author Bleich
 */
public class AddCommand implements CommandInterface
{
  private MainWindow view;
  private AdressverwaltungModel model;
  
  public AddCommand(MainWindow viewInput, AdressverwaltungModel modelInput)
  {
    view = viewInput;
    model = modelInput;
  }

  @Override
  public void execute()
  {
      int focusedRow = view.getjTable1().getSelectedRow();
      if(focusedRow < 0)
          model.leerenAdressEintragAnhaengen();
      else
      {
          var tempEintrag = new Eintrag();
          model.insertRowData(focusedRow, tempEintrag.getArray());
      }
  }

  @Override
  public void undo()
  {
      int focusedRow = view.getjTable1().getSelectedRow();
//      if(focusedRow < 0)
//          model.
  }

  @Override
  public void redo()
  {
  }
}
