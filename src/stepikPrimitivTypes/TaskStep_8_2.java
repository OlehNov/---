package stepikPrimitivTypes;

import java.util.Scanner;

public class TaskStep_8_2 {
    public static void main(String[] args) {
        System.out.println(leapYearCount(4));
            }
    public static int leapYearCount(int year){
        int x = (year/4) - (year/100) + (year/400);

//        if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0) {
//            System.out.println(year/4);
//        } else if(year < 4) {
//                System.out.println(0);
//        }else if (year % 4 != 0 || year % 100 == 0) {
//            while (year % 4 != 0 || year % 100 == 0) {
//                year--;
//            }
//            System.out.println(year / 4);
//        }
       return x;
    }
}
////