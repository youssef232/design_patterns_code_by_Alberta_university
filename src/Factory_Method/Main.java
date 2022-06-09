package Factory_Method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        IBank bank;
        IFactory factory = new FactoryB();
        System.out.println(" Enter the number of the card");
        String cardNumber = scanner.next();
        String bankNumber = cardNumber.substring(0, 6);
        bank = factory.getBank(bankNumber);
        System.out.println(bank.Withdraw());



    }
}
