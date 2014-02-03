package parameters;

import ski_pass.SkiPassType;

/**
 * This class is used to send parameters of half day ski passes to create method.
 */
public class HalfDayParameters extends Parameters{
    private int year;
    private int month;
    private int day;
    private int hour;

    public HalfDayParameters(SkiPassType type, int year, int month, int day, int hour) {
        super(type);
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }
}
