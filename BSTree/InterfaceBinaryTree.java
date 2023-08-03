/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package anh89.studentManagement.BSTree;

/**
 *
 * @author USER
 */
import java.util.Iterator;

public interface InterfaceBinaryTree<E> extends Iterable<E> {
    Position<E> root();
    Position<E> parent(Position<E> p) throws IllegalArgumentException;
    Position<E> left(Position<E> p)throws IllegalArgumentException;
    Position<E> right(Position<E> p)throws IllegalArgumentException;
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
    Iterable<Position<E>> children(Position<E> p)throws IllegalArgumentException;
    int numChildren(Position<E> p)throws IllegalArgumentException;
    boolean isInternal(Position<E> p)throws  IllegalArgumentException;
    boolean isExternal(Position<E> p)throws  IllegalArgumentException;
    boolean isRoot(Position<E> p)throws  IllegalArgumentException;
    int size();
    boolean isEmpty();
    Iterator<E> iterator();
 Iterable<Position<E>>positions();




}
