package com.company;

public class Main {

    public static void main(String[] args) {
        //Create a pilot
        Pilot pilot1 = new Pilot("Niels", "16/03/2002");
        System.out.println(pilot1.toString());

        //Create a weapon
        Weapon boardGun = new Weapon("Board Gun");
        Weapon bomb = new Weapon("Bomb");

        //Create a F16
        F16 f16 = new F16("F-16 Fighting Falcon", 7000, 100);
        f16.setPilot(pilot1);
        f16.setWeapons(boardGun, bomb, null);
        System.out.println(f16.weaponsToString());

        // use weapons
        f16.useWeapons();

        //take off and land
        System.out.println(f16.getFuelCapacity());
        System.out.println(f16.getFuelLevel());
        f16.toTakeOff();
        f16.toLand();
        System.out.println(f16.getFuelLevel());
        f16.refull();
        System.out.println(f16.getFuelLevel());

        //F16 to string
        System.out.println(f16.toString());

        //Create Spitfire
        Spitfire spitfire = new Spitfire("Supermarine Spitfire", 1000, 100);

    }
}
