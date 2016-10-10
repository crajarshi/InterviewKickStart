/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heap;

/**
 *
 * @author sukanta
 * @param <T>
 */
public class HeapOps{

    public static <T extends Comparable> int findParentIndex(int childIndex) {
        int parentIndex = ( ( childIndex + 1 ) / 2 ) - 1;
        return parentIndex;
    }
    
    public static <T extends Comparable> int findChildIndex(T[] heap, int parentIndex) {
        int childIndex = (heap[ (2 * parentIndex + 1) ] == null ) ? 
                (2 * parentIndex + 1) : (2 * parentIndex + 2); 
        return childIndex;
    }
    
    public static <T extends Comparable> void heapify(T[] heap, int lastIndex) {
        
    }
}
