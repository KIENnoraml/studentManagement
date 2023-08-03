/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.exception;

/**
 *
 * @author USER
 */
public class InvalidPersonEmail extends Exception{
    private String PersonEmail;

    public InvalidPersonEmail(String PersonEmail) {
        this.PersonEmail = PersonEmail;
    }

    public InvalidPersonEmail(String PersonEmail, String message) {
        super(message);
        this.PersonEmail = PersonEmail;
    }

    public String getPersonEmail() {
        return PersonEmail;
    }

    public void setPersonEmail(String PersonEmail) {
        this.PersonEmail = PersonEmail;
    }
    
    
    
    
    
}
