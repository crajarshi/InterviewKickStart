/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.training.sort;

import java.util.Arrays;

/**
 *
 * @author chattops
 */
public class MergeSort {
    
    private static int[] merge(int a[], int b[]){
        
        int alength = (a != null) ? a.length : 0; 
        int blength = (b != null) ? b.length : 0;
        
        //Declare a new array and counters
        int m[] = new int[alength + blength];
        int aCounter = 0;
        int bCounter = 0;
        int mCounter = 0;
        
        //merge 
        while( aCounter < alength && bCounter < blength ){
            if      ( a[ aCounter ] <= b[ bCounter ] ) m[ mCounter++ ] = a [aCounter++];
            else if ( a[ aCounter ] >= b[ bCounter ] ) m[ mCounter++ ] = b [bCounter++];
        }
        
        // merge leftovers
        if( aCounter < alength) {
            for( int i = aCounter; i < alength; i++)
                m[ mCounter++ ] = a[i];
        }
        
        if( bCounter < blength) {
            for( int i = bCounter; i < blength; i++)
                m[ mCounter++ ] = b[i];
        }
        
        return m;
    }
    
    public static int[] sort(int a[]) {
        if( a.length <= 1) return a;
        int b[] = sort(a, 0, a.length );
        return b;
    }
    
    private static int[] sort(int a[], int low, int high) {
        
        if( a.length <= 1) return a;
        int mid = (low + high)/2;
        
        //break in two parts
        int aPart[] = Arrays.copyOfRange(a, low, mid);
        int bPart[] = Arrays.copyOfRange(a, mid, high);
        
        //sort two parts and merge
        int mergedSortedArray[] = merge( sort(aPart), sort(bPart));
        return mergedSortedArray;
    }
}
