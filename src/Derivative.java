import java.io.Serializable;

class Derivative implements Serializable {
    private InsuranceContract insuranceContract;
    private double value;

    public Derivative(InsuranceContract insuranceContract, double value) {
        this.insuranceContract = insuranceContract;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public InsuranceContract getInsuranceContract() {
        return insuranceContract;
    }
}