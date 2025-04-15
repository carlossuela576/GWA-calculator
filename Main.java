import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input number
        System.out.print("Number of your subjects: ");
        int num = sc.nextInt();
        //constructor - for initializing the size of arrays
        UserData usr1 = new UserData(num);

    }
}