/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package v5_3;

import Controller.MenuListener;
import v4.UI.MainWindow;
import adressverwaltung.model.AdressverwaltungModel;

/**
 *
 * @author Kieran
 */
public class V5_3 
{
  public V5_3()
  {
  //test
    MainWindow view = new MainWindow();
    AdressverwaltungModel model = new AdressverwaltungModel();
    MenuListener listener = new MenuListener(view, model);
    view.setVisible(true);
  }

  public static void main(String[] args) 
  {
    new V5_3();
  }

}
