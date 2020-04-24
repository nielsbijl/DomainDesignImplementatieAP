package com.company;

public class Main {

    public static void main(String[] args) {
        //Create a pilot
        Pilot pilot1 = new Pilot("Niels", "16/03/2002");
        Pilot pilot2 = new Pilot("Erik", "20/05/2000");
        Pilot pilot3 = new Pilot("Stan", "29/04/2001");
        Pilot pilot4 = new Pilot("Kees", "22/09/2000");
        System.out.println(pilot1.toString());

        //Create a weapon
        Weapon boardGun = new Weapon("BoardGun-#1001");
        Weapon bomb = new Weapon("Bomb-#cluster00346");
        Weapon missile = new Weapon("Missile-#heat007654");
        System.out.println(boardGun.equals(boardGun));
        System.out.println(boardGun.equals(missile));

        //Create a F16
        F16 f16 = new F16("F-16 Fighting Falcon", 7000, 100);
        f16.setPilot(pilot1);
        f16.setWeapons(boardGun, bomb, missile);
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

        //Create Spitfire
        Spitfire spitfire = new Spitfire("Supermarine Spitfire", 1000, 100);
        spitfire.setPilot(pilot2);
        spitfire.setWeapons(boardGun, null);


        //Create Concorde
        Concorde concorde = new Concorde("Concorde", 2000, 100);
        concorde.setPilot(pilot3);


        //Create Boeing747
        Boeing747 boeing747 = new Boeing747("Boeing 747", 1500, 100);
        boeing747.setPilot(pilot4);

        //Planes to string
        System.out.println(f16.toString());
        System.out.println(spitfire.toString());
        System.out.println(concorde.toString());
        System.out.println(boeing747.toString());

    }
}
