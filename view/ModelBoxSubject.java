/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.view;


import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author USER
 */
public class ModelBoxSubject implements ComboBoxModel<String> {

    private List<String> major;
     private Object selectobject;

    public ModelBoxSubject() {
        major=new ArrayList<>();
        major.add("cong nghe thong tin ");
     major.add("dien tu ");
     major.add("tai chinhngan hang ");
     major.add("vien tong ");
             
        
    }
     
     
            
            
            
            
            
            
            
    @Override
    public void setSelectedItem(Object anItem) {
selectobject=anItem;
    }

    @Override
    public Object getSelectedItem() {
return selectobject;//lay ten 
    }

    @Override
    public int getSize() {
return major.size();
    }

    @Override
    public String getElementAt(int index) {
return major.get(index);//lay index
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
    
}
