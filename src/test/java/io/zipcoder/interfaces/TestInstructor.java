package io.zipcoder.interfaces;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class TestInstructor {
    Instructor instructor = new Instructor("");
    Student student = new Student("Pompy");

    @Test
    public void testImplementation(){
        assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        //Given
        double expectedTotalStudyTime = 5;
        //When
        instructor.teach(student, expectedTotalStudyTime);
        //Then
        double actualTotalStudyTime = student.getTotalStudyTime();

        assertEquals(expectedTotalStudyTime, actualTotalStudyTime);

    }

    @Test
    public void testLecture(){
        //Given
        Student pompy = new Student("Pompy");
        Student buzz = new Student("Buzz");
        Student christian = new Student("Christian");
        Student[] students = {pompy, buzz, christian};
        //when
        double expectedTotalNumberOfHours = 9;
        double expectedNumberOfHoursPerStudent = 3;
        //then
      instructor.lecture(students, expectedTotalNumberOfHours);
      double actualNumberOfHoursPerStudent = pompy.getTotalStudyTime();

      assertEquals(expectedNumberOfHoursPerStudent, actualNumberOfHoursPerStudent);

    }
}
