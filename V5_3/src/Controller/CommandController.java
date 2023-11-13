/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import adressverwaltung.model.AdressverwaltungModel;
import commanddp.commands.*;
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
    view.getButtonAddLine().addActionListener(this);
    view.getButtonOpen().addActionListener(this);
    view.getButtonRemoveLine().addActionListener(this);
    view.getButtonSave().addActionListener(this);
  }

  public void registerCommands()
  {
    invoker.addCommand(view.getButtonAddLine(), new AddCommand(view, model));
    invoker.addCommand(view.getButtonOpen(), new OpenFileCommand(view, model));
    invoker.addCommand(view.getButtonRemoveLine(), new DeleteCommand(view, model));
    invoker.addCommand(view.getButtonSave(), new SaveFileCommand(view, model));
  }
  
  @Override
  public void actionPerformed(ActionEvent e)
  {
    Component key = (Component)e.getSource();
    invoker.executeCommand(key);
  }
}
