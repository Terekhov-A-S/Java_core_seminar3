package ru.gb;

import java.time.LocalDate;

public class Employees {
    private String surname;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String position;
    private double salary;

    public Employees(String surname, String firstName, String lastName, LocalDate birthday, String position, double salary) {
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

    public java.time.LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(java.time.LocalDate birthday) {
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


    public static void compareDates(LocalDate date1, LocalDate date2) {

        if (date1.isAfter(date2))
            System.out.println(String.format("%s наступает после %s", date1, date2));
        else if (date1.isBefore(date2))
            System.out.println(String.format("%s наступает раньше %s", date1, date2));
        else if (date1.isEqual(date2))
            System.out.println("Обе даты равны");

    }

}
