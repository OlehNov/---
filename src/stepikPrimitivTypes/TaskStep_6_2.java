package stepikPrimitivTypes;

import java.util.ArrayList;
import java.util.Objects;


public class TaskStep_6_2 {
    public static void main(String[] args) {

        System.out.println(booleanExpression(true, true, true, false));
    }
    public static Boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        int i = 0;
        ArrayList<Boolean> boolList = new ArrayList<Boolean>();
        boolList.add(a);
        boolList.add(b);
        boolList.add(c);
        boolList.add(d);
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        while (i < 4) {
            if (Objects.equals(boolList.get(i), true)) {
                list.add(boolList.get(i));
            }
            i++;
        }
        System.out.println(list);
        if (list.size() == 2) {
            return true;
        } else {
            return false;
        }
    }
}
