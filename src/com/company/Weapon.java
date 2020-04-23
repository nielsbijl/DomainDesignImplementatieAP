package com.company;

public class Weapon {
    private String weaponType;
    public Weapon(String TypeOfWeapon){
        weaponType = TypeOfWeapon;
    }
    public void explode(){
        System.out.println(String.format("Shooting weapon: %s........BOOMMMM!!!", weaponType));
    }
    public String getWeaponType(){
        return weaponType;
    }
//    public String toString(){
//        return String.format("This weapon is a: %s", weaponType);
//    }
}
