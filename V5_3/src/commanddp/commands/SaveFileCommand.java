/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import Controller.CommandInterface;
import adressverwaltung.model.AdressverwaltungModel;
import v4.UI.MainWindow;

/**
 *
 * @author Bleich
 */
public class SaveFileCommand implements CommandInterface
{
  private MainWindow view;
  private AdressverwaltungModel model;
  
  public SaveFileCommand(MainWindow viewInput, AdressverwaltungModel modelInput)
  {
    view = viewInput;
    model = modelInput;
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
