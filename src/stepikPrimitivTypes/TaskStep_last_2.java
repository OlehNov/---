package stepikPrimitivTypes;

import java.util.Scanner;

public class TaskStep_last_2 {
    public static void main(String[] args) {
        System.out.println(flipBit(0,1));
    }
    public static int flipBit(int value, int bitIndex){
        return value = value ^ (1 << bitIndex - 1);
    }
}
