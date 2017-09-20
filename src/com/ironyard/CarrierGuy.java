package com.ironyard;

public class CarrierGuy extends Soldier implements ShootFromPlane {

    public CarrierGuy(String name, String rank, int serial) {
        super(name, rank, serial);
    }

    @Override
    public Bomb loadBomb() {
        Bomb newBomb = new Bomb(250, 20);
        return newBomb;
    }

    @Override
    public String gun() {
        return "I don't have a gun.";
    }

    @Override
    public String grenadeLauncher() {
        return "No launcher.";
    }

    @Override
    public String speak() {
        return "It is loud out here!";
    }
}
