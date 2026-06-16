import java.util.*;

class FoodItem{
    private int itemID;
    private String itemName;
    private int price;
    private int quantity;

    public FoodItem(int itemID, String itemName, int price, int quantity){
        this.itemID=itemID;
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    
    public int calculateAmount() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}

class Customer{
    private int customerId;
    private String customerName;
    private String mobileNumber;

    public Customer(int customerId, String customerName, String mobileNumber) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.mobileNumber = mobileNumber;
    }

    public String getCustomerName() {
        return customerName;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
}

public class OnlineFoodDeliverySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        int cId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        Customer customer =new Customer(cId, name, mobile);

        System.out.println("Customer created: "+ customer.getCustomerName());

        System.out.println("Mobile Number: "+ customer.getMobileNumber());

    }
}