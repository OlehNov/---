package stepikPrimitivTypes;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskStep_12 {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<Character> argsList = new ArrayList<Character>();
        argsList.add('a');
        argsList.add('b');
        argsList.add('c');
        ArrayList<Double> list = new ArrayList<Double>();
        while (i < 3){
            Scanner firstArg = new Scanner(System.in);
            System.out.println("Enter argument:" + argsList.get(i));
            String arg_1 = firstArg.nextLine();
            Double x = Double.valueOf(arg_1);
            list.add(x);
            i++;}
        System.out.println(list);
        Double result = list.get(0) + list.get(1) - list.get(2);
        System.out.println(result);
        if ( -0.0001 < result & result < 0.0001 ){
          System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}