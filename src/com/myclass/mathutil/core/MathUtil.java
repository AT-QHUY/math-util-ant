/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclass.mathutil.core;


// Class mo phong Utilities dung` chung cho moi class khac'
// Copy java.Math cua~ JDK 
public class MathUtil {
    
    public static final double PI = 3.14;
    
    
    // Calculate n!
    // Not accept (-a)! and >= 21!
    // 0! = 1! = 1
    public static long getFactorial(int n){
        long result = 1;
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("-_- || ^_^");
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
    }
}
