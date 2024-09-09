package org.example.list_implementation;

import org.example.Employee;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;
    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        // if we're adding an element into the empty list
        if(head ==null){
            tail = node;
        }else{
            // current head of the node's previous becomes the new node
            head.setPrevious(node);

        }
        head = node;
        size ++;

    }
    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);
        if(tail==null){
            head = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public boolean isEmpty(){
        if (getSize()==0){
            return true;
        }
        return false;
    }
    public int getSize(){
        return size;
    }
    public void printList(){
        EmployeeNode currentHead = head;
        System.out.print("HEAD --> ");
        while(currentHead!=null){ // if list is not empty
            System.out.println(currentHead);
            System.out.println("--->");
            currentHead = currentHead.getNext();
        }
        System.out.println("null");
    }
    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode = head;
        if(head.getNext()==null){
            tail = null;
        }else{
            head.getNext().setPrevious(null);
        }
        // singly linkedlist
        head = head.getNext();
            size--;
            removedNode.setNext(null);
            return removedNode;


    }
    public EmployeeNode removeFromEnd(){
        EmployeeNode removedNode = tail;
        if(tail.getPrevious()==null){
            head = null;
        }else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return  removedNode;
    }
}
