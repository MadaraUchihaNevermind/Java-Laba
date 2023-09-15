import java.io.*;

class InsuranceContract implements Serializable {
    private double coverageAmount;
    private String type;

    public InsuranceContract(double coverageAmount, String type) {
        this.coverageAmount = coverageAmount;
        this.type = type;
    }

    public double getCoverageAmount() {
        return coverageAmount;
    }

    public String getType() {
        return type;
    }
}