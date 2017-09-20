package com.ironyard;

public class Navy extends Soldier implements DropBomb {

    public Navy(String name, String rank, int serial) {
        super(name, rank, serial);
    }

    @Override
    public String speak() {
        return "I feel the need, the need for speed.";
    }

    @Override
    public String scatterBomb() {
        return "B-b-b-b-b-b-b-b-b-bang.";
    }

    @Override
    public String aBomb() {
        return "BOOM!";
    }
}
