package service;

import model.Student;

public class StudentService implements StudentServiceInterface {
    @Override
    public void print(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    @Override
    public Student[] split(String[] arr) {

        Student[] students = new Student[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String[] strings = arr[i].split(",");
            Student student = new Student();
            student.setName(strings[0]);
            student.setAge(Integer.parseInt(strings[1]));
            students[i] = student;
        }
        return students;
    }
}

