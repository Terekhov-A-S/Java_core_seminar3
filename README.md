# Java Core (семинары)

![picture for project](https://raw.githubusercontent.com/Terekhov-A-S/Java_core_seminar3/main/src/main/resources/Java_core.jpg)

## Урок 3. Классы и объекты

[К РЕШЕНИЮ 1 ЗАДАЧИ](https://github.com/Terekhov-A-S/Java_core_seminar3?tab=readme-ov-file#решение)  ||  [К РЕШЕНИЮ 2 ЗАДАЧИ](https://github.com/Terekhov-A-S/Java_core_seminar3?tab=readme-ov-file#решение-1)  ||  [К РЕШЕНИЮ ДОПОЛНИТЕЛЬНОЙ ЗАДАЧИ](https://github.com/Terekhov-A-S/Java_core_seminar3?tab=readme-ov-file#решение-2)


### Задача 1.

Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.

#### Решение

Для этого можно использовать класс LocalDate из пакета java.time, который предоставляет удобные методы для работы с датами. Вот пример прототипа компаратора внутри класса сотрудника:

```java
package ru.gb;

import java.time.LocalDate;
import java.util.Comparator;

public class Employees {
    private String surname;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String position;
    private double salary;

    public Employees(String surname, String firstName, String lastName, LocalDate birthDate, String position, double salary) {
        this.surname = surname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
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
        return birthDate;
    }

    public void setBirthDate(java.time.LocalDate birthDate) {
        this.birthDate = birthDate;
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


    // Прототип компаратора для сравнения двух дат рождения сотрудников
    public static Comparator<Employees> birthDateComparator() {
        return Comparator.comparing(employee -> employee.birthDate);
    }

}
```

Здесь birthDateComparator() возвращает компаратор, который сравнивает сотрудников по их дате рождения. Используя Comparator.comparing(), мы избегаем использования условных операторов, так как он самостоятельно сравнивает даты.

---


### Задача 2.

Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. В основной программе создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

#### Решение

```java
public class Task2 {

}
```

---


### Дополнительно:

Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
Найдите первых 5 студентов специальности "Информатика" со средним баллом выше 4.5, отсортированных по убыванию среднего балла.
В решении не использовать циклы! **Только StreamAPI**


> ```java
> class Student {
>     private String name;
>     private List<Double> grades;
>     private String specialty;
> 
>         public double getAverageGrade() {...}
> 
> }
> ```


#### Решение

```java
public class Task3 {

}
```

---
*Подготовил студент Geek Brains* [**`Терехов Александр`**](https://gb.ru/users/1db43d0f-6c3d-46d1-bf5e-974b49af6f0d), Java_core_seminar3