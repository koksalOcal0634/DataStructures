package org.example;

import java.util.Objects;

public class Employee {
    private String name;
    private String lastName;
    private int age;
    private String emailAdress;

    public Employee(String name , String lastName , int age , String emailAdress){
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.emailAdress = emailAdress;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return  lastName;
    }
    public void setAge(int age){
        if(age<18){
            System.out.println("Age should not be under 18");
        }else{
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
    public void setEmailAdress(String emailAdress){
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", emailAdress='" + emailAdress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && Objects.equals(emailAdress, employee.emailAdress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, emailAdress);
    }
}
