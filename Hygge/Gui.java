package Hygge;

import javax.swing.*;
import java.awt.*;

public class Gui extends JPanel{

    JPasswordField passwordField1;
    JPanel panel1;
    JTextField textField1;
    private JButton button1;

    public void frame(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        panel1 = new JPanel();

        textField1 = new JTextField();
        textField1.setBounds(180,180,100,20);

        frame.add(button1);
        System.out.println(button1.isShowing());
        frame.add(textField1);

    }
}
