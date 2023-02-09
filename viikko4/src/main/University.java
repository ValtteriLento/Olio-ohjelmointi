package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {

    final private String FILENAME;
    private ArrayList<Student> students = new ArrayList<Student>();
    
    public University() {
        FILENAME = "students.data";
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int j) {
        return students.get(j);
    }

    public void listStudentNames() {
        int i = 0;
        for(Student student : students) {
            System.out.println(i + ": " + student.getName());
            i++;
        }
    }

    public void listStudents() {
        System.out.println("Opiskelijat:");
        for(Student student : students) {
            System.out.println(student.getStudentId() + ": " + student.getName());
        }
    }

    public void saveStudents() {
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream(new FileOutputStream(FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();
        } catch (IOException e) {
            System.out.println("Opiskelijoiden tallentaminen ei onnistunut");
            e.printStackTrace();
        }
    }

    public void loadStudents() {
        try {
            ObjectInputStream studentReader = new ObjectInputStream(new FileInputStream(FILENAME));
            students = (ArrayList<Student>) studentReader.readObject();
            studentReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
        } catch (IOException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Opiskelijoiden lukeminen ei onnistunut");
            e.printStackTrace();
        }
    }

}
