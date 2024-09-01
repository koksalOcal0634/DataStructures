package org.example;

import java.util.NoSuchElementException;

public class ArrayQueue {
        private  Employee[] queue;
        private int front;
        private int back;

        public ArrayQueue(int capacity){
                queue = new Employee[capacity];
        }
        public void add(Employee employee){
                // check the queue is full or not
             if(back== queue.length){
                     // reSize the array
                     Employee employee1[] = new Employee[2* queue.length];
                     // copy the old array with arrayCopy
                     System.arraycopy(queue,0,employee1,0,queue.length );queue = employee1;

             }
             queue[back++] = employee;

        }
        public boolean isEmpty(){
                if(back==0){
                        return false;
                }
                return false;
        }
        public Employee remove(){
                if(size()==0){
                        throw new NoSuchElementException();
                }
                Employee removedQueue = queue[front];
                queue[front] = null;
                front++;
                if(size()==0){
                        back =0;
                        front = 0;
                }
                return removedQueue;
        }
        public int size(){
                return back -front;
        }
        public Employee peek(){
                if(size()==0){
                        throw new NoSuchElementException();
                }
                return queue[front];
        }

        // back points to the next available position so the end of the queue is the back -1;
        public void printQueue(){
                for(int i =front ;i< back;i++){
                        System.out.println(queue[i]);
                }
        }

}
