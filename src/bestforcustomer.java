public class bestforcustomer implements discountable {
    private double percentage;
    private double threshoold;
    private double discount;

    public bestforcustomer() {
    }

    public bestforcustomer(double percentage, double threshoold, double discount) {
        this.percentage = percentage;
        this.threshoold = threshoold;
        this.discount = discount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getThreshoold() {
        return threshoold;
    }

    public void setThreshoold(double threshoold) {
        this.threshoold = threshoold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double discountedprice(double price) {

        if(percentage>=threshoold){
            percentagediscount d = new percentagediscount(percentage);
            double c = d.discountedprice(price);
            return c;
        }
        else {
            ThresholdDiscount e = new ThresholdDiscount(threshoold,discount);
            double f = e.discountedprice(price);
            return f;
        }


    }
}


