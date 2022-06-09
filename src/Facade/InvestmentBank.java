package Facade;

public class InvestmentBank implements IBank {
    private static int id = 0;
    private int CustomerID;
    public InvestmentBank(){
        CustomerID = ++id;
    }
    public String withdraw(){
        return "this withdraw is handled by Investment Bank";
    }
    public String deposit(){
        return "this deposit is handled by Investment Bank ";
    }
    public String transfer(){
        return "this transfer is handled by Investment Bank";
    }

    @Override
    public int getAccountNumber() {
        return CustomerID;
    }
}
