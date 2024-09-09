package org.example.list_implementation;

import org.example.Employee;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;
     public void addFront(Employee employee){
         EmployeeNode node = new EmployeeNode(employee);
         node.setNext(head);
         head = node;
         size ++;

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
     public EmployeeNode removeFront(){
         EmployeeNode removedNode = head;
         if(isEmpty()){
             return null;
         }else {
            head = head.getNext();
             size--;
             removedNode.setNext(null);
             return removedNode;

         }
     }
}
