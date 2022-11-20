package stepikPrimitivTypes;

import java.util.Scanner;

public class TaskStep_8_2 {
    public static void main(String[] args) {
        leapYearCount(99);
            }
    public static int leapYearCount(int year){
        if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0) {
            System.out.println(year/4);
        } else if(year < 4) {
                System.out.println(0);
        }else if (year % 4 != 0 || year % 100 == 0) {
            while (year % 4 != 0 || year % 100 == 0) {
                year--;
            }
            System.out.println(year / 4);
        }
        return year;
    }
}
