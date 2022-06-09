package Facade;

public class SavingBank implements IBank {
    private static int id = 0;
    private int CustomerID;
    public String withdraw(){
        return "this withdraw is handled by Saving Bank";
    }
    public String deposit(){
        return "this deposit is handled by Saving Bank ";
    }
    public String transfer(){
        return "this transfer is handled by Saving Bank";
    }
    public int getAccountNumber() {
        return CustomerID;
    }
}
