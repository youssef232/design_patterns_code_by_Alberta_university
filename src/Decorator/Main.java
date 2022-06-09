package Decorator;

public class Main {

    public static void main(String[] args){
    IPizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.price());
    }
}
