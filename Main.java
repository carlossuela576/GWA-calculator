import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //instantiate objects
        Scanner sc = new Scanner(System.in);
        CalculateData usr1 = new CalculateData();

        try {
            //initializing lenght of array attributes for 'UserData()'
            System.out.print("Enter number/amount of subjects: ");
            int num = sc.nextInt();
            usr1.getUserCount(num);

            //implementing methods
            usr1.getDat();
            usr1.isGradePoint();
            usr1.calculateData();
            //donwcasting of 'GWA' variable to int for exception handling
            //brute forcing the variable to output zero instead of 'Nan'
            int compareTo = (int) usr1.finalGWA();
            //exception handling to check for 'NaN' values
            try {
                if (compareTo == 0){
                    throw new ArithmeticException();
                }
                else{
                    System.out.println(usr1.finalGWA());
                }
            } catch (ArithmeticException b) {
                System.out.println("Division by zero");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("Please enter correct values");
        }
        
    }
}