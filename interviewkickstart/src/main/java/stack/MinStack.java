/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import java.util.Stack;

/**
 *
 * @author sukanta
 * @param <T>
 */
public class MinStack <T extends Comparable>{

    Stack<T> dataStack;

    Stack<T> minStack;
    
    public void push(T item) {
        dataStack.push(item);
        if ( minStack.empty() || minStack.peek().compareTo(item) > 0) {
            minStack.push(item);
        }
    
    }
}
