/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.util.Arrays;

/**
 *
 * @author sukanta
 */
public class MissingNumber {

    //O(n)
    public static int missingNumber(int a[]) {

        
        int x1 = a[0]; // var storing all XORed elements 
        int x2 = 1;    // var to store XORed elements from i to n
        
        for (int i = 1; i < a.length; i++) {
            x1 = x1 ^ a[i];
            if( i >= 2) 
                x2 = x2 ^ i;
        }
        return (x1 ^ x2);
    }

    //2n approach with swapping , not feasible 
    public static int missingNumber2(int a[]) {
        
        int missingNumber = -1;
        
        for( int i=0; i< a.length;i++) {
            if( a[i] !=  i+1 ) 
                swap(a,i,a[i]-1); 
        }
        
        for( int i=0;i < a.length; i++ ){
            if(a[i] != i+1) {
                missingNumber = i+1;
                break;
            }
        }
        return missingNumber;
    } 
    
    
    private static void swap(int a[] , int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public static void main(String[] args) {
        int a[] = {4,1,2,6,5};
        System.out.println("Missing number is " + missingNumber2(a));
        System.out.println("array: " + Arrays.toString(a));
    }
    
}
