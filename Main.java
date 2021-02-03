import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello!, todays top flavors are");
    System.out.println("$1.50 - choclate chip");
    System.out.println("2.00 - pecan bit");
    System.out.println("2.50 - coconut");
    //The price options enabling the method cookie

    System.out.println("How much money will you be spending today?");
    int totalMoney = scan.nextInt();
    //asking input by the user for how much they have

    double change = cookie(totalMoney);
    System.out.println("your total change left is " + change); 
    //giving the user there total change of the full purchase
     System.out.println("decaf");
    System.out.println("dark roast");
    System.out.println("frappuccino");
    
    System.out.println("Which coffe would be best to go with your cookie?");
  }

  static double cookie(int totalMoney) {
    Scanner scan = new Scanner(System.in);
    // print: which flavor would you like?
    // scan to receive flavor & save into variable
    System.out.println("Which flavor would be best? select price of flavor");
    double flavor = scan.nextDouble();

    double change = totalMoney - flavor;

    // print: you have this much change left
    System.out.println(" you have this much left " + change);
    // if change > 3 then
    if (change > 3) {

      System.out.println("Would you like any toppings? true/false");
      boolean toppings = scan.nextBoolean();

      if (true) {
         change = change - 3;  
      }
      
    }
    return change;
  }
  static coffe(int totalCurrency){
  }  

}