package org.example.queue_implementation;

import org.example.Employee;
import org.example.queue_implementation.ArrayQueue;

public class ArrayQueueMain {
    public static void main(String[] args) {
        Employee koksal = new Employee("Köksal","Öcal",26,"koksal06@gmail");
        Employee gamze = new Employee("Gamze","Öcal",21,"gamze06@gmail");
        Employee tulay = new Employee("Tülay","Öcal",46,"tulay06@gmail");
        Employee riza = new Employee("Rıza","Öcal",51,"riza06@gmail");
        ArrayQueue arrayQueue = new ArrayQueue(10);
        arrayQueue.add(koksal);
        arrayQueue.add(gamze);
        arrayQueue.add(tulay);
        arrayQueue.add(riza);
        arrayQueue.printQueue();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.remove();
        arrayQueue.printQueue();
        arrayQueue.remove();
        arrayQueue.remove();// throws no such element exception

    }
}
