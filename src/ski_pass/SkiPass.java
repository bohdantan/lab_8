package ski_pass;

/**
 * This abstract class keeps type of ski pass and it's validity.
 */
abstract public class SkiPass {
    protected int id;
    protected SkiPassType type;
    protected boolean valid = true;

    public int getId() {
        return id;
    }

    public SkiPassType getType() {
        return type;
    }

    public boolean getValid() {
        return valid;
    }

    public void block() {
        valid = false;
    }
}
