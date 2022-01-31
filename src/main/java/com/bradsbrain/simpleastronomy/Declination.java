package com.bradsbrain.simpleastronomy;

public class Declination extends MinuntesAndSecondsBase {
    private int degrees;

    public Declination(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getDegrees() {
        return degrees;
    }

}
