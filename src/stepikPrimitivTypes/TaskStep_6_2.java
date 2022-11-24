package stepikPrimitivTypes;

import java.util.ArrayList;
import java.util.Scanner;


public class TaskStep_6_2 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter boolArgue 4 boolean :  ");
        boolean a = Boolean.parseBoolean(value.nextLine());
        boolean b = Boolean.parseBoolean(value.nextLine());
        boolean c = Boolean.parseBoolean(value.nextLine());
        boolean d = Boolean.parseBoolean(value.nextLine());

        System.out.println(booleanExpression(a, b, c, d));
    }
    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        ArrayList<Boolean> boolList = new ArrayList<Boolean>();
        boolList.add(a);
        boolList.add(b);
        boolList.add(c);
        boolList.add(d);

        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int i = 0;
        while (i < 4) {
            if (boolList.get(i) == true) {
                list.add(boolList.get(i));
            }
            i++;
        }
        if (list.size() == 2) {
            return true;
        } else {
            return false;
        }
    }
}
////