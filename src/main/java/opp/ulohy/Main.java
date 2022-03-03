package opp.ulohy;

import opp.ulohy.utility.Zklavesnice;
import static opp.ulohy.Arrays.*;
import static opp.ulohy.Zodiac.getZodiac;

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
