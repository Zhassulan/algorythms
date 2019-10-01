package kz.tele2.learning.algorythms.sorting;

import java.util.Arrays;

public class BubbleSort {

    private void swap(int [] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void bubbleSort(int array [])    {
        boolean needIteration = true;
        System.out.println(Arrays.toString(array));
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
