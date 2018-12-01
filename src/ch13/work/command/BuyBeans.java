package ch13.work.command;

public class BuyBeans implements CommodityOrders {
    private final String CommodityName =  "Beans";
    private double dailyPrice;
    private Commodity c;
    private int qty;

    BuyBeans (Commodity com, int quantity) {
        qty = quantity;
        dailyPrice = 1.29;
        this.c = com;
    }

    public void execute() {
        c.buy(this);
    }

    @Override
    public double getPrice() {
        return this.dailyPrice * this.qty;
    }

    @Override
    public String getCommodityName() {
        return CommodityName;
    }
}
