import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel
{
    private Register register = new Register();
    private JPanel inputPanel;
    private JTextField input;
    private PursePanel changePanel;
    private JButton button;

    public class InputListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource()==button)
            {


                if (input.getText() != null)
                {
                    String inputText = input.getText();

                    double cash = Double.parseDouble(inputText);
                    changePanel.purse = register.makeChange(cash);

                    changePanel.revalidate();
                    changePanel.repaint();
                }
                else
                {
                    System.out.println("No input provided.");
                }

            }
        }
    }

    public RegisterPanel()
    {
        setLayout (new GridLayout(2,1));

        //INPUT
        inputPanel = new JPanel();

        JLabel label = new JLabel("Enter Cash Amount: $");
        input = new JTextField();
        input.setPreferredSize(new Dimension(100, 40));

        button = new JButton("Enter");
        button.addActionListener(new InputListener());

        inputPanel.add(label);
        inputPanel.add(input);
        inputPanel.add(button);

        this.add(inputPanel);

        //DISPLAY PANEL
        changePanel = new PursePanel();
        this.add(changePanel);
    }
}
