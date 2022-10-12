/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myclass.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author huy
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //code de~ test ham` khac' la` test script
    //1 test script ung voi 1 test case
    
    public MathUtilDDTTest() {
    
    }

    @Parameterized.Parameters
    public static Object[][] initData(){
        int a[] = {5, 10, 15, 20};
        int b[][] = {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}};
        int c[][] = {{1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}};
        return new Integer [][]{
            {1,0},{1,1},{2,2},{6,3},{24,4},{120,5},{720,6}
        };
    }
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    @Test
    public void testFactorialGivenRightArgumentsReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
