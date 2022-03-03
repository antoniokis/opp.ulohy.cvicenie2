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
}
