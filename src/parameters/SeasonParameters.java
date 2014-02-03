package parameters;

import ski_pass.SkiPassType;

/**
 * This class is used to send parameters of season ski passes to create method.
 */
public class SeasonParameters extends Parameters{
    private int year;

    public SeasonParameters(SkiPassType type, int year) {
        super(type);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
