package com.ironyard;

public class Marines extends Soldier implements ShootWeapon, DropBomb {

    public Marines(String name, String rank, int serial) {
        super(name, rank, serial);
    }

    @Override
    public String speak() {
        return "Hoowah!";
    }

    @Override
    public String gun() {
        return "Shot...";
    }

    @Override
    public String grenadeLauncher() {
        return "Woosh...";
    }

    @Override
    public String scatterBomb() {
        return "Lots of noise.";
    }

    @Override
    public String aBomb() {
        return "Big Noise";
    }

    @Override
    public String flameThrower() {
        return "Flame Thrower is Broken.";
    }
}
