package ski_pass;

/**
 * This enum enumerates types of ski passes.
 */
public enum SkiPassType {
    WORKING_HALF_DAY(WorkingOrWeekend.WORKING, DaysOrLifts.DAYS, 4),
    WORKING_1_DAY(WorkingOrWeekend.WORKING, DaysOrLifts.DAYS, 24),
    WORKING_2_DAYS(WorkingOrWeekend.WORKING, DaysOrLifts.DAYS, 48),
    WORKING_5_DAYS(WorkingOrWeekend.WORKING, DaysOrLifts.DAYS, 120),
    WORKING_10_LIFTS(WorkingOrWeekend.WORKING, DaysOrLifts.LIFTS, 10),
    WORKING_20_LIFTS(WorkingOrWeekend.WORKING, DaysOrLifts.LIFTS, 20),
    WORKING_50_LIFTS(WorkingOrWeekend.WORKING, DaysOrLifts.LIFTS, 50),
    WORKING_100_LIFTS(WorkingOrWeekend.WORKING, DaysOrLifts.LIFTS, 100),

    WEEKEND_HALF_DAY(WorkingOrWeekend.WEEKEND, DaysOrLifts.DAYS, 4),
    WEEKEND_1_DAY(WorkingOrWeekend.WEEKEND, DaysOrLifts.DAYS, 24),
    WEEKEND_2_DAYS(WorkingOrWeekend.WEEKEND, DaysOrLifts.DAYS, 48),
    WEEKEND_10_LIFTS(WorkingOrWeekend.WEEKEND, DaysOrLifts.LIFTS, 10),
    WEEKEND_20_LIFTS(WorkingOrWeekend.WEEKEND, DaysOrLifts.LIFTS, 20),
    WEEKEND_50_LIFTS(WorkingOrWeekend.WEEKEND, DaysOrLifts.LIFTS, 50),
    WEEKEND_100_LIFTS(WorkingOrWeekend.WEEKEND, DaysOrLifts.LIFTS, 100),

    SEASON(WorkingOrWeekend.WEEKEND, DaysOrLifts.DAYS, 24*200);

    private WorkingOrWeekend workingOrWeekend; // Indicates if ski pass can be used at weekend
    private DaysOrLifts daysOrLifts;           // Indicates if ski pass is for days or for lifts
    private int value;                         // For ski passes for days value is duration of validity in hours
                                               // for spi passes for lifts value is number of lifts

    SkiPassType(WorkingOrWeekend workingOrWeekend, DaysOrLifts daysOrLifts, int val) {
        this.workingOrWeekend = workingOrWeekend;
        this.daysOrLifts = daysOrLifts;
        value = val;
    }

    public WorkingOrWeekend getWorkingOrWeekend() {
        return workingOrWeekend;
    }

    public DaysOrLifts getDaysOrLifts() {
        return daysOrLifts;
    }

    public int getValue() {
        return value;
    }
}
