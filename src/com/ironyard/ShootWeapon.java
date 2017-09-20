package com.ironyard;

public interface ShootWeapon {
    public String gun();
    public String grenadeLauncher();

    public default String flameThrower() {
        return "I shoot fire...";
    };
}
