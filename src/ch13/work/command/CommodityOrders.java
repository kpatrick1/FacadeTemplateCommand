package ch13.work.command;

public interface CommodityOrders {
    void execute();
    double getPrice();
    String getCommodityName();
}
