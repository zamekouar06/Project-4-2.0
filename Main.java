import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello!, todays top flavors are");
    System.out.println("$1.50 - choclate chip");
    System.out.println("2.00 - pecan bit");
    System.out.println("2.50 - coconut");

    System.out.println("How much money will you be spending today?");
    int totalMoney = scan.nextInt();

    double change = cookie(totalMoney);
    System.out.println("your total change left is" + change); 
  }

  static double cookie(int totalMoney) {
    Scanner scan = new Scanner(System.in);
    // print: which flavor would you like?
    // scan to receive flavor & save into variable
    System.out.println("Which flavor would be best? select price of flavor");
    double flavor = scan.nextDouble();

    double change = totalMoney - flavor;

    // print: you have this much change left
    System.out.println("you have this much left" + change);
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

}