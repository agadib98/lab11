public class percentagediscount implements discountable {
    private double percentage;

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public percentagediscount() {
    }

    public percentagediscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double discountedprice(double price) {
        double c = (price*percentage)/100;
        return c;
    }
}
