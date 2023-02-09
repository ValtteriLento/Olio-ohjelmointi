package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private int studentId;
    private ArrayList<Grade> grades;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        grades = new ArrayList<Grade>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

}
