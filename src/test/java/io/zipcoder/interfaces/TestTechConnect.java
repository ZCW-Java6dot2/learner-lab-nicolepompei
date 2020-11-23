package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestTechConnect {

    @Test
    public void testRecruitStudent(){

        assertFalse(TechConnect.getStudents().isEmpty());
    }

    @Before
    public void setup(){
    //  TechConnect.removeStudents();
    }

    @Test
    public void testRemoveStudents(){

        setup();
        assertTrue(TechConnect.getStudents().isEmpty());
    }


}
