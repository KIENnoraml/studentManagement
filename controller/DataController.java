/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package anh89.studentManagement.controller;

import anh89.studentManagement.Model.Registering;
import anh89.studentManagement.Model.Student;
import anh89.studentManagement.Model.Subject;
import java.util.Date;
import java.util.List;

/**
 *
 * @author USER
 */
public interface DataController {
    
     int SUBJECT = 1;
    int STUDENT = 2;
    int REGISTERING = 3;
    String SUBJECT_FILE = "C:\\Users\\USER\\Desktop\\subject.txt";
    String STUDENT_FILE = "C:\\Users\\USER\\Desktop\\student.txt";
    String REGISTERING_FILE = "C:\\Users\\USER\\Desktop\\register.txt";

    <T> void writeToFile(List<T> data, String fileName);//viet vao file

    <T> List<T> readDataFromFile(String fileName);//doc du lieu tu file

    void updateSubjectId(List<Subject> subjects);//cap nhat id mon hoc
    void updateStudentId(List<Student> student);

    void sortSubjectByNameASC(List<Subject> subjects);//sap sep mon hoc theo ten tang
    void sortSubjectById(List<Subject> subjects);



    List<Subject> searchSubjectByName(List<Subject> subjects, String key);//tim kiem mon hoc theo ten gan dung

    /**
     *
     * @param subjects
     * @param id
     * @return
     */
    int searchSubjectById(List<Subject> subjects,int id);

    void sortStudentByIdASC(List<Student> students);//sap sep hoc sinh theo id tang
    void SortStudentByYear(List<Student> students);
    

    List<Student> searchStudentByName(List<Student> students, String name);//tim kkien hoc sinh theo ten

    int searchStudentById(List<Student> students, String id);//tim kiem hoc sinh theo ma

  
    
    void sortRegisteringByStudentNameAZ(List<Registering> registerings);//sap sep bang dang kys theo ten tu a-Z
    
    void sortRegisteringByStudentNameZA(List<Registering> registerings);//sap sep bang dang kys theo ten tu z-a
    // early to late
    void sortRegisteringByRegisterTimeEL(List<Registering> registerings);//sap sep bang theo thoi gian dang ky
    // late to early
    void sortRegisteringByRegisterTimeLE(List<Registering> registerings);//sap sep bang theo thoi gian dang ky
    
    List<Registering> searchRegisteringByStudentName(List<Registering> rs, //tim hoc sinh trong dang sachs theo ten
            String key);
    
    List<Registering> searchRegisteringByRegisterTime(List<Registering> rs, //tim hoc sinh theo thoi gian
            Date fromDate, Date toDate);
    
 //   List<Course> createCouse(List<Registering> rs, List<Subject> subjects);//tao lop hoc
    
    
    
    
}
