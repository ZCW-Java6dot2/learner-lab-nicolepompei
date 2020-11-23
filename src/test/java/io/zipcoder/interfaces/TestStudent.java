package io.zipcoder.interfaces;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class TestStudent {
    Student student = new Student("Pompy");
    @Test
    public void testImplementation(){
        assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){

        assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn(){
        //Given
        double expected = 5;
        //when
        student.learn(expected);
        double actual = student.getTotalStudyTime();

        assertEquals(expected, actual);
    }



}
