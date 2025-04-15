import java.util.Scanner;

/*this class and the methods inside this class contains the attributes and functions 
necessary for gathering user made information */

public class UserData {
    Scanner sc = new Scanner(System.in);

    int userCount;
    //constructor for class
    public UserData(int num){
        userCount = num;
    }

    //attributes : user data
    String [] subjects = new String[userCount];
    int [] grades = new int[userCount];
    int [] creditUnits = new int[userCount];

    //method getting input for 'subjects' and 'grades'
    public void getDat(){
        for (int i = 0; i < userCount; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            subjects[i] = sc.nextLine();
            System.out.print("Credit units: ");
            creditUnits[i] = sc.nextInt();
            System.out.print("Grade " + (i+1) + ": ");
            grades[i] = sc.nextInt();
        }
    }
}
