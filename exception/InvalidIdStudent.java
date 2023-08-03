/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.exception;

/**
 *
 * @author USER
 */
public class InvalidIdStudent extends Exception{
    private String idStudent;

    public InvalidIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public InvalidIdStudent(String idStudent, String message) {
        super(message);
        this.idStudent = idStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }
    
    
    
    
    
    
    
    
}
