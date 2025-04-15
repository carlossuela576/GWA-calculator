/* this class contains the necesarry attributes and methods into converting the grade percentage into a grade point */

public class ConvertData extends UserData{
    double [] gradePoint = new double[userCount];

    /*this method is to be used into an another method at the same class this takes in an input from the
     * grades array and converts it into a grade point.
    */

    private double toGradePoint(double percentage){
        if (percentage >= 97.50 && percentage == 100){
            return 1.00;
        }
        else if (percentage >= 94.50 && percentage <= 97.49){
            return 1.25;
        }
        else if (percentage >= 91.50 && percentage <= 94.49){
            return 1.50;
        }
        else if (percentage >= 88.50 && percentage <= 91.49){
            return 1.75;
        }
        else if (percentage >= 85.50 && percentage <= 88.49){
            return 2.00;
        }
        else if (percentage >= 81.50 && percentage <= 85.49){
            return 2.25;
        }
        else if (percentage >= 77.50 && percentage <= 81.49){
            return 2.50;
        }
        else if (percentage >= 73.50 && percentage <= 77.49){
            return 2.75; 
        }
        else if (percentage >= 69.50 && percentage <= 73.49){
            return 3.00;
        }
        else if (percentage <= 69.49){
            return 5.00;
        }
        else{
            return 0.00;
        }
    }

    //initializes and creates grade point values for 'gradePoint' attribute
    public void isGradePoint(){
        for (int i = 0; i < userCount; i++) {
            gradePoint[i] = toGradePoint(grades[i]);
        }
    }
}
