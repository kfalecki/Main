package com.company;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
    Student pierwszy = new Student("Nowak");
    Student drugi = new Student("Kowalski");
    Student trzeci = new Student("Żyła");
    Student czwarty = new Student("Banan");
    List<Student> studentList = new ArrayList<>();
    studentList.add(pierwszy);
    studentList.add(drugi);
    studentList.add(trzeci);
    studentList.add(czwarty);

    Grade mat3 = new Grade(Subjects.Matematyka, 3);
    Grade mat4 = new Grade(Subjects.Matematyka, 4);
    Grade mat5 = new Grade(Subjects.Matematyka, 5);
    Grade ang2 = new Grade(Subjects.Angielski, 2);
    pierwszy.addGrade(mat3);
    pierwszy.addGrade(mat5);
    pierwszy.addGrade(ang2);
    drugi.addGrade(mat3);
    drugi.addGrade(mat3);
    drugi.addGrade(ang2);
    trzeci.addGrade(mat4);
    trzeci.addGrade(mat5);
    trzeci.addGrade(ang2);
    czwarty.addGrade(mat3);
    czwarty.addGrade(mat4);
    czwarty.addGrade(mat5);

    //implementacja interfejsu Comparator z użyciem wyrażenia lambda
    studentList.sort((o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));

    for(Student s : studentList) {
        s.displayAvarageOfStudent(s.getSurname());
    }
    }
}