/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adressverwaltung.model;

import java.util.ArrayList;

/**
 *
 * @author MOD-USER
 */
public class Eintrag {
    private String name;
    private String nachname;
    
    public void Eintrag(String nameInp, String nachnameInp)
    {
        name = nameInp;
        nachname = nachnameInp;
    }
    
    public void Eintrag()
    {
        name = "Max";
        nachname = "Mustermann";
    }
    
    public ArrayList getArray()
    {
        var tempList = new ArrayList<>();
        
        tempList.add(name);
        tempList.add(nachname);
        
        return tempList;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getNachname()
    {
        return nachname;
    }
}
