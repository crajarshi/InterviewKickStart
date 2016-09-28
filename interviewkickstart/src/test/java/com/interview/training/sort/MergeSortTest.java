/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.training.sort;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chattops
 */
public class MergeSortTest {
    
    public MergeSortTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        int[] a = {15, 26, 67, 2, 37, 89, 90, 1 , 7, 5 ,12};
        int[] expResult = {15, 26, 67, 2, 37, 89, 90, 1 , 7, 5 ,12 };
        Arrays.sort(expResult);
        int[] result = MergeSort.sort(a);
        assertArrayEquals(expResult, result);
       
    }
    
}
