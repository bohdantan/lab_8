/**
 * Created with IntelliJ IDEA.
 * Date: 15.12.13
 * Time: 17:47
 * User: user
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String ... args) {
        Turnstile t = new Turnstile();
        Turnstile t2 = new Turnstile();

        SkiPassSystem.create(SkiPassType.SEASON, 2013);
        System.out.println(t.requestPermission(0));
        SkiPassSystem.block(0);
        System.out.println(t.requestPermission(0));

        SkiPassSystem.create(SkiPassType.WORKING_1_DAY, 2013, 11, 17);
        System.out.println(t.requestPermission(1));

        SkiPassSystem.create(SkiPassType.WORKING_1_DAY, 2013, 11, 18);
        System.out.println(t.requestPermission(2));

        SkiPassSystem.create(SkiPassType.WORKING_1_DAY, 2013, 11, 19);
        System.out.println(t.requestPermission(3));

        SkiPassSystem.printStats();
    }
}
