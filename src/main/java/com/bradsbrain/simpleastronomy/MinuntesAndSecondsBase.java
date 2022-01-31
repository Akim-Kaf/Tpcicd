package com.bradsbrain.simpleastronomy;

public abstract class MinuntesAndSecondsBase {

    private int minutes;
    private int seconds;

    public int getMinutes() {
        return minutes;
    }

    protected void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    protected void setSeconds(int seconds) {
        this.seconds = seconds;
    }

}
