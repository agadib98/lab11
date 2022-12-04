public class ThresholdDiscount implements  discountable{

    private  double threshold;

    private  double discount;

    public ThresholdDiscount() {
    }

    public ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double discountedprice(double price) {
        if(price>=10000){
            double d = ((price*threshold)/100)+discount;}
        if(price<10000){
            double d = discount;}

        return discount;
    }
}
