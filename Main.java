import java.util.Scanner;

/**This program divides and calculates the remainder of the users given number
 *
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates new scanner
    Scanner input = new Scanner(System.in);
    //asks user 
    System.out.println("Please enter in two integers, on seperate lines, to divide.");
    //first variable
    int x = input.nextInt();
    //second variable
    int y = input.nextInt();
    // qoucient
    int q = x/y;
    // calculates the remainder
    int r = q % 2;
    //tells the user their answer
    System.out.println(x + "/" + y + " is " + q + " with a remainder of " + r + ".");

    

  }
}
