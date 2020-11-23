package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestZipCodeWilmington {
    @Before
    public void setup(){
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testFireStaff(){
        setup();
       assertTrue(ZipCodeWilmington.getInstructors().isEmpty());
    }

    @Test
    public void testHireStaff(){
        assertFalse(ZipCodeWilmington.getInstructors().isEmpty());
    }
}
