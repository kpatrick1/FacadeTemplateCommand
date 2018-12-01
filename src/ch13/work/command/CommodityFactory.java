package ch13.work.command;

public class CommodityFactory {

    public CommodityOrders getCommodity(Commodity c, String commodity, int qty){
        if(commodity == null){
            return null;
        }
        if(commodity.equalsIgnoreCase("BUYBEANS")){
            return new BuyBeans(c, qty);

        } else if(commodity.equalsIgnoreCase("BUYCORN")){
            return new BuyCorn(c, qty);

        } else if(commodity.equalsIgnoreCase("BUYWHEAT")){
            return new BuyWheat(c,qty);
        } else if (commodity.equalsIgnoreCase("SELLBEANS")) {
            return new SellBeans(c,qty);
        } else if (commodity.equalsIgnoreCase("SELLCORN")) {
            return new SellCorn(c,qty);
        } else if (commodity.equalsIgnoreCase("SELLWHEAT")){
            return new SellWheat(c,qty);
        }

        return null;
    }
}
