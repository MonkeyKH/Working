/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

import java.awt.Component;
import java.util.HashMap;

/**
 *
 * @author Kieran
 */
public class CommandInvoker 
{
  private HashMap<Component, CommandInterface> commands;
  public CommandInvoker()
  {
    commands = new HashMap<>();
  }
  
  public void addCommand(Component key, CommandInterface value)
  {
  commands.put(key, value);
  }
  public void executeCommand(Component key)
  {
    commands.get(key).execute();
    
  }
}
