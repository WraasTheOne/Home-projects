package Hygge;

import javax.swing.*;

public class Gui extends JFrame{
    private JPanel mainPanel;

    public Gui(String tittle){
        super(tittle);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(420,420);
        this.setVisible(true);
    }
}
