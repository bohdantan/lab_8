import java.util.Calendar;

/**
 * This class is used for Turnstile.
 * It checks if someone can pass by his ski pass.
 */
public class Turnstile {
    public boolean requestPermission(int id) {
        Calendar currentTime = Calendar.getInstance();
        SkiPass sp;
        try {
            sp = SkiPassSystem.findById(id);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        }
        boolean permission;
        if (!sp.valid) {
            SkiPassSystem.addStats(id, sp.type, currentTime, false);
            return false;
        }
        if (sp.type.getWorkingOrWeekend() == WorkingOrWeekend.WORKING &&
                (currentTime.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                 || currentTime.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
            SkiPassSystem.addStats(id, sp.type, currentTime, false);
            return false;
        }
        if (sp.type.getDaysOrLifts() == DaysOrLifts.DAYS) {
            DaysSkiPass dsp = (DaysSkiPass) sp;
            if (currentTime.compareTo(dsp.getBeginDate()) >= 0 && currentTime.compareTo(dsp.getEndDate()) <= 0)
                permission = true;
            else
                permission = false;
        } else {
            LiftsSkiPass lsp = (LiftsSkiPass) sp;
            if (lsp.getLiftsLeft() > 0) {
                lsp.decLiftsLeft();
                permission = true;
            } else
                permission = false;
        }
        SkiPassSystem.addStats(id, sp.type, currentTime, permission);
        return permission;
    }
}
