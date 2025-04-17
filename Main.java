import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //instantiate objects
        Scanner sc = new Scanner(System.in);
        CalculateData usr1 = new CalculateData();

        //initializing lenght of array attributes for user data
        System.out.print("Enter amount of subjects: ");
        int num = sc.nextInt();
        usr1.getUserCount(num);

        //implementing methods
        usr1.getDat();
        usr1.isGradePoint();
        usr1.calculateData();
        System.out.println(usr1.finalGWA());

    }
}