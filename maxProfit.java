/*
  Write an efficient method that takes stockPrices and returns the best profit I could have
  made from one purchase and one sale of one share of Apple stock yesterday.
  
  No "shorting"—you need to buy before you can sell. Also, you can't buy and sell in the same 
  time step—at least 1 minute has to pass.
  
  Question on Interview Cake.
  
  Answer by Mohammad Pasha Khoshkebari. 
*/

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class Solution {

    public static int getMaxProfit(int[] stockPrices) {

        // calculate the max profit
        
        if (stockPrices.length <= 2) {
            throw new IllegalArgumentException("Not Right!");
        }
        
        int smallestValue = stockPrices[stockPrices.length - 2];
        int greatestValue =  stockPrices[stockPrices.length - 1];
        int greatestAfterSmallestValue = stockPrices[stockPrices.length - 1];
        
        
        for (int i = stockPrices.length-2; i >= 0; i--) {
            if (stockPrices[i] < stockPrices[smallestValue]) {
                smallestValue = i;
                
                greatestAfterSmallestValue = greatestValue;
            }
            
            if (stockPrices[i] > stockPrices[greatestValue]) greatestValue = i;
            
        }
        
        return stockPrices[greatestAfterSmallestValue] - stockPrices[smallestValue];
    }
}


