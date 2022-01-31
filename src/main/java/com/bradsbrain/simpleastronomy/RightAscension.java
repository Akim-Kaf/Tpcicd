package com.bradsbrain.simpleastronomy;

public class RightAscension extends MinuntesAndSecondsBase {
    private int hours;

    public RightAscension(int hours, int minutes, int seconds) {
        this.hours = hours;
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }
}
