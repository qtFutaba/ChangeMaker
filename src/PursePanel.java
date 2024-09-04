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


        setPreferredSize(new Dimension(400, 250));

        JPanel panel = new JPanel();

        this.add(panel);

    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int x = 70;
        int y = 10;

        for (Map.Entry<Denomination, Integer> entry : purse.cash.entrySet())
        {
            Denomination denomination = entry.getKey();

            Integer amount = entry.getValue();
            String filename = denomination.image_filename();

            image = new ImageIcon(filename).getImage();

            g.drawImage(image, x, y, null);

            x += 30;
            String money = amount + " " + denomination.name() + " " + denomination.form();
            g.drawString(money, x, y+10);

            x = 70;
            y += 20;
        }
    }
}
