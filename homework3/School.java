package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class School {
    String SchoolName = "Школа №1";
    Director director = new Director("Moisha", 40);

    Student vasya = new Student("Vasya", 20, "", 5);
    Student ivan = new Student("Ivan", 15, "", 2);
    Student anya = new Student("Anya", 18, "", 3);
    Student tanya = new Student("Tanya", 18, "", 0);
    Student[] studentClass = new Student[]{vasya, ivan, anya, tanya};

    Teacher ramzan = new Teacher("Рамзан", 54, "");
    Teacher abram = new Teacher("Абрам", 34, "");
    Teacher zabram = new Teacher("Забрам", 34, "");
    Teacher zabram1 = new Teacher("Забрам1", 34, "");
    Teacher[] teacherPool = new Teacher[]{ramzan, abram, zabram, zabram1};

    public void newStudentAdd() {
        Student[] newStudentClass = Arrays.copyOf(studentClass, studentClass.length + 1);
        Scanner newStudentName = new Scanner(System.in);
        System.out.println("Введите имя студента");
        String newStudentNameValue = newStudentName.nextLine();
        Scanner newStudentAge = new Scanner(System.in);
        System.out.println("Введите возраст студента");
        int newStudentAgeValue = newStudentAge.nextInt();
        Student newStudent = new Student(newStudentNameValue, newStudentAgeValue, "", 0);
        newStudentClass[studentClass.length] = newStudent;
        studentClass = Arrays.copyOf(newStudentClass, newStudentClass.length);
    }

    public void newTeacherAdd() {
        Teacher[] newTeacherPool = Arrays.copyOf(teacherPool, teacherPool.length + 1);
        Scanner newTeacherName = new Scanner(System.in);
        System.out.println("Введите имя преподователя");
        String newTeacherNameValue = newTeacherName.nextLine();
        Scanner newTeacherAge = new Scanner(System.in);
        System.out.println("Введите возраст преподавателя");
        int newTeacherAgeValue = newTeacherAge.nextInt();
        Teacher newTeacher = new Teacher(newTeacherNameValue, newTeacherAgeValue, "");
        newTeacherPool[teacherPool.length] = newTeacher;
        teacherPool = Arrays.copyOf(newTeacherPool, newTeacherPool.length);
    }

    public void Study() {
        director.letTheLessonBegin();
        for (Teacher a : teacherPool) {
            for (Student
                    b : studentClass) {
                if (a.getLessonTitle().equals(b.getLessonTitle())) {
                    a.teach(b);
                }
                director.letTheLessonEnd();
            }
        }
    }
}


