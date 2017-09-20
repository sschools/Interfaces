package com.ironyard;

public abstract class Soldier {
    private String name;
    private String rank;
    private int serial;

    public Soldier(String name, String rank, int serial) {
        this.name = name;
        this.rank = rank;
        this.serial = serial;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getSerial() {
        return serial;
    }

    public String sleep() {
        return "ZZZzzz";
    }

    public String eat() {
        return "Tasty delicious";
    }

    public String march() {
        return "Slept late. Feel great.";
    }

    public abstract String speak();
}
