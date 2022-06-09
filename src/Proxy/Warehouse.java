package Proxy;

import java.util.Hashtable;

public class Warehouse implements IOrder{
    Hashtable<String, Integer> stock;
    private String address;
    


    @Override
    public void fulfillOrder(Order order) {
        // iterate through stock
        // if item is in stock, fulfill order
        // else, throw exception

        if(stock.containsKey(order.getName())){
            if(stock.get(order.getName()) > 0){
                stock.put(order.getName(), stock.get(order.getName()) - 1);
                System.out.println("Fulfilling order: " + order.getName());
            }
            else{
                System.out.println("Out of stock: " + order.getName());
            }
        }
        else{
            System.out.println("Item not in stock: " + order.getName());
        }


    }
    public Integer currentInventory(String item){
            return stock.get(item);
    }
}