/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.controller;

import anh89.studentManagement.exception.InvalidDateOfBirth;
import anh89.studentManagement.exception.InvalidIdStudent;
import anh89.studentManagement.exception.InvalidPersonEmail;
import anh89.studentManagement.exception.InvalidPersonIdException;
import anh89.studentManagement.exception.InvalidPersonPhoneNumber;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class InfoFilerImp implements InfoFiler{

    @Override
    public boolean isInvalidDateOfBirth(String birthday) throws InvalidDateOfBirth {
        var regex="^\\d{2}/\\d{2}/\\d{4}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher =pattern.matcher(regex);
        if(matcher.matches()){
            return true;
        }
        
        else{
            var mess="this date not valid ,please enter again"+ birthday;
            throw new InvalidDateOfBirth(birthday,mess);
        }
        
        
        
        
    }

    @Override
    public boolean isInvalidPersonEmail(String email) throws InvalidPersonEmail {
        var regex="^[A-Za-z]+[A-Za-z0-9._]*gmail.com$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        if(matcher.matches()){
            return true;
        }
        else{
            var mess="this email  not valid ,please enter again" +email;
            throw new InvalidPersonEmail(email,mess);
        }
        
        
        
        
    }

    @Override
    public boolean isInvalidPersonIdException(String id) throws InvalidPersonIdException {
        var regex="^[A-Z]{2}\\d{8}[A-Z]{2}$";
         Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        if(matcher.matches()){
            return true;
        }
        else{
            var mess="this id not valid ,please enter again" +id;
            throw new InvalidPersonIdException(id,mess);
        }
        
        
        
    }

    @Override
    public boolean isInvalidPersonPhoneNumber(long phoneNumber) throws InvalidPersonPhoneNumber {
        var regex="^([0]{1}+[1-9]{1}+[0]{1})\\d{8}";
          Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        if(matcher.matches()){
            return true;
        }
        else{
            var mess="this number not valid ,please enter again" +phoneNumber;
            throw new InvalidPersonPhoneNumber(phoneNumber,mess);
        }
        
        
        
        
        
        
    }

    @Override
    public boolean isInvalidIdStudent(String idStudent) throws InvalidIdStudent {
        
        var regex="d{5}";//[A-Z]\\
         Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(regex);
        if(matcher.matches()){
           return true;
        }
        else{
            var mess="this id not valid ,please enter again" + idStudent ;
            throw new InvalidIdStudent(idStudent,mess);
    }
    
}




}
