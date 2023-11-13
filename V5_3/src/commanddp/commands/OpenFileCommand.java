/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import Controller.CommandInterface;
import adressverwaltung.model.AdressverwaltungModel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import v4.UI.MainWindow;

/**
 *
 * @author Bleich
 */
public class OpenFileCommand implements CommandInterface
{
  private MainWindow view;
  private AdressverwaltungModel model;
  
  public OpenFileCommand(MainWindow viewInput, AdressverwaltungModel modelInput)
  {
    view = viewInput;
    model = modelInput;
  }

  @Override
  public void execute()
  {
    var fc = new JFileChooser();
    var lastDir = model.getPreference("lastDirectory");

    if(lastDir != null)
        fc.setCurrentDirectory(new File(lastDir));

    int dialogResult = fc.showOpenDialog(view);

    if(dialogResult != JFileChooser.APPROVE_OPTION)   //user cancelled open dialog
        return;

    var filePath = fc.getSelectedFile().getAbsolutePath();

    try {
        model.datenLesen(fc.getSelectedFile());
        view.getjLabel1().setText(filePath);
        model.setPreference("lastDirectory", filePath);
        model.clearUndoData();
    } catch (IOException ex) {
        Logger.getLogger(OpenFileCommand.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(OpenFileCommand.class.getName()).log(Level.SEVERE, null, ex);
    }

    //model.deleteStacks();
  }

  @Override
  public void undo()
  {
      //tabelleninhalt und stack löschen
  }

  @Override
  public void redo()
  {
  }
}
