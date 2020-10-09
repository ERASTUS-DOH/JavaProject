package com.company;

import java.util.*;

public class Lecture {
    private List<Students> currentStudents = new ArrayList<Students>();

    public void enter(Students sample){
        this.currentStudents.add(sample);
    }

    public double getHighestAverageGrade(){
        List<Double> averageScores = new ArrayList<>();
        for(Students x : currentStudents){
            double averageScorePerStudent = x.getAverageGrade();
            averageScores.add(averageScorePerStudent);
        }
        Collections.sort(averageScores);
        return averageScores.get(averageScores.size()-1);
    }
}
