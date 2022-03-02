package opp.ulohy;

import opp.ulohy.utility.Zklavesnice;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Napis datum narodenia...");
        int day = Zklavesnice.readInt("Den: ");
        int month = Zklavesnice.readInt("Mesiac: ");


        if (month < 1 || month > 12)
        {
            System.out.println("Nespravny datum!");
        }
        if (month == 2)
        {
            if (day < 1 || day > 29)
            {
                System.out.println("Nespravny datum!");
            }
        }

        if (month == 1)
        {
            if (day >= 1 && day <= 20)
            {
                System.out.println("V horoskope si: Capricorn");
            }
            else
            {
                System.out.println("V horoskope si: Aquarius");
            }
        }
        else if (month == 2)
        {
            if (day >= 1 && day <= 19)
            {
                System.out.println("V horoskope si: Aquarius");
            }
            else
            {
                System.out.println("V horoskope si: Pisces");
            }
        }
        else if (month == 3)
        {
            if (day >= 1 && day <= 20)
            {
                System.out.println("V horoskope si: Pisces");
            }
            else
            {
                System.out.println("V horoskope si: Aries");
            }
        }
        else if (month == 4)
        {
            if (day >= 1 && day <= 20)
            {
                System.out.println("V horoskope si: Aries");
            }
            else
            {
                System.out.println("V horoskope si: Taurus");
            }
        }
        else if (month == 5)
        {
            if (day >= 1 && day <= 21)
            {
                System.out.println("V horoskope si: Taurus");
            }
            else
            {
                System.out.println("V horoskope si: Gemini");
            }
        }
        else if (month == 6)
        {
            if (day >= 1 && day <= 21)
            {
                System.out.println("V horoskope si: Gemini");
            }
            else
            {
                System.out.println("V horoskope si: Cancer");
            }
        }
        else if (month == 7)
        {
            if (day >= 1 && day <= 22)
            {
                System.out.println("V horoskope si: Cancer");
            }
            else
            {
                System.out.println("V horoskope si: Leo");
            }
        }
        else if (month == 8)
        {
            if (day >= 1 && day <= 22)
            {
                System.out.println("V horoskope si: Leo");
            }
            else
            {
                System.out.println("V horoskope si: Virgo");
            }
        }
        else if (month == 9)
        {
            if (day >= 1 && day <= 22)
            {
                System.out.println("V horoskope si: Virgo");
            }
            else
            {
                System.out.println("V horoskope si: Libra");
            }
        }
        else if (month == 10)
        {
            if (day >= 1 && day <= 22)
            {
                System.out.println("V horoskope si: Libra");
            }
            else
            {
                System.out.println("V horoskope si: Scorpio");
            }
        }
        else if (month == 11)
        {
            if (day >= 1 && day <= 22)
            {
                System.out.println("V horoskope si: Scorpio");
            }
            else
            {
                System.out.println("V horoskope si: Sagittarius");
            }
        }
        else if (month == 12)
        {
            if (day >= 1 && day <= 21)
            {
                System.out.println("V horoskope si: Sagitarius");
            }
            else
            {
                System.out.println("V horoskope si: Capricorn");
            }
        }


    }
}
