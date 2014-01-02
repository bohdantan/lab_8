package ski_pass;

import java.util.Calendar;

/**
 * This class extends SkiPass.
 * It is used for ski passes for days.
 */
public class DaysSkiPass extends SkiPass {
    private Calendar beginDate;
    private Calendar endDate;

    public DaysSkiPass(int id, SkiPassType type, Calendar c) {
        this.id = id;
        this.type = type;
        beginDate = (Calendar) c.clone();
        endDate = (Calendar) c.clone();
        endDate.add(Calendar.HOUR, type.getValue());
    }

    public Calendar getBeginDate() {
        return beginDate;
    }
    public Calendar getEndDate() {
        return endDate;
    }
}
