package com.company;

public class Weapon {
    private String weaponType;
    public Weapon(String TypeOfWeapon){
        this.weaponType = TypeOfWeapon;
    }
    public void explode(){
        System.out.println(String.format("Shooting weapon: %s........BOOMMMM!!!", weaponType));
    }
    public String getWeaponType(){
        return weaponType;
    }
    public String toString(){
        return ("This weapon is a: " + weaponType);
    }
    public boolean equals(Weapon anotherWeapon) {
        return this == anotherWeapon;
    }


}
