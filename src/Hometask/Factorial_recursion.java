package Hometask;

import java.util.Scanner;

public class Factorial_recursion {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter the age please: ");
        int y = Integer.parseInt(year.nextLine());
        Age x = new Age();
        System.out.println(x.determineGroup(y));
    }
}

class Age {
    public int determineGroup(int age){
        if (age >=1 && age <=7) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        } else {
            return -1;
        }
    }

}







