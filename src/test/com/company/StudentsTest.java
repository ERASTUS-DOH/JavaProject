package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @Test
    void getAverageGrade() {
        Students student = new Students("nana","ps/itc/16/0031",12);
        student.setgrade(98.0);
        student.setgrade(98.0);
        student.setgrade(98.0);
        student.setgrade(98.0);
        student.setgrade(98.0);
        assertEquals(98, student.getAverageGrade());
    }
}