/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.exception;

/**
 *
 * @author USER
 */
public class InvalidPersonIdException extends Exception{
    private String PersonId;

    public InvalidPersonIdException(String PersonId) {
        this.PersonId = PersonId;
    }

    public InvalidPersonIdException(String PersonId, String message) {
        super(message);
        this.PersonId = PersonId;
    }

    public String getPersonId() {
        return PersonId;
    }

    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }
    
    
    
    
    
    
}
