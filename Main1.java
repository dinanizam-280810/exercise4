package main1;

public class Main1 {

    public static void main(String[] args) {

        System.out.println("Welcome To Starbucks");
        System.out.println("Please remind that you can only enter(1 or 0) and (A or B)");
        
        Columbia z = new Columbia('A', 'B');
        z.choice = ("Grande Mocha Frappucino RM 0.00");
        System.out.println("\nYour beverages: \t" + z.choice);

        System.out.println("Your espresso: \t\t" + z.getespresso());
        z.choice2=("");
        System.out.println("Your drizzle: \t\t" + z.getdrizzle());

        System.out.printf("\nYour Total Price is RM %.2f ", z.gettotalprice());
    }

}
