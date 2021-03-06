package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {

    @Test
    void getHighestAverageGrade() {
        Lecture lect = new Lecture();
        Students nana = new Students( "mp4");
        nana.setgrade(77.0);
        nana.setgrade(85.2);

        Students james = new Students("mp3");
        james.setgrade(75.0);
        james.setgrade(45.2);

        lect.enter(james);
        lect.enter(nana);

        assertEquals(81.1,lect.getHighestAverageGrade());

    }
}