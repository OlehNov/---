package Hometask;

public class Recursion {
    public static void main(String[] args) {
        int y = 10;
        System.out.println(recurs(5));
    }
    public static int recurs(int x) {
        if (x == 1) {
            return 1;
        }
        return x * recurs(x - 1);
    }
}
