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
import java.util.Iterator;
import java.util.List;

public class LinkBinaryTree<E> extends AbstractBinaryTree<E> {

    protected static class Node<E> implements Position<E> {
        //int aux=0;
        private E element;
        private Node<E> parent;
        private Node<E>right;
        private Node<E>left;

        public Node(E e, Node<E> above, Node<E> rightChild, Node<E> leftChild) {
            element = e;
            parent = above;
            right = rightChild;
            left = leftChild;
        }


        public E getElement() throws IllegalStateException {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }



        public Node<E> getParent() {
            return parent;
        }

        public void setParent(Node<E> above) {
           parent = above;
        }

        public Node<E> getRight() {
            return right;
        }

        public void setRight(Node<E> rightChild) {
           right = rightChild;
        }

        public Node<E> getLeft() {
            return left;
        }

        public void setLeft(Node<E> leftChild) {
            left = leftChild;
        }
    }
    protected Node<E> createNode(E e,Node<E> parent,Node<E> left,Node<E> right){

        return new Node<>(e,parent,left,right);
    }
    protected Node<E> root=null;
    private int size=0;

    public LinkBinaryTree() {
    }

    protected Node<E>validate(Position<E> p)throws IllegalArgumentException{

        if(!(p instanceof Node))
            throw new IllegalArgumentException("not valid position type");
        Node<E> node=(Node<E>) p;
        if(node.getParent()==node)
            throw new IllegalArgumentException("p is not longer in the tree");

        return node;
    }


    public Position<E> root() {
        return root;
    }

    public Position<E> parent(Position<E> p) throws IllegalArgumentException {
        Node<E> node=validate(p);
        return node.getParent();
    }

    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        Node<E>node=validate(p);
        return node.getLeft();
    }

    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        Node<E>node=validate(p);
        return node.getRight();
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {

        return null;
    }

    @Override
    public Iterable<Position<E>> positions() {
        return null;
    }

    public Position<E> addRoot(E e)throws IllegalStateException{
        if(!isEmpty())throw new IllegalStateException("tree is not empty");
        root=createNode(e,null,null,null);
        size=1;
        return root;
    }

    public Position<E> addLeft(Position<E> p, E e)throws IllegalArgumentException {
        Node<E> node=validate(p);
        if(node.getLeft()!=null)
            throw new IllegalArgumentException("p already has a left child");
        Node<E>child =createNode(e,node,null,null);
        node.setLeft(child);
        size++;
        return child;
    }

    public Position<E> addRight(Position<E> p, E e)throws IllegalArgumentException{
        Node<E> parent=validate(p);
        if(parent.getRight()!=null)
            throw new IllegalArgumentException("p already has a right");
        Node<E> right=createNode(e,parent,null,null);
        parent.setRight(right);
        size++;
        return right;

    }

    public E set(Position<E> p, E e)throws IllegalArgumentException{
        Node<E>node=validate(p);
        E temp=node.getElement();
        node.setElement(e);
        return temp;
    }


    public void attach(Position<E> p, LinkBinaryTree<E> t1, LinkBinaryTree<E> t2)
            throws IllegalArgumentException{
        Node<E> node=validate(p);
        if(!isInternal(p))throw new IllegalArgumentException("p must be a leaf");
        size+=t1.size()+ t2.size();
        if(!t1.isEmpty()){
            t1.root.setParent(node);
            node.setLeft(t1.root);
            t1.root=null;
            t1.size=0;
        }
        if(!t2.isEmpty()){
            t2.root.setParent(node);
            node.setRight(t2.root);
            t2.root=null;
            t2.size=0;

        }




    }


    public E remove(Position<E> p)throws IllegalArgumentException{
        Node<E> node=validate(p);
        if(numChildren(p)==2)
            throw new IllegalArgumentException("p has tow children");
        Node<E> child=(node.getLeft()!=null?node.getLeft():node.getRight());
        if(child!=null)
            child.setParent(node.getParent());
        if(node==root){
                root=child;
        }else {
                Node<E> parent=node.getParent();
                if(node==parent.getLeft())
                    parent.setLeft(child);
                else
                    parent.setLeft(child);
        }
            size--;
        E temp=node.getElement();
        node.setElement(null);
        node.setLeft(null);
        node.setRight(null);
        node.setParent(node);
        return temp;
    }


    public List <Position<E>> inoder() {
        List<Position<E>> snapshot = new ArrayList<>();
        if (!isEmpty()) {

            inoderSubtree(root(), snapshot);
            return snapshot;
        }
        return null;
    }
    private void inoderSubtree(Position<E> r,List<Position<E>> snapshot) {
      if(left(r).getElement()!=null)
          inoderSubtree(left(r),snapshot);

       snapshot.add(r);
        if(right(r).getElement()!=null)
            inoderSubtree(right(r),snapshot);


       }

      
    }
