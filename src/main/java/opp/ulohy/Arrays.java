package opp.ulohy;

import opp.ulohy.utility.Zklavesnice;

public class Arrays {
    public static int[] addToArray()
    {
        System.out.println("Zadaj 5 cisel: ");
        int[] intArray = new int[5];

        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = Zklavesnice.readInt("Zadaj cislo: ");
        }

        return intArray;
    }

    public static void printArrayContent(int[] array)
    {
        System.out.println("\nPole obsahuje: ");
        for (int i : array)
        {
            System.out.print(i + " ");
        }
    }

    public static int[] arrayInitialisation()
    {
        return new int[]{1, 3, 5, 7, 8};
    }

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
