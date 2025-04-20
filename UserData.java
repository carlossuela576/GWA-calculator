import java.util.InputMismatchException;
import java.util.Scanner;

/*this class and the methods inside this class contains attributes and functions 
necessary for gathering user made information */

public class UserData {
    Scanner sc = new Scanner(System.in);

    int userCount;
    //method : initialize 'userCount' for array lenght
    public void getUserCount(int num){
        userCount = num;
        subjects = new String[userCount];
        grades = new double[userCount];
        creditUnits = new int[userCount];
        gradePoint = new double[userCount];
        WGP = new double[userCount];
    }

    //attributes : user data
    String [] subjects;
    double [] grades;
    int [] creditUnits;
    double [] gradePoint;
    double [] WGP;

    //method getting input for 'subjects' and 'grades'
    public void getDat(){
        try {
            for (int i = 0; i < userCount; i++) {
                System.out.print("Subject #" + (i+1) + ": ");
                subjects[i] = sc.nextLine();
                System.out.print("Credit units for " + subjects[i] + ": ");
                creditUnits[i] = sc.nextInt();
                sc.nextLine();
                System.out.print("Grade for " + subjects[i] + ": ");
                grades[i] = sc.nextDouble();
                sc.nextLine();
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong");
        } catch (ArrayIndexOutOfBoundsException b){
            System.out.println("Something went wrong");
        }
    }

    
}
