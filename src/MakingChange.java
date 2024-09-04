//CAIDEN CLEMENT - LAB 1
import javax.swing.*;
import java.awt.*;

public class MakingChange extends JFrame
{
    public MakingChange()
    {
        int i = 0;

        this.setTitle("MakingChange");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        RegisterPanel registerPanel = new RegisterPanel();
        this.add(registerPanel);

        this.setSize(500,500);
        //this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new MakingChange(); //args[0] represents the title of the GUI
    }
}