import java.util.HashMap;
import java.util.Map;

public class Purse
{
    Map<Denomination, Integer> cash = new HashMap<Denomination, Integer>();

    Denomination hundred = new Denomination("One Hundred", 100, "Dollar Bill", "src/images/hundred.png");
    Denomination fifty = new Denomination("Fifty", 50, "Dollar Bill", "src/images/fifty.png");
    Denomination twenty = new Denomination("Twenty", 20, "Dollar Bill", "src/images/twenty.png");
    Denomination ten = new Denomination("Ten", 10, "Dollar Bill", "src/images/ten.png");
    Denomination five = new Denomination("Five", 5, "Dollar Bill", "src/images/five.png");
    Denomination one = new Denomination("One", 1, "Dollar Bill", "src/images/one.png");

    Denomination quarter = new Denomination("Quarter",.25, "Coin", "src/images/quarter.png");
    Denomination dime = new Denomination("Dime", .10, "Coin", "src/images/dime.png");
    Denomination nickel = new Denomination("Nickel", .05, "Coin", "src/images/nickel.png");
    Denomination penny = new Denomination("Penny", .01, "Coin", "src/images/penny.png");

    public Purse()
    {
        cash.put(hundred, 0);
        cash.put(fifty, 0);
        cash.put(twenty, 0);
        cash.put(ten, 0);
        cash.put(five, 0);
        cash.put(one, 0);

        cash.put(quarter, 0);
        cash.put(dime, 0);
        cash.put(nickel, 0);
        cash.put(penny, 0);
    }
    public void add(Denomination type, Integer amount)
    {
        cash.put(type, amount);
    }

    public double remove(Denomination type, Integer amount)
    {
        cash.remove(type, amount);
        return amount - cash.get(type);
    }

    public double getValue()
    {
        double total = 0;

        for (Map.Entry<Denomination, Integer> entry : cash.entrySet())
        {
            Denomination denomination = entry.getKey();
            Integer amount = entry.getValue();

            total += denomination.amount() * amount;
        }

        return total;
    }

    public String toString(String type)
    {
        String string = "";

        for (Map.Entry<Denomination, Integer> entry : cash.entrySet())
        {
            Denomination denomination = entry.getKey();
            Integer amount = entry.getValue();

            String money = amount + " " + denomination.name() + " " + denomination.form();

            string += money + "\n";
        }

        return string;
    }
}
