package stepikPrimitivTypes;

import java.util.Scanner;

public class TaskStep_last {
    public static void main(String[] args) {
        Scanner firstArg = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = Integer.parseInt(firstArg.nextLine());
        System.out.println("First variant int type: " + value);
        String binaryFirst = Integer.toBinaryString(value);
        System.out.println("First variant binary type: " + binaryFirst);

        Scanner secondArg = new Scanner(System.in);
        System.out.println("Enter bitIndex: ");
        int bitIndex = Integer.parseInt(secondArg.nextLine());
        value = value ^ (1 << bitIndex);
        System.out.println("Second variant int type: " + value);
        String binarySecond = Integer.toBinaryString(value);
        System.out.println("Second variant binary type: " + binarySecond);

    }
}
