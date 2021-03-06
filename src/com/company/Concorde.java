package com.company;

public class Concorde implements Airplane {
    private String type;
    final int fuelCapacity;
    public int fuelLevel;
    private Pilot pilot;

    public Concorde(String type, int fuelCapacity, int fuelLevel) {
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void toTakeOff() {
        System.out.println("The " + type + " is ready to take off!!");
        if (fuelLevel < 20){
            System.out.println("There is not enough full to take off, please refull the plane");
        }
        else {
            fuelLevel -= 20;
        }
    }

    @Override
    public void toLand() {
        System.out.println("The " + type + " has landed save!!");
    }

    @Override
    public void refull() {
        System.out.println("refulling the " + type + ".......");
        fuelLevel = 100;
    }

    @Override
    public void setPilot(Pilot pilotOfThePlane){
        this.pilot = pilotOfThePlane;
    }

    @Override
    public String getFuelCapacity() {
        return "The fuel capacity = " + fuelCapacity;
    }

    @Override
    public String getFuelLevel() {
        return "The fuel level = " + fuelLevel;
    }
    public String toString(){
        return type + "  " + getFuelCapacity() + "  " + getFuelLevel() + "  " +  pilot;
    }
    public boolean equals(Concorde anotherConcorde){
        return this == anotherConcorde;
    }
}
