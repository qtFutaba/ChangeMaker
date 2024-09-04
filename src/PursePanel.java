import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

public class PursePanel extends JPanel
{
    public Purse purse;
    Image image;

    public PursePanel()
    {
        purse = new Purse();


        setPreferredSize(new Dimension(300, 400));

        JPanel panel = new JPanel();

        this.add(panel);

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);


        int y = 20;

        for (Denomination denomination : purse.order)
        {
            Integer amount = purse.cash.get(denomination);

            String filename = denomination.image_filename();

            image = new ImageIcon(filename).getImage();

            int x = 70;

            if (amount > 0)
            {
                for (Integer count = 0; count < amount; count++)
                {
                    g.drawImage(image, x, y, null);
                    x -= 5;
                }
            }


            x = 100;

            String money = amount + " " + denomination.name() + " " + denomination.form();
            g.drawString(money, x, y+10);

            y += 30;
        }
    }
}
