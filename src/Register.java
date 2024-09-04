public class Register
{
    public Purse makeChange(double cashIn)
    {
        Purse purse = new Purse();
        double cash = cashIn;

        //BILLS
        int hundreds = 0;
        int fifties = 0;
        int twenties= 0;
        int tens = 0;
        int fives =0;
        int ones =0;

        //COINS
        int quarters= 0;
        int dimes= 0;
        int nickels= 0;
        int pennies= 0;

        //BILLS
        while (Math.ceil(cashIn) >= 100)
        {
            cashIn -= 100;
            hundreds++;
        }

        while (Math.ceil(cashIn) >= 50)
        {
            cashIn -= 50;
            fifties++;
        }

        while (Math.ceil(cashIn) >= 20)
        {
            cashIn -= 20;
            twenties++;
        }

        while (cashIn >= 10)
        {
            cashIn -= 10;
            tens++;
        }

        while (cashIn >= 5)
        {
            cashIn -= 5;
            fives++;
        }

        while (cashIn >= 1)
        {
            cashIn -= 1;
            ones++;
        }


        //COINS
        while (cashIn >= .25)
        {
            cashIn -= .25;
            quarters++;
        }

        while (cashIn >= .10)
        {
            cashIn -= .10;
            dimes++;
        }

        while (cashIn >= .05)
        {
            cashIn -= .05;
            nickels++;
        }

        while (cashIn >= .01)
        {
            cashIn -= .01;
            pennies++;
        }

        if (cashIn > 0)
        {
            pennies++;

            if(pennies >= 5)
            {
                pennies = 0;
                nickels++;
            }
        }

        System.out.println("Minimum coins to make $" + cash);
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Fifties: " + fifties);
        System.out.println("Twenties: " + twenties);
        System.out.println("Tens : " + tens);
        System.out.println("Fives : " + fives);
        System.out.println("Ones : " + ones);

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        purse.add(purse.hundred,hundreds);
        purse.add(purse.fifty,fifties);
        purse.add(purse.twenty,twenties);
        purse.add(purse.ten,tens);
        purse.add(purse.five,fives);
        purse.add(purse.one,ones);

        purse.add(purse.quarter,quarters);
        purse.add(purse.dime,dimes);
        purse.add(purse.nickel,nickels);
        purse.add(purse.penny,pennies);

        return purse;
    }

    static void main(String[] args)
    {
        new Register(); //args[0] represents the title of the GUI
    }
}
