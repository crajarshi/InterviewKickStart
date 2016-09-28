/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interview.training.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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
public class GenericMergeSortTest {

    public GenericMergeSortTest() {
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
     * Test of sort method, of class GenericMergeSort.
     */
    @Test
    public void testSort() {
        System.out.println("generic sort");

        //declare List1
        List<Integer> result = new ArrayList<Integer>();
        result.add(32);
        result.add(42);
        result.add(2);
        result.add(7);
        result.add(56);
        result.add(9);
        result.add(5);
        result.add(12);
        result.add(27);

        //declare list 2
        ArrayList<Integer> expResult = new ArrayList<Integer>();
        for (Integer i : result) {
            expResult.add(i);
        }

        // sort
        try {
            result = GenericMergeSort.sort(result);
            Collections.sort(expResult);
            //assert equals
            assertEquals(expResult, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Failed in sorting elements");
        }

    }
    
    @Test
    public void testLinkedListSort() {
        System.out.println("generic sort");

        //declare List1
        List<Integer> result = new LinkedList<Integer>();
        result.add(32);
        result.add(42);
        result.add(2);
        result.add(7);
        result.add(56);
        result.add(9);
        result.add(5);
        result.add(12);
        result.add(27);

        //declare list 2
        List<Integer> expResult = new LinkedList<Integer>();
        for (Integer i : result) {
            expResult.add(i);
        }

        // sort
        try {
            result = GenericMergeSort.sort(result);
            Collections.sort(expResult);
            //assert equals
            assertEquals(expResult, result);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Failed in sorting elements");
        }

    }

}
