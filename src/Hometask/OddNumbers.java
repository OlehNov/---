package Hometask;


public class OddNumbers {
    public static void main(String[] args) {
        int[] x = {3, 5, 20, 8, 7, 3, 100};
        System.out.println(printOddNumbers(x) + "\n");
    }

    public static String printOddNumbers(int[] arr) {
        StringBuffer x = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                x.append(arr[i] + ",");
            }
        }
        return x.substring(0,x.length()-1);
    }
}