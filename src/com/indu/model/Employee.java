package com.indu.model;

public class Employee {

    private String name;
    private String email;
    private int age;
    private int salary;
    private int sssa;




    public Employee(String name, String email, int age, int salary, int sssa) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.sssa = sssa;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
