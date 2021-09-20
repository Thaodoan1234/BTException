package entities;

public class BMI {
    public static float calculateBMI(double w, double h) {
        float bmi = (float) (w / Math.pow(h,2));
        return bmi;
    }
}
