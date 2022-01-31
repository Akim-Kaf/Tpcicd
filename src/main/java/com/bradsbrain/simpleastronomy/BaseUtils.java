package com.bradsbrain.simpleastronomy;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class BaseUtils {

    public static double exactDaysSince(ZonedDateTime myCal, double epoch) {
        return JulianDate.makeJulianDateUsingMyModified(myCal) - epoch;
    }

    public static double adjustTo360Range(double valToAdjust) {
        double howMany = Math.floor(valToAdjust / 360);
        return valToAdjust - (howMany * 360);
    }

    public static double sinDegrees(double angleInDegrees) {
        return Math.sin(Math.toRadians(angleInDegrees));
    }

    public static double cosDegrees(double angleInDegrees) {
        return Math.cos(Math.toRadians(angleInDegrees));
    }

    public static double useLessPrecision(double d, int precision) {
        double digits = Math.pow(10, precision);
        return Math.round(d * digits) / digits;
    }

    /**
     * Useful date-to-string formatting which I found myself using a lot
     *
     * @param moonDate the date to format
     * @return the date in GMT timezone
     */
    public static String formatDateForGMT(ZonedDateTime moonDate) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return moonDate.withZoneSameInstant(ZoneOffset.UTC).format(df);
    }

    /**
     * Useful date-to-string formatting which I found myself using a lot
     *
     * @param moonDate date to format
     * @param tz the timezone with which to format the date
     * @return the date in whatever timezone is default
     */
    public static String formatDateAsShortDateLocalTime(ZonedDateTime moonDate, ZoneId tz) {
        return moonDate.withZoneSameInstant(tz).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
}
