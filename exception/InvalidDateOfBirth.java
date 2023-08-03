/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.exception;

import java.util.Date;

/**
 *
 * @author USER
 */
public class InvalidDateOfBirth extends Exception{
    
    private String DateOfBirth;

    public InvalidDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public InvalidDateOfBirth(String DateOfBirth, String message) {
        super(message);
        this.DateOfBirth = DateOfBirth;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }
    
    
    
    
}
