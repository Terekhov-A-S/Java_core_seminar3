package ru.gb;

import java.util.ArrayList;

public class Employees {
    private String surname;
    private String firstName;
    private String lastName;
    private String birthday;
    private String position;
    private double salary;

    public Employees(java.lang.String surname, java.lang.String firstName, java.lang.String lastName, java.lang.String birthday, java.lang.String position, double salary) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.position = position;
        this.salary = salary;
    }

    public java.lang.String getSurname() {
        return surname;
    }

    public void setSurname(java.lang.String surname) {
        this.surname = surname;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLastName() {
        return lastName;
    }

    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    public java.lang.String getBirthday() {
        return birthday;
    }

    public void setBirthday(java.lang.String birthday) {
        this.birthday = birthday;
    }

    public java.lang.String getPosition() {
        return position;
    }

    public void setPosition(java.lang.String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public static void compareDates(ArrayList<Employees> emploees, String birthday, int age) {

    }

}
