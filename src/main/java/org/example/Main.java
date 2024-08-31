package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayStack employeeItems = new ArrayStack(4);
        Employee tr = new Employee("Turkey","Tr",101,"tr@gmail");
        Employee swe = new Employee("Sweden","Swe",55,"swe@gmail");
        Employee den = new Employee("Denmark","Dr",55,"den@gmail");
        Employee fin = new Employee("Finland","Fi",55,"fin@gmail");
        employeeItems.push(tr);
        employeeItems.push(swe);
        employeeItems.push(den);
        employeeItems.push(fin);

        System.out.println(  employeeItems.pop());
        System.out.println(employeeItems.size());
        employeeItems.printStack();
        System.out.println("Peek Item :  "  + employeeItems.peek());


        }
    }
