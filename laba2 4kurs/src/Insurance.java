import java.io.Serializable;

public class Insurance implements Serializable {
    private String type;
    private int coverage;

    public Insurance(String type, int coverage) {
        this.type = type;
        this.coverage = coverage;
    }

    public String getType() {
        return type;
    }

    public int getCoverage() {
        return coverage;
    }
}