package com.company;

import java.util.ArrayList;
import java.util.List;

public class Students {
    String name;
    String id;
    int age;
    double averageGrade;
    List<Double> grades = new ArrayList<>();



    public Students(String _name, String _id, int _age, List<Double> _Grades) {
        this.name = _name;
        this.id = _id;
        this.age = _age;
        this.grades = _Grades;

    }

    public Students(String _name, String _id, int _age) {
        this.name = _name;
        this.id = _id;
        this.age = _age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageGrade() {
        setAverageGrade();
        return this.averageGrade;
    }

    public void setAverageGrade() {
        double num = 0;
        for(Double x : grades){
           num += x;
        }
        this.averageGrade = (num / grades.size());
    }

    public void setgrade(Double grade){
        grades.add(grade);
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
