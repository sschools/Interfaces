package com.ironyard;

public class Bomb {
    int weight;
    int length;

    public Bomb(int weight, int length) {
        this.weight = weight;
        this.length = length;
    }

    public String convert() {
        String thisBomb = "Bomb is loaded with a weight of " + this.weight + " and a length of " + this.length;
        return thisBomb;
    }

}
