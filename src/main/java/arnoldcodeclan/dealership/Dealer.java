package arnoldcodeclan.dealership;

public class Dealer extends Person {

    private double commissionRate;
    private double totalCommission;

    public Dealer(String name, double commissionRate) {
        super(name);
        this.commissionRate = commissionRate;
        this.totalCommission = 0;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getTotalCommission() {
        return totalCommission;
    }

    public void addCommission(double commission) {
        this.totalCommission += commission;
    }
}
