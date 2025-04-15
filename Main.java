import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //instantiate objects
        Scanner sc = new Scanner(System.in);
        UserData usr1 = new UserData();

        //initializing lenght of array attributes for user data
        System.out.print("Enter amount of subjects: ");
        int num = sc.nextInt();
        usr1.getUserCount(num);
        

    }
}