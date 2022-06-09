package Factory_Method;

public class FactoryA implements IFactory {
    public IBank getBank(String bankNumber){
        switch (bankNumber){
            case "123456":
                return new BankA();
            case "111111":
                return new BankB();
        }
    return null;
    }
}
