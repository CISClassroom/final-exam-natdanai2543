package com.company;

public class Main {

    public static void main(String[] args) {

        Student tae = new Student();


        tae.name = "Natdanai Wintachai";
        tae.id = "623410049-4";
        tae.major = "CIS";

        System.out.println("1. " + tae.name);
        System.out.println("2. " + tae.id);
        System.out.println("3. " + tae.major);

        Student[] oopStudent = {tae};

        find_CIS_student(oopStudent);
    }
    private static void find_CIS_student(Student[] oopStudent) {
    }

    // TO Find_CIS_Student
    public static void Find_CIS_Student(Student[] students){
        for(int i = 0; i < students.length; i++){
            if (students[i].major == "CIS"){
                System.out.print(students[i].name);
            }
        }
    }
}
