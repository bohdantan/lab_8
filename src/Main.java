import parameters.DaysParameters;
import parameters.Parameters;
import parameters.SeasonParameters;
import ski_pass.SkiPassType;
import ski_system.SkiPassSystem;
import turnstile.Turnstile;

/**
 *
 */
public class Main {
    public static void main(String ... args) {
        Turnstile t = new Turnstile();
        Turnstile t2 = new Turnstile();

        SkiPassSystem.create(new SeasonParameters(SkiPassType.SEASON, 2013));
        System.out.println(t.requestPermission(SkiPassSystem.findById(0)));
        SkiPassSystem.block(0);
        System.out.println(t.requestPermission(SkiPassSystem.findById(0)));

        SkiPassSystem.create(new DaysParameters(SkiPassType.WORKING_1_DAY, 2014, 1, 2));
        System.out.println(t2.requestPermission(SkiPassSystem.findById(1)));

        SkiPassSystem.create(new DaysParameters(SkiPassType.WORKING_1_DAY, 2014, 1, 3));
        System.out.println(t2.requestPermission(SkiPassSystem.findById(2)));

        System.out.println("All stats:");
        SkiPassSystem.printStats();

        System.out.println("Stats for 1 working day ski passes:");
        SkiPassSystem.printStats(SkiPassType.WORKING_1_DAY);

        SkiPassSystem.create(new Parameters(SkiPassType.WORKING_10_LIFTS));

    }
}
