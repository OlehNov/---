package stepikChangeType;

public class TaskStep_9 {
    public static void main(String[] args) {
        //isPowerOfTwo();
    }
    public static boolean isPowerOfTwo(int value){
        int x = Math.abs(value);
        return Integer.bitCount(x) == 1;
    }
}
