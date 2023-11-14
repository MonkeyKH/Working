/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package v5_3;

import Controller.CommandController;
import v4.UI.MainWindow;
import adressverwaltung.model.AdressverwaltungModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kieran
 */
public class Start 
{
  public Start()
  {
  //test
    MainWindow view = new MainWindow();
    AdressverwaltungModel model = new AdressverwaltungModel();
    CommandController controller = new CommandController(view, model);
    view.getjTable1().setModel(model);
    controller.registerEvents();
    controller.registerCommands();
    view.setVisible(true);
  }

  public static void main(String[] args) 
  {
    new Start();
  }

}
