package Constructions;

import java.math.BigInteger;

public class TaskStep_8_Recursion {
    public static void main(String[] args) {
        BigInteger y = new BigInteger("-1");
        System.out.println(recurs(y));
    }

    public static BigInteger recurs(BigInteger x) {
        BigInteger y = BigInteger.ZERO;
        BigInteger z = new BigInteger("-1");
        if (x.compareTo(y)<0){
            System.out.println("Mistake");
        } else {
            BigInteger result = BigInteger.ONE;
            if (x.equals(BigInteger.ZERO) || x.equals(BigInteger.ONE)) {
                return result;
            } else {
                result =x.multiply(recurs(x.add(z.multiply(BigInteger.ONE))));
                return result;
            }
        }
        return y; //не могу вывести result
    }
}

