package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      // create an Employee objects
        Employee koksal = new Employee("Köksal","Öcal",26,"koksalocal06@");
        Employee gamze = new Employee("Gamze","Öcal",21,"gamzeocal06@");
        Employee tulay = new Employee("Tülay","Öcal",46,"tulayocal06@");
        Employee inci = new Employee("İnci","Öcal",73,"inciocal06@");

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addFront(koksal);
        list.addFront(gamze);
        list.addFront(tulay);
        list.addFront(inci);
        list.printList();
        System.out.println("Is list is Empty : " + list.isEmpty()); // false;
        System.out.println("Elements number is the LinkedList : " + list.getSize());

        System.out.println("-----------After removing the node from the list-----------------");
        list.removeFront();
        list.getSize();
        list.printList();
        System.out.println("Elements number is the LinkedList : " + list.getSize());

        System.out.println("---------addToEnd------------------");
        Employee koksalOcal = new Employee("Köksal","Öcal",26,"koksalocal06@");
        Employee gamzeOcal = new Employee("Gamze","Öcal",21,"gamzeocal06@");
        Employee tulayOcal = new Employee("Tülay","Öcal",46,"tulayocal06@");
        Employee inciOcal = new Employee("İnci","Öcal",73,"inciocal06@");
        Employee javaSoftware = new Employee("JAVA","SOFTWARE",29,"java06@");
        EmployeeDoublyLinkedList doubleLinkedList = new EmployeeDoublyLinkedList();
        doubleLinkedList.addToFront(koksalOcal);
        doubleLinkedList.addToFront(gamzeOcal);
        doubleLinkedList.addToFront(tulayOcal);
        doubleLinkedList.addToFront(inciOcal);
        doubleLinkedList.printList();
        doubleLinkedList.addToEnd(gamzeOcal);
        doubleLinkedList.printList();
        System.out.println("Last element is deleted");
        doubleLinkedList.removeFromEnd();
        doubleLinkedList.printList();
        doubleLinkedList.removeFromEnd();
        doubleLinkedList.printList();
        System.out.println("The first element is deleted");
        doubleLinkedList.removeFromFront();
        doubleLinkedList.printList();



    }
}