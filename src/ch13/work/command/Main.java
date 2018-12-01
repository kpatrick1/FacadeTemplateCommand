package ch13.work.command;

public class Main {

    public static void main(String[] args) {
        //Stock abcStock = new Stock();

        //BuyStock buyStockOrder = new BuyStock(abcStock,10);
        //SellStock sellStockOrder = new SellStock(abcStock,8);

        //Broker broker = new Broker();
        //broker.takeOrder(buyStockOrder);
        //broker.takeOrder(sellStockOrder);

        //broker.placeOrders();
        Commodity com = new Commodity();
        CommodityFactory cf = new CommodityFactory();
        CommodityOrders c1 = cf.getCommodity(com,"buycorn" , 10);
        CommodityOrders c2 = cf.getCommodity(com,"buywheat",15);
        CommodityOrders c3 = cf.getCommodity(com,"buyBeans",7);
        CommodityOrders c4 = cf.getCommodity(com, "sellcorn", 9);

        CommodityManager manager = new CommodityManager();
        manager.takeOrder(c1);
        manager.takeOrder(c1);
        manager.takeOrder(c3);
        manager.takeOrder(c3);
        manager.takeOrder(c3);
        manager.takeOrder(c4);

        manager.placeOrders();




    }

}
