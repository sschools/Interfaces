package com.ironyard;

public class ArmyBoxer extends Soldier implements Punch, Hit {

    public ArmyBoxer(String name, String rank, int serial) {
        super(name, rank, serial);
    }

    @Override
    public String left() {
        return "He connects with a left hook.";
    }

    @Override
    public String speak() {
        return "Cut me Mick.";
    }

}
