/**
 * This class extends SkiPass.
 * It is used for ski passes for lifts.
 */
public class LiftsSkiPass extends SkiPass {
    private int liftsLeft;

    public LiftsSkiPass(SkiPassType type) {
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
