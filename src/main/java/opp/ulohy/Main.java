package opp.ulohy;

import opp.ulohy.utility.Zklavesnice;

import static opp.ulohy.Zodiac.getZodiac;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Napis datum narodenia...");
        int day = Zklavesnice.readInt("Den: ");
        int month = Zklavesnice.readInt("Mesiac: ");


        getZodiac(day, month);


    }
}
