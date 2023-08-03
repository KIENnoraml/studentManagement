/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.Model;

import anh89.studentManagement.controller.InfoFilerImp;
import anh89.studentManagement.exception.InvalidDateOfBirth;
import anh89.studentManagement.exception.InvalidPersonEmail;
import anh89.studentManagement.exception.InvalidPersonIdException;
import anh89.studentManagement.exception.InvalidPersonPhoneNumber;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Person implements Serializable{
    private String  id;
    private String name;
    private Date birthDay;
    private String address;
    private String email;
    private long phoneNumber;

    public Person(String id, String name, String birthDay) throws InvalidPersonIdException, InvalidDateOfBirth, ParseException {
        setId(id);
        setName(name);
        setBirthDay(birthDay);
    }

    public Person(String id, String name, String  birthDay, String address, String email, long phoneNumber) 
            throws InvalidPersonIdException, InvalidDateOfBirth, ParseException, InvalidPersonEmail, InvalidPersonPhoneNumber {
        setId(id);
        setName(name);
        setBirthDay(birthDay);
        setAddress(address);
        setEmail(email);
        setPhoneNumber(phoneNumber);     
    }
public Person(){
    
    
}

    public Person(String name) {
        this.name = name;
    }
   
    

    public String getId() {
        return id;
    }

    public void setId(String id) throws InvalidPersonIdException {
        var infor=new InfoFilerImp();
        
        try{
            if(infor.isInvalidPersonIdException(id)){
               this.id=id;
            }
                    
        }catch(InvalidPersonIdException ex){
            throw ex;
        }
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) throws InvalidDateOfBirth, ParseException {
        
        var info=new InfoFilerImp();
        try{
            if(info.isInvalidDateOfBirth(birthDay))
                this.birthDay=new SimpleDateFormat("dd/MM/yyyy").parse(birthDay);
        } catch (InvalidDateOfBirth | ParseException ex) {
throw ex;        }
        
        
        
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidPersonEmail {
        
        var info=new InfoFilerImp();
        try{
            if(info.isInvalidPersonEmail(email))
                this.email=email;
            
        }
        catch(InvalidPersonEmail ex){
            throw ex;
        }
        
        
        
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) throws InvalidPersonPhoneNumber {
             var info=new InfoFilerImp();
             try{
                 if(info.isInvalidPersonPhoneNumber(phoneNumber))
                     this.phoneNumber=phoneNumber;
             } catch (InvalidPersonPhoneNumber ex) {
            throw ex;
        }
        
        
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.birthDay);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.birthDay, other.birthDay)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
