import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hello!, todays top flavors are");
    System.out.println("$1.50 - choclate chip");
    System.out.println("2.00 - pecan bit");
    System.out.println("2.50 - coconut");

    System.out.println("How much money will you be spending today?");
    int wallet = scan.nextInt(); 
  }



  static String cookie(int totalMoney) {
    //print: which flavor would you like?
    //scan to receive flavor & save into variable
    System.out.println("Which flavor would be best?");
    int flavor = scan.nextInt();
    
    int change = totalMoney - flavor;

    //print: you have this much change left
    System.out.println(change);
    //if change > 3 then
    if (change > 3) {

      System.out.println("Would you like a another flavor");
      boolean anotherFlavor = scan.nextBoolean();
    }
      //print: would you like another flavor?
      //scan to receive boolean 
    //if user said true for yes, then
    //call the cookie method again..in here

    
  }




}