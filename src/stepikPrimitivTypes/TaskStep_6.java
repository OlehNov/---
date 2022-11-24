package stepikPrimitivTypes;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TaskStep_6 {
    public static void main(String[] args) {
        int i = 0;
        ArrayList<String> argsList = new ArrayList<>();
        while (i < 4){
            Scanner firstArg = new Scanner(System.in);
            System.out.println("Enter argument: ");
            String arg_1 = firstArg.nextLine();
            if (Objects.equals(arg_1, "true")){
                argsList.add(arg_1);}
            else {;}
            i++;
        }
        if(argsList.size() == 2) {
            System.out.println("true");}
        else {
            System.out.println("false");
        }
    }
}

////