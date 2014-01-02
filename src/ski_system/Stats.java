package ski_system;

import ski_pass.SkiPassType;

import java.util.Calendar;

/**
 * This class is used to keep statistics in SkiPassSystem
 */
class Stats {
    int id;
    SkiPassType type;
    Calendar c;
    boolean permission;

    public Stats(int id, SkiPassType type, Calendar c, boolean permission) {
        this.id = id;
        this.type = type;
        this.c = c;
        this.permission = permission;
    }
}
