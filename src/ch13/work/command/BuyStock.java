package ch13.work.command;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock, int quantity){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}