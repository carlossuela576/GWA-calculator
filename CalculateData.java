public class CalculateData extends ConvertData {
    double totalWGP = 0;
    double totalCU = 0;
    
    

    public void calculateData(){
        for (int i = 0; i < userCount; i++) {
            WGP[i] = gradePoint[i] * creditUnits[i];
        }

        for (int i = 0; i < userCount; i++) {
            totalWGP += WGP[i];
            totalCU += creditUnits[i];
        }
    }

    public double finalGWA(){
        double GWA = totalWGP / totalCU;
        return GWA;
    }
}
