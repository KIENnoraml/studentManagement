/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.exception;

/**
 *
 * @author USER
 */
public class InvalidPersonPhoneNumber extends Exception{
   private  long PersonPhoneNumber;

    public InvalidPersonPhoneNumber(long PersonPhoneNumber) {
        this.PersonPhoneNumber = PersonPhoneNumber;
    }

    public InvalidPersonPhoneNumber(long PersonPhoneNumber, String message) {
        super(message);
        this.PersonPhoneNumber = PersonPhoneNumber;
    }

    public long getPersonPhoneNumber() {
        return PersonPhoneNumber;
    }

    public void setPersonPhoneNumber(long PersonPhoneNumber) {
        this.PersonPhoneNumber = PersonPhoneNumber;
    }
   
   
   
    
    
    
}
