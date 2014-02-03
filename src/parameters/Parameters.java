package parameters;

import ski_pass.SkiPassType;

/**
 * This class is used to send parameters of ski passes to create method.
 * This class keeps type of ski pass that must be created.
 */
public class Parameters {
    private SkiPassType type;

    public Parameters(SkiPassType type) {
        this.type = type;
    }

    public SkiPassType getType() {
        return type;
    }
}
