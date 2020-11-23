package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import io.zipcoder.interfaces.ClassRoom;
import java.util.*;

public class TestClassRoom {
    ClassRoom classroom;
  @Before
  public void setUp(){
   //   classroom = new ClassRoom();
  }
    @Test
    public void TestClassRoom(){
      ArrayList<Person> rosterTest = new ArrayList<Person>();
      rosterTest.addAll(ZipCodeWilmington.getInstructors());
      rosterTest.addAll(TechConnect.getStudents());

      for(Person element: classroom.getRoster().values()){
          Assert.assertTrue(rosterTest.contains(element));
      }
    }
        //can compare the two string method of the maps
        //map.toString and compare the results

    }

