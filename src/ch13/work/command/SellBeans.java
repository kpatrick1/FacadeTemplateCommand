package ch13.work.command;

public class SellBeans implements CommodityOrders {
    private final String CommodityName =  "Beans";
    private double dailyPrice;
    private Commodity c;
    private int qty;

    SellBeans (Commodity com, int quantity) {
        qty = quantity;
        dailyPrice = 0.34;
        this.c = com;
    }

    public void execute() {
        c.sell(this);
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
