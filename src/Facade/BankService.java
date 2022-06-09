package Facade;

import java.math.BigDecimal;
import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer, IBank> bankAccounts;
    IBank bank = null;
    public BankService(){
        this.bankAccounts = new Hashtable<Integer, IBank>();
    }
    public void CreateAccount(String bankType, BigDecimal amount){
        switch (bankType) {
            case "saving" -> {
                bank = new SavingBank();
            }
            case "cheque" -> {
                bank = new ChequeBank();
            }
            case "investment" -> {
                bank = new InvestmentBank();
            }
            default -> System.out.println("Error in the banking name");
        }
        if (bank != null){
            bankAccounts.put(bank.getAccountNumber(), bank);
        }
    }
    public void transferMoney(int to, int from, BigDecimal amount) {
        IBank toBank = bankAccounts.get(to);
        IBank fromBank = bankAccounts.get(from);
    }
}
