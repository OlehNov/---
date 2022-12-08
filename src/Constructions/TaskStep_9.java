package Constructions;

import java.util.Arrays;

public class TaskStep_9 {
    public static void main(String[] args) {
        int[] x = {0,2,2};
        int[] y = {1,3};
        System.out.println(Arrays.toString(mergeArrays(x, y)));
    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length+a2.length];
        int n =0;
        int i =0;
        while(n<(a1.length+a2.length)){
            if (n < a1.length){
                result[n] = a1[n];
            } else {
                result [n] = a2[i++];
            }
            n++;
        }
        Arrays.sort(result);
        return result;
    }
}


//    int[] array = new int[result.length];
//        for(int x = 0; x< array.length; x++){
//        int y = 0;
//        while(y< array.length){
//        if (result[x] < result[y]){
//        array[x] = result[x];
//        } else if (result[x] == result[y]){
//        array[x] = result[x];
//        array[x+1] = result[y];
//        } else{
//        result[x] = result[y];
//        array[x] = result[x];
//        }
//        y++;
//        }
//        }
//        return array;
//
//    int[] array = new int[result.length];
//    boolean sorted = false;
//    int temp;
//        while(!sorted) {
//                sorted = true;
//                for (int k = 0; k < array.length - 1; k++) {
//        if (array[k] > array[k+1]) {
//        temp = array[k];
//        array[k] = array[k+1];
//        array[k+1] = temp;
//        sorted = false;
//        }
//        }
//        }