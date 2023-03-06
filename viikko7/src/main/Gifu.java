package main;

import java.util.ArrayList;

public class Gifu {
    
    private String university;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Enrollment> enrollments;

    public Gifu(String university) {
        this.university = university;
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
        enrollments = new ArrayList<Enrollment>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Course getCourse(int id) {
        return courses.get(id);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void listCourses() {
        int i = 0;
        for(Course course : courses) {
            System.out.println(i + ") " + course.getInformation());
            i++;
        }
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public void listStudents() {
        int i = 0;
        for(Student student : students) {
            System.out.println(i + ") " + student.getInformation());
            i++;
        }
    }

    public void enrollStudent(Student student, Course course) {
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
    }

    public ArrayList<Enrollment> getEnrollments(Course course) {
        ArrayList<Enrollment> courseEnrollments = new ArrayList<Enrollment>();
        for(Enrollment enrollment : enrollments){
            if (enrollment.getCourse() == course) {
                courseEnrollments.add(enrollment);
            }
        }
        return courseEnrollments;
    }

    public ArrayList<Enrollment> getEnrollments(Student student) {
        ArrayList<Enrollment> studentEnrollments = new ArrayList<Enrollment>();
        for(Enrollment enrollment : enrollments){
            if (enrollment.getStudent() == student) {
                studentEnrollments.add(enrollment);
            }
        }
        return studentEnrollments;
    }

}
