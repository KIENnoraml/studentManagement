/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Subject implements Serializable {
 private   static int number=1000;
    private int id;
    private String name;

    private String kind;
    private int credit;
    private int lessonOfNumber;
    

    public Subject() {
        id=number++;
    }

    public Subject(int id){
        this.id=id;
        
    }
    
    public Subject(int id,String name,String kind, int credit, int lessonOfNumber) {
        this.id = id;
        this.name=name;
        this.kind = kind;
        this.credit = credit;
        this.lessonOfNumber = lessonOfNumber;
        
    }

   public Subject(String name, String kind, int credit, int lessonOfNumber) {
        this();
        this.name=name;
        this.kind = kind;
        this.credit = credit;
        this.lessonOfNumber = lessonOfNumber;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
   

   

    public int getLessonOfNumber() {
        return lessonOfNumber;
    }

    public void setLessonOfNumber(int lessonOfNumber) {
        this.lessonOfNumber = lessonOfNumber;
    }

   public static void setNumber(int n){
   number=n;
   }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Subject other = (Subject) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
