package Decorator;

public abstract class DecoratorPizza implements IPizza{

    protected IPizza pizza;

    public DecoratorPizza(IPizza tempPizza){
        this.pizza = tempPizza;
    }

    @Override
    public String description() {
        return pizza.description();
    }

    @Override
    public double price() {
        return pizza.price();
    }
}
