/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.training.sort;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chattops
 */
public class GenericMergeSort {
    
    private static <T extends Comparable<T>> List<T> merge( List<T> a, List<T> b ) throws Exception {
        
        if(a == null || b == null) 
            throw new Exception("Cannot operate on null objects ");
        
        int alength =  a.size(); 
        int blength =  b.size();
        
        //Declare a new array and counters
        List<T> m = new ArrayList<T>(); //TODO -- Concrete class of the list needs to be determined dynamically
        int aCounter = 0;
        int bCounter = 0;
        int mCounter = 0;
        
        //merge 
        while( aCounter < alength && bCounter < blength ){
            
            int compareResult = a.get(aCounter).compareTo(b.get(bCounter)) ;
            
            if ( compareResult <= 0) 
                m.add(mCounter++, a.get(aCounter++) );
            
            else if ( compareResult == 1) 
                m.add(mCounter++, b.get(bCounter++) );
        }
        
        if( bCounter < blength) {
            for( int i = bCounter; i < blength; i++)
                m.add(mCounter++, b.get(i));
        }
        
        if( aCounter < alength) {
            for( int i = aCounter; i < alength; i++)
                m.add(mCounter++, a.get(i));
        }
        
        return m;
    }
    
    public static <T extends Comparable<T>> List<T> sort( List<T> a ) throws Exception {
        
        if( a.size() <= 1) return a;
        List<T> b = sort(a, 0, a.size());
        return b;
    }
    
    private static <T extends Comparable<T>> List<T> sort(List<T> a, int low, int high) throws Exception {
        
        if( a.size() <= 1) return a;
        int mid = (low + high)/2;
        
        //break in two parts
        List<T> aPart = a.subList(low, mid);
        List<T> bPart = a.subList(mid, high);
        
        //sort two parts and merge
        List<T> m = merge( sort(aPart), sort(bPart));
       
      
        return m;
    }
}
