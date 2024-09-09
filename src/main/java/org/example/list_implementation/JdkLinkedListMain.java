package org.example.list_implementation;

import org.example.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JdkLinkedListMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("James","Gosling",69,"james@gosling");
        Employee e2 = new Employee("Brendan","Eich",63,"brendan@eich");
        Employee e3 = new Employee("Linus","Torvalds",55,"linus@torvalds");
        List<Employee>list = new LinkedList<>();

        // add an item to in front of the list
        list.addFirst(e1);
        list.addFirst(e2);
        list.addFirst(e3);
        // use iterator
        Iterator iterator = list.listIterator();
        System.out.print("HEAD - >");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("<-->");

        }
        System.out.println("null");

        // add item to the end of the list
        // create an object

        Employee e4 = new Employee("blue", "whale",1,"tiny@bluewhale");
        list.addLast(e4);



        iterator = list.listIterator();
        System.out.print("HEAD - >");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("<-->");

        }
        System.out.println("null");

    }
}
