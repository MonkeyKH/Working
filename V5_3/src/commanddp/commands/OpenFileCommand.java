/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import Controller.CommandInterface;
import adressverwaltung.model.AdressverwaltungModel;
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
      int dialogResult = fc.showOpenDialog(view);
      
      if(dialogResult != JFileChooser.APPROVE_OPTION)
          return;
      
      try {
          model.datenLesen(fc.getSelectedFile());
      } catch (IOException ex) {
          Logger.getLogger(OpenFileCommand.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(OpenFileCommand.class.getName()).log(Level.SEVERE, null, ex);
      }
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
