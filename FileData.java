import java.io.FileWriter;
import java.io.IOException;
public class FileData extends CalculateData {
    /* this class contains all necessary methods and functions
     * prior to program's file input and output
     */

    public void isFile(String pathName){
        try {
            FileWriter userfile = new FileWriter(pathName);
            //convert finalGWA(double) to string
            String convstr = String.valueOf(finalGWA());
            userfile.write("Your GWA is: " + convstr + "\n");
            //list all subject and grade points
            for(int i = 0; i<userCount; i++){
                userfile.append("\nSubject: " + subjects[i]+ ": " + gradePoint[i]);
            }
            //Total credit units
            int convCUint = (int) totalCU;
            String convCUString = String.valueOf(convCUint);
            userfile.write("\n" + "\nWith a total credit unit of: " + convCUString + " units");
            userfile.close();

            System.out.println();
            System.out.println("File created!");

        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }
}
