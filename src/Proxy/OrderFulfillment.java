package Proxy;

import java.util.ArrayList;

public class OrderFulfillment implements IOrder{
    ArrayList<Warehouse> warehouses;

    public OrderFulfillment(){
        warehouses = new ArrayList<Warehouse>();
    }

    @Override
    public void fulfillOrder(Order order) {

    }
}
