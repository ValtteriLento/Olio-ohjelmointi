package main;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        University university = new University();
        Calculator calculator = new Calculator();

        while(!exit) {
            System.out.println("1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijan suoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) Tallenna opiskelijat tiedostoon, 8) Lataa opiskelijat tiedostosta, 0) Lopeta ohjelma");

            if (sc.hasNext()) {
                int i = 0;
                int j = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Anna opiskelijan nimi?");
                        String name = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        int studentId = Integer.parseInt(sc.nextLine());
                        Student student = new Student(name, studentId);
                        university.addStudent(student);
                        break;
                    case 2:
                        university.listStudents();
                        break;
                    case 3:
                        university.listStudentNames();
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        j = Integer.parseInt(sc.nextLine());
                        System.out.println("Mille kurssille suorite lisätään?");
                        String course = sc.nextLine();
                        System.out.println("Mikä arvosana kurssille lisätään?");
                        int grade = Integer.parseInt(sc.nextLine());
                        Grade courseGrade = new Grade(course, grade);
                        student = university.getStudent(j);
                        student.addGrade(courseGrade);
                        break;
                    case 4:
                        university.listStudentNames();
                        System.out.println("Minkä opiskelijan suoritteet listataan?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        calculator.listGrades(student);
                        break;
                    case 5:
                        university.listStudentNames();
                        System.out.println("Minkä opiskelijan suoritteiden keskiarvo lasketaan?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        double average = calculator.getAverageGrade(student);
                        System.out.println("Keskiarvo on " + average);
                        break;
                    case 6:
                        university.listStudentNames();
                        System.out.println("Minkä opiskelijan suoritteiden mediaani lasketaan?");
                        j = Integer.parseInt(sc.nextLine());
                        student = university.getStudent(j);
                        double median = calculator.getMedianGrade(student);
                        System.out.println("Mediaani on " + median);
                        break;
                    case 7:
                        university.saveStudents();
                        break;
                    case 8:
                        university.loadStudents();
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
        sc.close();
    }
}
