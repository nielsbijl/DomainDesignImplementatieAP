package com.company;


import java.util.ArrayList;
import java.util.List;

public class F16 implements Airplane{
    private String type;
    final int fuelCapacity;
    public int fuelLevel = 100;
    private Pilot pilot;
    private List<Weapon> weapons;


    public F16(String AirplaneType, int FuelCapacity, int FuelLevel){
        type = AirplaneType;
        fuelCapacity = FuelCapacity;
        fuelLevel = FuelLevel;
    }
    public void setWeapons(Weapon weapon1, Weapon weapon2, Weapon weapon3){
        List<Weapon> newWeaponsList = new ArrayList<Weapon>();
        if (weapon1 != null){
            newWeaponsList.add(weapon1);
        }
        if (weapon2 != null){
            newWeaponsList.add(weapon2);
        }
        if (weapon3 != null){
            newWeaponsList.add(weapon3);
        }
        weapons = newWeaponsList;
    }

    public List<Weapon> getWeapons(){
        List<Weapon> weaponsList = new ArrayList<Weapon>();
        try {
            weaponsList = weapons;
        }
        catch (Exception e){
            System.out.println(e);
            weaponsList = null;
        }
        return weaponsList;
    }
    public List<String> weaponsToString(){
        List<String> weaponsListString = new ArrayList<String>();
        if (weapons == null) {
            System.out.println("There are no weapons on board");
            weaponsListString = null;
        }
        else {
            for (Weapon weaponListItem : weapons){
                weaponsListString.add(weaponListItem.getWeaponType());
            }
        }
        return weaponsListString;
    }
    public void useWeapons(){
        if (weapons == null) {
            System.out.println("There are no weapons on board!");
        }
        else {
            for (Weapon weapons : weapons){
                weapons.explode();}
        }
    }
    public String getFuelCapacity(){
        return "The fuel capacity = " + fuelCapacity;
    }
    public String getFuelLevel(){
        return "The fuel level = " + fuelLevel;
    }

    public String toString(){
        return type + "  " + getFuelCapacity() + "  " + getFuelLevel() + "  " +  pilot + "  " + "The weapons on board: " + weaponsToString();
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
        pilot = pilotOfThePlane;
    }

    public boolean equals(F16 anotherF16) {
        if (this == anotherF16) {
            return true;
        }
        return false;
    }
}
