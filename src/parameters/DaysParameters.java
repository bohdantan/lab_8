package parameters;

import ski_pass.SkiPassType;

/**
 * This class is used to send parameters of days ski passes to create method.
 */
public class DaysParameters extends Parameters{
    private int year;
    private int month;
    private int day;

    public DaysParameters(SkiPassType type, int year, int month, int day) {
        super(type);
        this.year = year;
        this.month = month;
        this.day = day;
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
}
