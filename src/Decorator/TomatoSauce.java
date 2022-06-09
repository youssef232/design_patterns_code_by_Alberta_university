package Decorator;

public class TomatoSauce extends DecoratorPizza{
    public TomatoSauce(IPizza tempPizza) {
        super(tempPizza);
        System.out.println("we are in the tomato sauce ");
    }

    @Override
    public String description() {
        return super.description() + " , tomato sauce";
    }

    @Override
    public double price() {
        return super.price() + 4.00;
    }
}
