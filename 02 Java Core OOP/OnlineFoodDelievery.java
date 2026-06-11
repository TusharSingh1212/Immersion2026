class OnlineFoodDelivery {
    public static void main(String[] args) {

        int item1Id = 1;
        String item1Name = "Burger";
        double item1Price = 120;
        int item1Quantity = 2;

        int item2Id = 2;
        String item2Name = "Pizza";
        double item2Price = 300;
        int item2Quantity = 1;

        int item3Id = 3;
        String item3Name = "Pasta";
        double item3Price = 150;
        int item3Quantity = 2;

        int item4Id = 4;
        String item4Name = "Coke";
        double item4Price = 40;
        int item4Quantity = 3;

        int customerId = 101;
        String customerName = "Rahul Sharma";
        String mobileNumber = "1234567890";

        double amount1 = item1Price * item1Quantity;
        double amount2 = item2Price * item2Quantity;

        double totalBill = amount1 + amount2;

        System.out.println("Customer Name: " + customerName);

        System.out.println("Item Name       : " + item1Name);
        System.out.println("Price           : " + item1Price);
        System.out.println("Quantity        : " + item1Quantity);
        System.out.println("Amount          : " + amount1);

        System.out.println("Item Name       : " + item2Name);
        System.out.println("Price           : " + item2Price);
        System.out.println("Quantity        : " + item2Quantity);
        System.out.println("Amount          : " + amount2);

        System.out.println("Total Bill      : " + totalBill);
    }
}