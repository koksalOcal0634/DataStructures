package org.example.stack_implementation;

import org.example.Employee;

import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStack {
    private Employee[] stack;
    private int top;
    public ArrayStack(int capacity){
        stack = new Employee[capacity];

    }
    public void push(Employee employee){
        if(top == stack.length){
            // need to resize the backing array
            // double the length of the array
            Employee [] newArray = new Employee[stack.length*2];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;

        }
        stack[top++] = employee;
    }
    public Employee pop(){
       // control the stack is empty or not
        if(isEmpty()){
            throw new EmptyStackException();
        }
         Employee employee = stack[--top];
        stack[top] = null;
        return employee;

    }
    public boolean isEmpty(){
        if(stack.length==0){
            return true;
        }
        return false;
    }
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return  stack[top-1];
    }
    public int size(){
        return top;
    }
    public void printStack(){
        for(int i = top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
