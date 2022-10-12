
package com.myclass.mathutil.main;

import com.myclass.mathutil.core.MathUtil;

/**
 *
 * @author huy
 */
public class Main {

  
    public static void main(String[] args) {
        tryTDDFirst();
    }
    
    // Dung` thu~ ham` chinh' ben MathUtil
    public static void tryTDDFirst(){
        
        //Test case #1 (Tinh` huong' kiem~ thu~ ham` so 1):
        // Dua vao` n = 1;
        // Goi ham` getFactorial 1 vi` 1! = 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        System.out.println("Test 1! | status: " +
                           " Expected:" + expected +
                           "| Actual:" + actual );
        
        
        //Test case #2 (Tinh` huong' kiem~ thu~ ham` so 2):
        // Dua vao` n = 2;
        // Goi ham` getFactorial 2 vi` 2! = 2;
        expected = 2;
        actual = MathUtil.getFactorial(2);
        System.out.println("Test 2! | status: " +
                           " Expected:" + expected +
                           "| Actual:" + actual );
        
        // So sanh' expected vs actual
        // Sai --> bug
        
    }
}
