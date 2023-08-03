/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Course  implements Serializable{
    private String name;
    private List<Registering> registerings;

    public Course() {
        name="";
        registerings=new ArrayList<>();
    }
    

    public Course(String name, List<Registering> register) {
        this.name = name;
        this.registerings = register;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Registering> getRegister() {
        return registerings;
    }

    public void setRegister(List<Registering> register) {
        this.registerings = register;
    }
    
    public void addRegister(Registering r){
        if(r!=null)registerings.add(r);
    }
    
    
    
    
    
    
}
