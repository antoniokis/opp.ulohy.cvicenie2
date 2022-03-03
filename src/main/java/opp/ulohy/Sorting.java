package opp.ulohy;

import java.util.Arrays;

public class Sorting {
    public static int[] sortArray(int[] array)
    {
        int min;
        int tempIndex = 0;
        boolean foundNewMin = false;
        for (int i = 0; i < array.length; i++)
        {
            min = array[i];
            for (int j = i; j < array.length; j++)
            {
                if (min > array[j])
                {
                    min = array[j];
                    tempIndex = j;
                    foundNewMin = true;
                }
            }
            if (foundNewMin)
            {
                int temp = array[i];
                array[i] = min;
                array[tempIndex] = temp;
                foundNewMin = false;
            }
        }

        return array;
    }
}
