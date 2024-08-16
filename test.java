class Test {
    public static void main(String[] args) {
        // Initialize an array of Customers
        Customers[] customers = new Customers[10];
        customers[0] = new Customers(1001, "Kamal Dissanayake"     , "savings", 500000);
        customers[1] = new Customers(1002, "Namal Perera",           "current", 975000);
        customers[2] = new Customers(1003, "Sithumm Udovita",        "current", 100000);
        customers[3] = new Customers(1004, "Manel Dias",             "savings", 1250000);
        customers[4] = new Customers(1005, "Chethiya Munasinghe",    "savings", 950000);
        customers[5] = new Customers(1006, "Sanju Perera",           "current", 1500000);
        customers[6] = new Customers(1007, "Lahiru Karunarathna",    "savings", 600000);
        customers[7] = new Customers(1008, "Tharanga Prasad",        "savings", 400000);
        customers[8] = new Customers(1009, "Shashi Dayarathna",      "savings", 250000);
        customers[9] = new Customers(1010, "Anju Senanayake",        "current", 1100000);

        // Use index-based for-loop to iterate through the array
        for (int i = 0; i < customers.length; i++) {
           	Customers customer = customers[i];
            if (customer != null) { // Check for null to avoid NullPointerException
                System.out.println("Customer " + (i + 1) + ":");
                System.out.println(customer);
                System.out.println("Interest Earned: Rs. " + customer.calculateInterest());
                System.out.println("Total Balance After One Year: Rs. " + customer.calculateTotalBalance());
                System.out.println();
            }
        }
    }
}