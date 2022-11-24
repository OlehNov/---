package stepikPrimitivTypes;

public class TaskStep_12_2 {
    public static void main(String[] args) {

        System.out.println(doubleExpression(0.1, 0.2, 0.3));
    }
    public static boolean doubleExpression(double a, double b, double c) {
        Double result = a + b - c;
        if (-0.0001 < result & result < 0.0001) {
            return true;
        } else {
            return false;
        }
    }
}
////