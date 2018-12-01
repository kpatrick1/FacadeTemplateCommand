package ch13.work.command;

import java.util.ArrayList;
import java.util.List;

public class CommodityManager {
    private List<CommodityOrders> orderList = new ArrayList<CommodityOrders>();

    public void takeOrder(CommodityOrders order){
        orderList.add(order);
    }

    public void placeOrders(){
        double total = 0;
        for (CommodityOrders order : orderList) {
            total += order.getPrice();
            order.execute();
        }
        orderList.clear();
        System.out.println("Total Orders: " + total);
    }
}
