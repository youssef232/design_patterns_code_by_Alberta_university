package Facade;

public class Customer {
    private static int id = 0;
    private String name;
    private int CustomerID;
    public Customer(String name){
        this.name = name;
        this.CustomerID = ++id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", CustomerID=" + CustomerID +
                '}';
    }
}
