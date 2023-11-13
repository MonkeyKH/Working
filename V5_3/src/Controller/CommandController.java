/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import adressverwaltung.model.AdressverwaltungModel;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import v4.UI.MainWindow;

/**
 *
 * @author Bleich
 */
public class CommandController implements ActionListener
{
  private MainWindow view;
  private AdressverwaltungModel model;
  private CommandInvoker invoker;
  
  public CommandController(MainWindow viewInput, AdressverwaltungModel modelInput)
  {
    view = viewInput;
    model = modelInput;
    invoker = new CommandInvoker();
  }
  public void registerEvents()
  {
    
  }

  public void registerCommands()
  {
    
  }
  
  @Override
  public void actionPerformed(ActionEvent e)
  {
    Component key = (Component)e.getSource();
    invoker.executeCommand(key);
  }
}
