/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.Model;

import anh89.studentManagement.BSTree.TreeMap;
import anh89.studentManagement.controller.InfoFilerImp;
import anh89.studentManagement.exception.InvalidDateOfBirth;
import anh89.studentManagement.exception.InvalidIdStudent;
import anh89.studentManagement.exception.InvalidPersonEmail;
import anh89.studentManagement.exception.InvalidPersonIdException;
import anh89.studentManagement.exception.InvalidPersonPhoneNumber;
import static java.awt.SystemColor.info;
import java.text.ParseException;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Student extends Person{
     private   static int number=10000;
   private String idStudent;
   private String major;
   private int grade;
   private String password;
  // private TreeMap<Integer,String> rigistered;
   //private TreeMap<Integer,String> rigistering;
 //private TreeMap<Integer,String> rigister;

    public Student(String idStudent, String major, int grade, String name) {
        super(name);
        this.idStudent = idStudent;
        this.major = major;
        this.grade = grade;
    }
   
   
   
    public Student(String idStudent, String major, int grade, String id, String name, String birthDay) 
            throws InvalidPersonIdException, InvalidDateOfBirth, ParseException {
        super(id, name, birthDay);
        this.idStudent = idStudent;
        this.major = major;
        this.grade = grade;
    }

    public Student(String idStudent, String major, int grade, String id, String name,
            String birthDay, String address, String email, long phoneNumber)
            throws InvalidPersonIdException, InvalidDateOfBirth, ParseException, InvalidPersonEmail, InvalidPersonPhoneNumber {
        super(id, name, birthDay, address, email, phoneNumber);
        this.idStudent = idStudent;
        this.major = major;
        this.grade = grade;
    }
    public Student(Person person,String idStudent, String major, int grade)
            throws InvalidPersonIdException, InvalidDateOfBirth, InvalidDateOfBirth, ParseException
             , InvalidPersonPhoneNumber, InvalidPersonEmail{
        super(person.getId(),person.getName(),person.getBirthDay().toString(),person.getAddress()
        ,person.getEmail(),person.getPhoneNumber());
          this.idStudent = idStudent;
        this.major = major;
        this.grade = grade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student() {
        idStudent=number++ +"" ;
    }
    

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStident(String idStudent) throws InvalidIdStudent {
//       var infor=new InfoFilerImp();
//       if(infor.isInvalidIdStudent(idStudent)){
//           this.idStudent=idStudent;
//           
//       }
//       else{
//           throw new InvalidIdStudent(idStudent);
//           
//       }
this.idStudent=idStudent;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

   public static void setNumber(int n) {
       number = n;
    }

//       public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.idStudent);
        hash = 23 * hash + Objects.hashCode(this.password);
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
        final Student other = (Student) obj;
        return true;
    }

 

 
    
    
    
 
    
    
   
   
   
    
}