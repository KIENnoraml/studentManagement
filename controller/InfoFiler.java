/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package anh89.studentManagement.controller;

import anh89.studentManagement.exception.InvalidDateOfBirth;
import anh89.studentManagement.exception.InvalidIdStudent;
import anh89.studentManagement.exception.InvalidPersonEmail;
import anh89.studentManagement.exception.InvalidPersonIdException;
import anh89.studentManagement.exception.InvalidPersonPhoneNumber;
import java.util.Date;

/**
 *
 * @author USER
 */
public interface InfoFiler {
    
    boolean isInvalidDateOfBirth(String birthday)throws InvalidDateOfBirth;
    boolean isInvalidPersonEmail(String email)throws InvalidPersonEmail;
    boolean isInvalidPersonIdException(String id)throws InvalidPersonIdException;
    
    boolean isInvalidPersonPhoneNumber(long phoneNumber)throws InvalidPersonPhoneNumber;
    
    
    boolean isInvalidIdStudent(String idStudent) throws InvalidIdStudent;
    
    
    
    
    
    
    
    
}
