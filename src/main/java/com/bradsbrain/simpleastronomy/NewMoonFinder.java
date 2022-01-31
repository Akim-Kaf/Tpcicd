package com.bradsbrain.simpleastronomy;

/**
 * Provides a new moon finding calculation for use in a binary search.
 */
public class NewMoonFinder implements MoonFinder {

    /** {@inheritDoc} */
    public boolean isMoonBefore(double angle, double unused) {
        return 180 >= angle;
    }

}
