package com.company;

import java.util.ArrayList;
import java.util.List;

public class Students {

    String id;
    double averageGrade;
    List<Double> grades = new ArrayList<>();



    public Students( String _id, List<Double> _Grades) {
       this.id = _id;
        this.grades = _Grades;

    }

    public Students(String _id){
        this.id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

                ", id='" + id + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
