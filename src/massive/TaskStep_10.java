package massive;

import java.util.Objects;
import java.util.Scanner;

public class TaskStep_10 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String result = x.nextLine();
        System.out.println(isPalindrome(result.toString()));

    }
    public static boolean isPalindrome(String text){
        text = text.replaceAll("[^A-Za-z1-9]", "").toLowerCase();
        if (Objects.equals(text, new StringBuilder(text).reverse().toString())){
            return true;
        } else {
            return false;
        }
    }
}

//////