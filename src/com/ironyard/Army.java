package com.ironyard;

public class Army extends Soldier implements ShootWeapon {

    public Army(String name, String rank, int serial) {
        super(name, rank, serial);
    }

    @Override
    public String speak() {
        return "Army training, Sir!";
    }

    @Override
    public String gun() {
        return "Bang, bang.";
    }

    @Override
    public String grenadeLauncher() {
        return "Fire in the hole!";
    }
}
