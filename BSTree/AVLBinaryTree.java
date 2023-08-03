/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anh89.studentManagement.BSTree;

/**
 *
 * @author USER
 */
public   class AVLBinaryTree<K,V> extends LinkBinaryTree<Entry<K,V>> {


    static class TreeMAp<K,V> implements Entry<K,V>{



        private K k;
        private V v;

        public TreeMAp(K key, V value) {
            k = key;
            v = value;
        }

        public K getKKey() {
            return k;
        }
        public V getValue() {
            return v;
        }

        protected void setK(K key) {
            k = key;
        }

        protected void setV(V value) {
            v = value;
        }
    }

    protected  static class BSTNode<E> extends Node<E>{
int axu=0;
        public BSTNode(E e, Node<E> above, Node<E> rightChild, Node<E> leftChild) {
            super(e, above, rightChild, leftChild);
        }

        public int getAxu() {
            return axu;
        }

        public void setAxu(int value) {
           axu = value;
        }
    }

    public int getAux(Position<Entry<K,V>> p){
        return ((BSTNode<Entry<K,V>>) p).getAxu();

    }

    public void setAux(Position<Entry<K,V>> p, int value){
        ((BSTNode<Entry<K,V>>)p).setAxu(value);
    }
    protected Node<Entry<K,V>> createNode(Entry<K,V> e, Node<Entry<K,V>> parent, Node<Entry<K,V>> left,
                                          Node<Entry<K,V>> right){

    return new BSTNode<>(e,parent,left,right);
    }

    private void relink(Node<Entry<K,V>>parent , Node<Entry<K,V>>child, boolean makeleftChild){
            child.setParent(parent);
            if(makeleftChild){
                parent.setLeft(child);
            }else
                parent.setRight(child);
    }
    public void rotate(Position<Entry<K,V>> p){
        Node<Entry<K,V>>x=validate(p);
        Node<Entry<K,V>>y=x.getParent();
        Node<Entry<K,V>>z=y.getParent();
        if(z==null){
            root=x;
            x.setParent(null);
        }else
            relink(z,x,y==z.getLeft());

        if(x==y.getLeft()){
            relink(y,x.getRight(),true);
            relink(x,y,false);
        }else {
            relink(y,x.getLeft(),false);
            relink(x,y,true);
        }


    }
    public Position<Entry<K,V>> restructure(Position<Entry<K,V>> x){
        Position<Entry<K,V>> y=parent(x);
        Position<Entry<K,V>> z=parent(y);
        if((x==right(y))==(y==right(z))){
            rotate(y);
            return y;

        }else {
            rotate(x);
            rotate(x);
            return x;
        }

    }






    protected void  recomputeHeight(Position<Entry<K,V>> p){
     setAux(p,Math.max(getAux(left(p)),getAux(right(p))));
    }
    protected boolean isBlanced(Position<Entry<K,V>> p){
        return Math.abs(getAux(left(p))-getAux(right(p)))<=1;
    }

    protected Position<Entry<K,V>> tallerChild(Position<Entry<K,V>> p){
        if(getAux(left(p))>getAux(right(p)))return left(p);
        if(getAux(left(p))<getAux(right(p)))return right(p);

        if(isRoot(p))return left(p);
        if(p==left(parent(p)))return  left(p);
        else return right(p);

    }

    protected void rebalance(Position<Entry<K,V>> p){
        int oldHeight,newHeight;
        do{
            oldHeight=getAux(p);
            if(!isBlanced(p)){
                p=restructure(tallerChild(tallerChild(p)));
                recomputeHeight(left(p));
                recomputeHeight(right(p));

            }
            recomputeHeight(p);
            newHeight=getAux(p);
            p=parent(p);
        }while(oldHeight!=newHeight&&p!=null);



    }

    protected void reblanceInsert(Position<Entry<K,V>> p){
        rebalance(p);
    }
    protected void rebalanceDelete(Position<Entry<K,V>> p){
        if(!isRoot(p)){
            rebalance(parent(p));
        }
    }


}

