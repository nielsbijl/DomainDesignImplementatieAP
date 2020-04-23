package com.company;

import java.util.Date;

public class Pilot {
    private String name;
    private String dateOfBirth;

    public Pilot(String Name, String DatOfBirth){
        name = Name;
        dateOfBirth = DatOfBirth;
    }
    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String toString(){
        return String.format("The name of the pilot: %s. His date of birth: %s", name, dateOfBirth);
    }
}
