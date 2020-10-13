/**
 * This program is a method named lastDigit that returns the last digit of an integer 
 * @author David Toma
 */
public class Main {

  // create a method with variable lastDigit
  public static int lastDigit(int integer){
    // divide the integer by 10 to find the last integer
    int digit = (integer % 10);
    // return the last integer to the user
    return digit;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input the integer that the user wants the last digit to
    int totalLast = lastDigit(2578967);
    System.out.println(totalLast);
    
  }
}
