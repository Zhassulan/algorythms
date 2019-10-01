package kz.tele2.learning.algorythms.sum.geek.subarray;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {

    public static void main(String[] args) {
        int lineNumber = 0;
        int k = 0;
        long sum = 0;
        for (String arg : args) {
            if (lineNumber++ > 1) {
                if (k == 0) {
                    String[] arrOfStr = arg.split(" ");
                    sum = Long.valueOf(arrOfStr[1]);
                }
                if (k == 1) {
                    String[] arrOfStr = arg.split(" ");
                    process(arrOfStr, sum);
                }
                k += 1;
                if (k == 2) {
                    k = 0;
                }
            }
        }
    }

    private static void process(String arr[], long sum)    {
        long pos;
        for (long i = 0; i < arr.length; i++)  {
            pos = getSumPos(arr, i, sum);
            if (pos != -1)   {
                System.out.println((i + 1) + " " + (pos + 1));
                return;
            }
        }
        System.out.println("-1");
    }

    private static long getSumPos(String arr[], long start, long sumToFind) {
        long sum = 0;
        long i = 0;
        for (String item: arr) {
            if (i >= start) {
                sum += Long.valueOf(item);
                if (sum == sumToFind)   {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

}

/*
Algorythm
1. array pass
2. method get sum, params start, end positions of array

 */