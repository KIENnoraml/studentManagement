/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.BSTree;

/**
 *
 * @author USER
 */

public class TreeMap<K extends Comparable<K> ,V>extends AVLBinaryTree<K,V> {

public int sizetree(){
    return (size()-1)/2;
}

    private void expandExternal(Position<Entry<K,V>> p, Entry<K,V> entry){
        set(p,entry);
       addLeft(p,null);
        addRight(p,null);
    }
    public void addRoot(K key,V value) {
        Entry<K,V> newest=new TreeMAp<>(key,value);
        addRoot(newest);
    }

    private Position<Entry<K,V>> treeSearch(Position<Entry<K,V>> p,
                                             K key){
    if(isExternal(p)){
        return p;
    }
    int comp=key.compareTo(p.getElement().getKKey());
    if(comp==0){
        return p;
    }else if(comp<0){
        return treeSearch(left(p),key );
    }else
        return treeSearch(right(p),key );

    }

    public V get(K key) {

        Position<Entry<K,V>> p=treeSearch(root(),key);
        if(isExternal(p))return null;
        return p.getElement().getValue();
    }


    public V put(K key,V value ) throws IllegalArgumentException{

        Entry<K,V> newEntry=new TreeMAp<>(key,value);

        Position<Entry<K,V>> p=treeSearch(root(),key);
        if (isExternal(p)){
            expandExternal(p,newEntry);
            reblanceInsert(p);

        return null;
        }else {
            V old=p.getElement().getValue();
return old;
        }
    }

    public V remove(K key)throws IllegalArgumentException {
       // checkKey(key);
        Position<Entry<K,V>> p=treeSearch(root(),key);
        if(isExternal(p)){
            return null;
        }else {
            V old= p.getElement().getValue();
            if(isInternal(right(p))&& isInternal(left(p))){
              Position<Entry<K,V>> replacement=treeMax(left(p));
              set(p,replacement.getElement());
              p=replacement;
            }
            Position<Entry<K,V>> leaf=(isExternal(left(p))? left(p):right(p));
            Position<Entry<K,V>> sib= sibling(leaf);
            remove(leaf);
            remove(p);
            rebalanceDelete(sib);
            return old;
        }
    }

    private   Position<Entry<K,V>> treeMax(Position<Entry<K,V>> p) {
        Position<Entry<K,V>> walk=p;
        while (isInternal(walk))
            walk=right(walk);
        return parent(walk);
    }

public void update(K key,V value){
    Position<Entry<K,V>> p=treeSearch(root(),key);
    Entry<K,V> newest=new TreeMAp<>(key,value);
    if(isExternal(p)){
        System.out.println("key khong ton tai");
    }else {
        set(p,newest);
    }
}


}
