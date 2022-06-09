package Adapter;

public class CoffeeTouchScreenAdapter implements ICoffeeMachine {

    OldCoffeeMachine coffeeMachine;
    public CoffeeTouchScreenAdapter(OldCoffeeMachine oldCoffeeMachine){
        this.coffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        coffeeMachine.chooseFirstSelection();
    }

    @Override
    public void chooseSecondSelection() {
        coffeeMachine.chooseSecondSelection();
    }
}
