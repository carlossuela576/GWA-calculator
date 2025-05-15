import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //instantiate objects
        Scanner sc = new Scanner(System.in);
        FileData usr1 = new FileData();
        boolean rep = true;
        do { 
            try {
                //initializing lenght of array attributes for 'UserData()'
                try {
                    System.out.print("Enter number/amount of subjects: ");
                    int num = sc.nextInt();
                    usr1.getUserCount(num);
                } catch (InputMismatchException e) {
                    System.out.println("Please enter correct values");
                }
    
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
                        System.out.println("Your GWA: " + usr1.finalGWA());
                    }
                } catch (ArithmeticException b) {
                    System.out.println("Division by zero");
                }
                
                //File IO (downloading results : cache, not a permanent data)
                try {
                    System.out.println("Do you want to download your results?");
                    System.out.print("Y (yes) N (no): ");
                    sc.nextLine();
                    String ifFile = sc.nextLine().toUpperCase();
        
                    switch (ifFile) {
                        case "Y":
                            System.out.println();
                            System.out.print("Name your file: ");
                            String filenameString = sc.nextLine();
                            String filenameModified = filenameString + ".txt";
                            usr1.isFile(filenameModified);
                            break;
                        case "N":
                            System.out.println();
                            System.out.println("Okay, have a nice day");
                            break;
                        default:
                            throw new InputMismatchException();
                    }
                } 
                catch (InputMismatchException e) {
                    e.printStackTrace();
                }

                //Loop decision
                System.out.println();
                System.out.println("Calculate another grade?");
                System.out.print("Y (yes) N (no): ");
                String decision = sc.nextLine().toUpperCase();
                
                switch (decision) {
                    case "Y":
                        System.out.println();
                        break;
                    case "N":
                        rep = false;
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter correct values");
            }
            
        } while (rep);
        
        
    }
}