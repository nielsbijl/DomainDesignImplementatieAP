package com.company;

public class Pilot {
    private String name;
    private String dateOfBirth;

    public Pilot(String Name, String DatOfBirth){
        this.name = Name;
        this.dateOfBirth = DatOfBirth;
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
    public boolean equals(Pilot anotherPilot) {
        if (this == anotherPilot) {
            return true;
        }
        return false;
    }
}
