package opp.ulohy;

import opp.ulohy.utility.Zklavesnice;

import static opp.ulohy.Arrays.printArrayContent;
import static opp.ulohy.InitialisationArray.arrayInitialisation;
import static opp.ulohy.Sorting.sortArray;
import static opp.ulohy.Zodiac.getZodiac;
import static opp.ulohy.Arrays.addToArray;

public class Main {
    public static void main(String[] args)
    {
        //getZodiac();

        int[] array = addToArray();
        printArrayContent(array);

        //int[] array2 = arrayInitialisation();
        //printArrayContent(array2);

        int[] array2 = sortArray(array);
        printArrayContent(array2);

    }

}
