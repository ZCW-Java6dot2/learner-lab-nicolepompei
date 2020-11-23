package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    ArrayList<Student> students = TechConnect.getStudents();
    ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructors();
    private HashMap<String, Person> roster = new HashMap<String, Person>();

    public ClassRoom(){
        roster = new HashMap<String, Person>();
    }

    public HashMap<String, Person> getRoster(){
        for (Student element : students) {
            roster.put(element.getName(), element);
        }
        for (Instructor element : instructors) {
            roster.put(element.getName(), element);
        }
        return roster;
    }
}
