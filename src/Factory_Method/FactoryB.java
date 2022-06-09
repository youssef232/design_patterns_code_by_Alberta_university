package Factory_Method;

public class FactoryB implements IFactory{
    public IBank getBank(String cardNumber){
        switch (cardNumber){
            case "321456":
                return new BankB();

            case "987654":
                return new BankA();
        }


        return null;
    }
}
