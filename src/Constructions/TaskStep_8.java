package Constructions;

import java.math.BigInteger;

public class TaskStep_8 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        }
    public static BigInteger factorial(int value){
        BigInteger x = BigInteger.valueOf(1);
        for(int i = 1; i<=value; i++){
            x = x.multiply(BigInteger.valueOf(i));
        }
        return x;
    }
}

