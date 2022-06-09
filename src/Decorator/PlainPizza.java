package Decorator;


public class PlainPizza implements IPizza {

    @Override
    public String description() {
        return "concrete component pizza";
    }

    @Override
    public double price() {
        return 10;
    }
}
