package stepikPrimitivTypes;

import java.util.Scanner;

public class TaskStep_8 {
    public static void main(String[] args) {
        while (true) {
            Scanner firstArg = new Scanner(System.in);
            System.out.println("Enter year number from 1 to 2022: ");
            int arg_1 = Integer.parseInt(firstArg.nextLine());
            if ((arg_1 % 4 == 0 & arg_1 % 100 != 0) || arg_1 % 400 == 0) {
                System.out.println("There are :" + arg_1/4 + "years");
            } else if(arg_1 < 4) {
                System.out.println("There are 0 years");
            }else if (arg_1 % 4 != 0 || arg_1 % 100 == 0){
                while (arg_1 % 4 != 0 || arg_1 % 100 == 0){
                    arg_1 --;
                }
                System.out.println("There are :" + (arg_1/4) + "years");
            }
        }
    }
}
