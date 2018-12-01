package ch13.work.command;

public class SellCorn implements CommodityOrders {
    private final String CommodityName =  "Corn";
    private double dailyPrice;
    private Commodity c;
    private int qty;

    SellCorn (Commodity com,  int quantity) {
        qty = quantity;
        dailyPrice = 0.29;
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
