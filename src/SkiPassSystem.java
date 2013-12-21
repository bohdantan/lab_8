import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class keeps ski passes and statistics.
 * It can create new ski pass, block ski pass, return ski pass by id.
 * All field and methods are static.
 * No instance of this class can be created.
 */
public class SkiPassSystem {
    private static ArrayList<SkiPass> list = new ArrayList<SkiPass>();
    private static ArrayList<Stats> stats = new ArrayList<Stats>();

    private SkiPassSystem() {}

    public static SkiPass create(SkiPassType type, int ... args) {
        SkiPass sp;
        if (type.getDaysOrLifts() == DaysOrLifts.DAYS) {
            Calendar c;
            switch (type) {
                case WORKING_HALF_DAY:
                case WEEKEND_HALF_DAY:
                    if (args.length != 4)
                        throw new IllegalNumberOfArguments();
                    if (args[3] != 9 && args[3] != 13)
                        throw new IllegalArgumentException();
                    c = new GregorianCalendar(args[0], args[1], args[2], args[3], 0);
                    break;
                case WORKING_1_DAY:
                case WEEKEND_1_DAY:
                case WORKING_2_DAYS:
                case WEEKEND_2_DAYS:
                case WORKING_5_DAYS:
                    if (args.length != 3)
                        throw new IllegalNumberOfArguments();
                    c = new GregorianCalendar(args[0], args[1], args[2]);
                    break;
                case SEASON:
                    if (args.length != 1)
                        throw new IllegalNumberOfArguments();
                    c = new GregorianCalendar(args[0], 10, 1);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
            sp = new DaysSkiPass(type, c);
        } else {
            sp = new LiftsSkiPass(type);
        }
        list.add(sp);
        return sp;
    }

    public static SkiPass findById(int id) {
        return list.get(id);
    }

    public static void block(int id) {
        list.get(id).valid = false;
    }

    public static void addStats(int id, SkiPassType type, Calendar c, boolean permission) {
        stats.add(new Stats(id, type, c, permission));
    }

    public static void printStats() {
        SimpleDateFormat sdf = new SimpleDateFormat(" yyyy.M.dd HH:mm:ss ");
        for (Stats e : stats) {
            System.out.println(e.id + " " + e.type.name() + sdf.format(e.c.getTime())
                    + (e.permission ? "permitted" : "forbidden"));
        }
    }

    public static void printStats(SkiPassType type) {
        SimpleDateFormat sdf = new SimpleDateFormat(" yyyy.M.dd HH:mm:ss ");
        for (Stats e : stats) {
            if (e.type == type)
                System.out.println(e.id + " " + e.type.name() + sdf.format(e.c.getTime())
                        + (e.permission ? "permitted" : "forbidden"));
        }
    }
}
