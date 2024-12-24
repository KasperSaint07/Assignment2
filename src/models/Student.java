package models;

import java.util.ArrayList;

public class Student extends Person {
    private int studentId;
    private int idCounter = 1;
    private ArrayList<Integer> grades;



    public Student() {

    }
    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentId = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
        else {
            System.out.println("Grade can only be 0 and 100");
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }

        return(double) sum / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + " I am student with ID" + studentId + ".";
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public int getIdCounter() {
        return idCounter;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void setIdCounter(int idCounter) {
        this.idCounter = idCounter;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
