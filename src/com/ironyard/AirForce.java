package com.ironyard;

public class AirForce extends Soldier implements DropBomb {

    public AirForce(String name, String rank, int serial) {
        super(name, rank, serial);
    }

    @Override
    public String speak() {
        return "The only way to fly.";
    }

    @Override
    public String scatterBomb() {
        return "The Air Force dropped a scatterbomb";
    }

    @Override
    public String aBomb() {
        return "Enola Gay...";
    }
}
