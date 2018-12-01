package ch13.work.command;

public class BuyWheat implements CommodityOrders {
    private final String CommodityName =  "Wheat";
    private double dailyPrice;
    private Commodity c;
    private int qty;

    BuyWheat (Commodity com, int quantity) {
        qty = quantity;
        dailyPrice = 2.34;
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
