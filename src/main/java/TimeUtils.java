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
