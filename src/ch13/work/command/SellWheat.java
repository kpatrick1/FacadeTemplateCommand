package ch13.work.command;

public class SellWheat implements CommodityOrders{
    private final String CommodityName =  "Wheat";
    private double dailyPrice;
    private Commodity c;
    private int qty;

    SellWheat (Commodity com, int quantity) {
        qty = quantity;
        dailyPrice = 2.44;
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
