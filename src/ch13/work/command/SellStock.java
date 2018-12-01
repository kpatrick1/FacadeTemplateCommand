package ch13.work.command;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock, int quantity){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
