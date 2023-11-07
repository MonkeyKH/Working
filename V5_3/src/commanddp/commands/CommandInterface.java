/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commanddp.commands;

/**
 *
 * @author Kieran
 */
public interface CommandInterface 
{
  public void execute();
  public void undo();
  public void redo();
}


