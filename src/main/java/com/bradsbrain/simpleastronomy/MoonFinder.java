package com.bradsbrain.simpleastronomy;

/**
 * An interface for searching for a moon phase for use in a binary search.
 */
public interface MoonFinder {

    /**
     * Determines if the desired moon type is earlier or later than the given information.
     * 
     * @param angle a moon angle
     * @param percent a moon visible percentage
     * @return true if the moon is earlier in time than the supplied information
     */
    boolean isMoonBefore(double angle, double percent);

}
