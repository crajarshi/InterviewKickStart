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

    /**
     * Given childIndex, find parentIndex
     * @param <T>
     * @param childIndex
     * @return 
     */
    public static <T extends Comparable> int findParentIndex( int childIndex ) {
        int parentIndex = ( ( childIndex + 1 ) / 2 ) - 1;
        return parentIndex;
    }
    
    /**
     * Given parent Index and heap find childIndex
     * @param <T>
     * @param heap
     * @param parentIndex
     * @return 
     */
    public static <T extends Comparable> int findChildIndex( T[] heap, int parentIndex ) {
        int childIndex = (heap[ (2 * parentIndex + 1) ] == null ) ? 
                (2 * parentIndex + 1) : (2 * parentIndex + 2); 
        return childIndex;
    }
    /**
     * Delete max Element
     * @param <T>
     * @param h
     * @param lastElementIndex
     * @return 
     */
    public static<T extends Comparable> T delete(T[] h, int lastElementIndex) {
        T t= h[0];
        h[0] = h[lastElementIndex];
        h[lastElementIndex] = null;
        lastElementIndex--;
        heapify( h, lastElementIndex );
        return t;
    }
    
    /**
     * Inserts and element - given heap, last element index and an element. The order of the heap is restructured after  insertion
     * @param <T>
     * @param h
     * @param lastElementIndex
     * @param element
     * @return 
     */
    public static <T extends Comparable> int insert(T[] h, int lastElementIndex, T element) {
        lastElementIndex++;
        h[lastElementIndex] = element;
        heapify( h, lastElementIndex );
        return lastElementIndex;
    }
    
    /**
     * re-arrange after each insertion
     * @param <T>
     * @param h
     * @param lastIndex 
     */
    private static <T extends Comparable> void heapify( T[] h, int lastIndex ) {
        int tmpIndex = lastIndex;
        while( tmpIndex > 0 ) {
            int parentIndex = findParentIndex( tmpIndex );
            if( h[parentIndex].compareTo(h[tmpIndex]) < 1  )
                swap(h, parentIndex, tmpIndex) ;
            tmpIndex--;
        }
    }
    
    private static <T extends Comparable> void swap(T[] h , int i, int j) {
        T tmp = h[i];
        h[i] = h[j];
        h[j] = tmp;
    }
}
