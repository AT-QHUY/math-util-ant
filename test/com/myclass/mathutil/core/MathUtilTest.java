/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclass.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
import java.lang.NumberFormatException;

/**
 *
 * @author huy
 */
public class MathUtilTest {
    
    @Test
    public void tryAssertion(){
        Assert.assertEquals(100, 100);
    }
  
    @Test
    public void testFactorialGivenRightArgumentReturnsWell(){
        long expected = 24;
        long actual = MathUtil.getFactorial(4);
        Assert.assertEquals(expected, actual);
        
        expected = 2;
        actual = MathUtil.getFactorial(2);
        Assert.assertEquals(expected, actual);
    }
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
        
        
        long expected = 120;
        long actual = MathUtil.getFactorial(5);
        Assert.assertEquals(expected, actual);
    }
    
}
