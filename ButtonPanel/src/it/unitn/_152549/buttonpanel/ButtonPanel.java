package it.unitn._152549.buttonpanel;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class ButtonPanel extends JPanel implements ActionListener {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPanel = new ButtonPanel();
        f.setContentPane(contentPanel);
        f.pack();
        f.setVisible(true);
    }
    
    ButtonPanel() {
        super();
        JButton button1 = new JButton("Red");
        JButton button2 = new JButton("Green");
        JButton button3 = new JButton("Blue");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        listen(button1);
        listen(button2);
        listen(button3);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Red")) {
            this.setBackground(new Color(255,0,0));
        } else if (cmd.equals("Green")) {
            this.setBackground(new Color(0,255,0));
        } else if (cmd.equals("Blue")) {
            this.setBackground(new Color(0,0,255));
        } else {
            System.out.println("Unsupported command");
        }
    }

    private void listen(JButton e) {
        e.addActionListener(this);
    }
}
