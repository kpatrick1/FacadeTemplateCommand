package ch13.work.command;

public class BuyCorn implements CommodityOrders {
    private final String CommodityName =  "Corn";
    private double dailyPrice;
    private Commodity c;
    private int qty;

    BuyCorn (Commodity com,  int quantity) {
        qty = quantity;
        dailyPrice = 0.34;
        this.c = com;

    }

    public void execute() {
        c.buy(this);
    }

    @Override
    public double getPrice() {
        return dailyPrice * qty;
    }

    @Override
    public String getCommodityName() {
        return CommodityName;
    }


}
