/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.controller.sort;

import anh89.studentManagement.Model.Student;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class sortStudentById implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getIdStudent().compareTo(o2.getIdStudent());
    }
    
    
    
    
    
    
}
