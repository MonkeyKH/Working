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
    view.getButtonUndo().addActionListener(this);
    view.getMenuAddLine().addActionListener(this);
    view.getMenuOpen().addActionListener(this);
    view.getMenuRemoveLine().addActionListener(this);
    view.getMenuSave().addActionListener(this);
    view.getMenuUndo().addActionListener(this);
    view.getPopUpAddLine().addActionListener(this);
    view.getPopUpDeleteLine().addActionListener(this);
  }

  public void registerCommands()
  {
    var addCommand = new AddCommand(view, model);
    var openFileCommand = new OpenFileCommand(view, model);
    var deleteCommand = new DeleteCommand(view, model);
    var saveFileCommand = new SaveFileCommand(view, model);
      
    invoker.addCommand(view.getButtonAddLine(), addCommand);
    invoker.addCommand(view.getButtonOpen(), openFileCommand);
    invoker.addCommand(view.getButtonRemoveLine(), deleteCommand);
    invoker.addCommand(view.getButtonSave(), saveFileCommand);
    invoker.addCommand(view.getMenuAddLine(), addCommand);
    invoker.addCommand(view.getMenuOpen(), openFileCommand);
    invoker.addCommand(view.getMenuRemoveLine(), deleteCommand);
    invoker.addCommand(view.getMenuSave(), saveFileCommand);
    invoker.addCommand(view.getPopUpAddLine(), addCommand);
    invoker.addCommand(view.getPopUpDeleteLine(), deleteCommand);
  }
  
  @Override
  public void actionPerformed(ActionEvent e)
  {
    Component key = (Component)e.getSource();
    if(key == view.getButtonUndo() || key == view.getMenuUndo())
        invoker.undoCommand();
    else
    {
        invoker.executeCommand(key);
        if(key == view.getButtonOpen() || key == view.getMenuOpen())
            invoker.clearStack();
    }
  }
}
