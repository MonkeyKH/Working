/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import adressverwaltung.model.AdressverwaltungModel;
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
    viewInput = view;
    modelInput = model;
  }

  @Override
  public void execute()
  {
  }

  @Override
  public void undo()
  {
  }

  @Override
  public void redo()
  {
  }
}
