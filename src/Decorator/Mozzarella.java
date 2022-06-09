package Decorator;

public class Mozzarella extends DecoratorPizza {
    public Mozzarella(IPizza tempPizza) {
        super(tempPizza);
        System.out.println(" here in the mozzarella");
    }

    @Override
    public double price() {
        return super.price() + 5.0;
    }

    @Override
    public String description() {
        return super.description() + " mozzarella";
    }
}
