/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.controller;


import anh89.studentManagement.Model.Registering;
import anh89.studentManagement.Model.Student;
import anh89.studentManagement.Model.Subject;
import anh89.studentManagement.controller.sort.sortStudentById;
import anh89.studentManagement.controller.sort.sortStudentByYear;
import anh89.studentManagement.controller.sort.sortSubjectByIdA;
import anh89.studentManagement.controller.sort.sortSubjectByName;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author USER
 */
public class DataControllerImp implements DataController {


     public <T> void writeToFile(List<T> data, String fileName) {
        try ( FileOutputStream fos = new FileOutputStream(fileName);  
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public <T> List<T> readDataFromFile(String fileName) {
        List<T> data=new ArrayList<>();
        File file=new File(fileName);
        if(file.length()>0){
            try(FileInputStream fis=new FileInputStream(file);
                    ObjectInputStream ois=new ObjectInputStream(fis)){
              data=(List<T>)ois.readObject();
                
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                     ex.printStackTrace();
            }   
        
    }
        return data;
    }

    
    public void updateSubjectId(List<Subject> subjects) {
        if(subjects!=null&&subjects.size()>0){
            int max=subjects.get(0).getId();
            for(int i=1;i<subjects.size();i++){
                if(subjects.get(i).getId()>max){
                    max=subjects.get(i).getId();
                }
            }
        Subject.setNumber(max + 1);
        
        }
    }
    

    public void updateStudentId(List<Student> student){
        
        if(student!=null&&student.size()>0){
            int i=student.size()-1;
            int max=Integer.parseInt(student.get(i).getIdStudent().substring(1));
            Student.setNumber(max+1);
        }
        
        
    }
    
    @Override
    public void sortSubjectByNameASC(List<Subject> subjects) {
        subjects.sort(new  sortSubjectByName());
    }

    @Override
    public List<Subject> searchSubjectByName(List<Subject> subjects, String key) {
        List<Subject> result=new ArrayList<>();
        var rergex=".*"+key+".*";
        Pattern pattern=Pattern.compile(rergex,Pattern.CASE_INSENSITIVE);
        for(var a:subjects){
            Matcher matcher=pattern.matcher(a.getName());
            if(matcher.matches()){
                result.add(a);
            }
        }
        
        return result;
    }

    /**
     *
     * @param subjects
     * @param id
     * @return
     */
    public int searchSubjectById(List<Subject> subjects, int id) {
        int l=0,r=subjects.size()-1;
        while(l<=r){
            int m=l+(r+1)/2;
            if(subjects.get(m).getId()==id)
                return m;
            if(subjects.get(m).getId()<id)
                l=m+1;
            else 
                r=m-1;
            
        }
      
        return -1;
    } 

   
    public void sortStudentByIdASC(List<Student> students) {
        students.sort(new sortStudentById());
    }

   


    public List<Student> searchStudentByName(List<Student> students, String name) {
List<Student> result=new ArrayList<>();
var regex=".*"+name+".*";
Pattern pattern=Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
for(var a:students){
    Matcher  matcher =pattern.matcher(a.getName());
    if(matcher.matches())result.add(a);
}
return result;        
    }

  
    public int searchStudentById(List<Student> students, String id) {
        
//        int index=Integer.parseInt(id.substring(1));
//      
//         int l=0,r=students.size()-1;
//        while(l<=r){
//            int m=l+(r+1)/2;
//            if( index==Integer.parseInt(students.get(m).getId().substring(1)))
//                return m;
//            if( Integer.parseInt(students.get(m).getId().substring(1))<index)
//                l=m+1;
//            else 
//                r=m-1;
//            
//        }
        
for(int i=0;i<students.size()-1;i++){
    if(students.get(i).getIdStudent().compareTo(id)==0){
        return i;
    }
}
     
        
        return -1;
    }

  
    
    
  
    
    
    

    
    public void sortRegisteringByStudentNameAZ(List<Registering> registerings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortRegisteringByStudentNameZA(List<Registering> registerings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortRegisteringByRegisterTimeEL(List<Registering> registerings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortRegisteringByRegisterTimeLE(List<Registering> registerings) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Registering> searchRegisteringByStudentName(List<Registering> rs, String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Registering> searchRegisteringByRegisterTime(List<Registering> rs, Date fromDate, Date toDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sortSubjectById(List<Subject> subjects) {
        subjects.sort(new sortSubjectByIdA());
    }

    @Override
    public void SortStudentByYear(List<Student> students) {
        students.sort(new  sortStudentByYear());
    }

    
    
    
    
    
}
