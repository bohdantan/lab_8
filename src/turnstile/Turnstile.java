package turnstile;

import ski_pass.*;
import ski_system.SkiPassSystem;

import java.util.Calendar;

/**
 * This class is used for Turnstile.
 * It checks if someone can pass by his ski pass.
 */
public class Turnstile {
    public boolean requestPermission(SkiPass sp) {
        Calendar currentTime = Calendar.getInstance();
        boolean permission;
        if (!sp.getValid()) {
            SkiPassSystem.addStats(sp.getId(), sp.getType(), currentTime, false);
            return false;
        }
        if (sp.getType().getWorkingOrWeekend() == WorkingOrWeekend.WORKING &&
                (currentTime.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                 || currentTime.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
            SkiPassSystem.addStats(sp.getId(), sp.getType(), currentTime, false);
            return false;
        }
        if (sp.getType().getDaysOrLifts() == DaysOrLifts.DAYS) {
            DaysSkiPass dsp = (DaysSkiPass) sp;
            permission = currentTime.compareTo(dsp.getBeginDate()) >= 0 && currentTime.compareTo(dsp.getEndDate()) <= 0;
        } else {
            LiftsSkiPass lsp = (LiftsSkiPass) sp;
            if (lsp.getLiftsLeft() > 0) {
                lsp.decLiftsLeft();
                permission = true;
            } else
                permission = false;
        }
        SkiPassSystem.addStats(sp.getId(), sp.getType(), currentTime, permission);
        return permission;
    }
}
