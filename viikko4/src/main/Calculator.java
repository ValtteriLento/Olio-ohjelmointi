package main;

import java.util.Arrays;

public class Calculator {
    
    public void listGrades(Student s) {
        for(Grade grade : s.getGrades()) {
            System.out.println(grade.getCourse() + ": " + grade.getGrade());
        }
    }

    public double getAverageGrade(Student s) {
        double average = 0;
        double sum = 0;
        int i = 0;
        for(Grade grade : s.getGrades()) {
            sum = sum + grade.getGrade();
            i++;
        }
        if(i == 0) {
            return average;
        } else {
            average = sum / i;
            return average;
        }
    }

    public double getMedianGrade(Student s) {
        double median = 0;
        double sum = 0;
        int i = 0;
        int grades[] = new int[s.getGrades().size()];
        for(Grade grade : s.getGrades()) {
            grades[i] = grade.getGrade();
            i++;
        }
        Arrays.sort(grades);
        if(i == 0) {
            return median;
        } else if((i % 2) != 0) { // Checks if i is odd number
            i = (int) Math.floor(i / 2); // Gets middle grade
            median = grades[i];
            return median;
        } else {
            i = i / 2;
            sum = grades[i - 1] + grades[i]; // Sums two middle grades
            median = sum / 2;
            return median;
        }
    }

}
