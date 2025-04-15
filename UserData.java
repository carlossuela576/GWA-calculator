import java.util.Scanner;

/*this class and the methods inside this class contains attributes and functions 
necessary for gathering user made information */

public class UserData {
    Scanner sc = new Scanner(System.in);

    int userCount;
    //method : initialize 'userCount' for array lenght
    public void getUserCount(int num){
        userCount = num;
    }

    //attributes : user data
    String [] subjects = new String[userCount];
    double [] grades = new double[userCount];
    int [] creditUnits = new int[userCount];

    //method getting input for 'subjects' and 'grades'
    public void getDat(){
        for (int i = 0; i < userCount; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            subjects[i] = sc.nextLine();
            System.out.print("Credit units: ");
            creditUnits[i] = sc.nextInt();
            System.out.print("Grade " + (i+1) + ": ");
            grades[i] = sc.nextDouble();
        }
    }
}
