/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import Controller.CommandInterface;
import java.awt.Component;
import java.util.HashMap;
import java.util.Stack;

/**
 *
 * @author Kieran
 */
public class CommandInvoker 
{
  private HashMap<Component, CommandInterface> commands;
  private Stack <CommandInterface> undoStack;
  public CommandInvoker()
  {
    commands = new HashMap<>();
    undoStack = new Stack();
  }
  
  public void addCommand(Component key, CommandInterface value)
  {
  commands.put(key, value);
  }
  public void executeCommand(Component key)
  {
    var cmd = commands.get(key);
    cmd.execute();
    
    undoStack.push(cmd);
  }
  
  public void undoCommand()
  {
      if(undoStack.isEmpty())
          return;
      
      undoStack.pop().undo();
  }
  
  public void clearStack()
  {
      undoStack.clear();
  }
}
