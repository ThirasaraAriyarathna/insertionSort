package insertionsort;

import java.util.*;

public class InsertionSort {
    public static void Isort(int[] A){
        for (int i =1; i <A.length; i ++){
            int key = A[i];
            int j;
            for (j =i-1; j>=0 && A[j]>key ; j--){
                A[j+1] =A[j];
            }
        A[j+1] =key;
        }
    }
    public static void main(String[] args) {
        Random number = new Random();
        for (int i=1; i<8; i++){
            int[] A = new int[(int)Math.pow(10, i)];
            for (int j=0;j< (int)Math.pow(10, i); j++){
                A[j] = number.nextInt();
            }
        long startTime =System.currentTimeMillis();
        Isort(A);
        long endTime =System.currentTimeMillis();
        System.out.println(endTime-startTime);
        }
        /*for (int j=0; j<A.length; j++){
            System.out.println(A[j]);
        }*/
    }
}
