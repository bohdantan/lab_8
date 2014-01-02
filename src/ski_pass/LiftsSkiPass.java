package ski_pass;

/**
 * This class extends SkiPass.
 * It is used for ski passes for lifts.
 */
public class LiftsSkiPass extends SkiPass {
    private int liftsLeft;

    public LiftsSkiPass(int id, SkiPassType type) {
        this.id = id;
        this.type = type;
        this.liftsLeft = type.getValue();
    }

    public int getLiftsLeft() {
        return liftsLeft;
    }

    public void decLiftsLeft() {
        --liftsLeft;
    }
}
