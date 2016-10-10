/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author sukanta
 */
public class RecursionPaliandrome {
    
 

    public static boolean isPaliandrome(String s)
    {
        if(s.length() == 0 || s.length() == 1)
            
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            
            return isPaliandrome(s.substring(1, s.length()-1));

       
        return false;
    }

    public static void main(String[]args) throws IOException
    {
        String s = "Never a foot too far, even.";
        boolean res;
        s = s.replace(" ", "");
        s = s.replace(",", "");
        s = s.replace("!", "");
        s = s.replace(";", "");
        s = s.replace("-", "");
        s = s.replace(":", "");
        s = s.replace("\'", "");
        s = s.replace("\"", "");
        s = s.replace(".", "");
        s = s.toLowerCase();
        res = isPaliandrome(s);
        System.out.println("Boolean " + res);
    }

    
}
