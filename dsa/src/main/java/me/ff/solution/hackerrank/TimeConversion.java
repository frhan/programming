package me.ff.solution.hackerrank;

/*
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion
{
    public static String timeConversion(String s){

        if (s == null)
            return null;

        String[] split = s.split(":");
        if (split.length != 3)
            return null;
        int hh = Integer.valueOf(split[0]);
        if (!(hh >= 01 || hh <= 12))
            return null;
        int mm = Integer.valueOf(split[1]);
        if (!(mm >= 00 || mm <= 59))
            return null;
        String third = split[2];

        int ss = Integer.valueOf(third.substring(0, 2));
        if (!(ss <= 59))
            return null;

        if (third.substring(2,4).equalsIgnoreCase("PM"))
            hh += 12;

       return hh+":"+mm+":"+ss;

    }
}
