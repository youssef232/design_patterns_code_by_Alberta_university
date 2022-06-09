package Adapter;

public class Main {
    public static void main(String[] args){
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeTouchScreenAdapter coffeeTouchScreenAdapter = new CoffeeTouchScreenAdapter(oldCoffeeMachine);
        coffeeTouchScreenAdapter.chooseFirstSelection();
        coffeeTouchScreenAdapter.chooseSecondSelection();
    }
}
