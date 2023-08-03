/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.BSTree;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree <E> implements InterfaceBinaryTree<E> {
    public boolean isInternal(Position<E> p){
        return numChildren(p)>0;
    }


    public boolean isExternal(Position<E> p) throws IllegalArgumentException {
        return numChildren(p)==0;
}


    public boolean isRoot(Position<E> p) {
        return p==root();
    }
    public boolean isEmpty(){
        return size()==0;
    }



    public int numChildren(Position<E> p){
        int count=0;
        if(left(p)!=null){
            count++;

        }
        if(right(p)!=null)
            count++;

        return count;
    }

    public Iterable<Position<E>> children(Position<E> p){
        List<Position<E>>snapshop=new ArrayList<>(2);
        if(left(p)!=null)
            snapshop.add(left(p));
        if (right(p)!=null)
            snapshop.add(right(p));
        return snapshop;
    }
    public Position<E> sibling(Position<E> p){
        Position<E> parent=parent(p);
        if(parent==null)return null;
        if(p==left(parent))
            return right(parent);
        else
            return left(parent);
    }


}
