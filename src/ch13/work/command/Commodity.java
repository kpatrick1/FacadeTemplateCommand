package ch13.work.command;

public class Commodity {


    public void buy(CommodityOrders c){
        System.out.println(c.getCommodityName() + " Commodity Bought at: " + c.getPrice());
    }
    public void sell(CommodityOrders c){
        System.out.println(c.getCommodityName() + " Commodity Sold at: " + c.getPrice());
    }


}
