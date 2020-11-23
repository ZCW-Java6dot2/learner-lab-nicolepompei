package io.zipcoder.interfaces;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class TestPerson {


    @Test
    public void testConstructor(){
        //Given
        Person person = new Person("Pompy");
        //When
        String expected = "Pompy";
        //Then
        String actual = person.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        //Given
        Person person = new Person("");
        //When
        String expected = "Pompy";
        //Then
        person.setName("Pompy");
        String actual = person.getName();

        Assert.assertEquals(expected, actual);


    }

}
