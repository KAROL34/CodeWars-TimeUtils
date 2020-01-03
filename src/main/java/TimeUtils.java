/*
Given time in seconds, return formatted string, as shown in following example:

####Example: Input: 90061 sec

Output: 1 1 1 1

e.g

    90061 sec: 1 1 1 1 (1 day, 1 hour, 1 min and 1 seconds)
    93784 sec: 1 2 3 4 (1 day, 2 hours, 3 mins, 4 seconds)

####Useful conversions:

60 sec = 1 min
60 min = 1 hour
24 hour = 1 day

Please see included test case for an example.

 */
public class TimeUtils {
    static final int SECONDSINMINUTE=60;
    static final int SECONDSINHOUR=60*60;
    static final int SECONDSINDAY=SECONDSINHOUR*24;

    public static String convertTime(int i) {
        StringBuilder stringBuilder=new StringBuilder();
        int day= i/SECONDSINDAY;
        int hour= i%SECONDSINDAY/SECONDSINHOUR;
        int min=(i-day*SECONDSINDAY-hour*SECONDSINHOUR)/SECONDSINMINUTE;
        int sek=i-day*SECONDSINDAY-hour*SECONDSINHOUR-min*SECONDSINMINUTE;
        return stringBuilder.append(day).append(" ")
                .append(hour).append(" ")
                .append(min).append(" ")
                .append(sek).toString();
    }
}
