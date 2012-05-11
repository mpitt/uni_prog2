package it.unitn._152549.colorpicker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class ColorPicker extends JFrame {
    
    JPanel contentPane;
    JPanel bodyPane;
    JPanel sliderPane;
    JPanel displayPane;
    JPanel buttonPane;
    ResetButton reset;
    ColorSlider[] sliders = new ColorSlider[3];
    
    ColorPicker() {
        setTitle("Color Picker");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch(Exception e) {}
        contentPane = (JPanel) getContentPane();
        contentPane.setLayout(new BorderLayout());
        bodyPane= new JPanel();
        sliderPane = new JPanel();
        displayPane = new JPanel();
        buttonPane = new JPanel();
        reset = new ResetButton(sliders);
        sliders[0] = new ColorSlider("R");
        sliders[1] = new ColorSlider("G");
        sliders[2] = new ColorSlider("B");
        sliderPane.setLayout(new GridLayout(3,1));
        for (int i=0; i<3; i++) {
            sliderPane.add(sliders[i]);
        }
        displayPane.setBackground(Color.WHITE);
        bodyPane.setLayout(new GridLayout(1,2));
        bodyPane.add(sliderPane);
        bodyPane.add(displayPane);
        buttonPane.add(reset);
        contentPane.add(bodyPane, BorderLayout.CENTER);
        contentPane.add(buttonPane, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        ColorPicker picky = new ColorPicker();
    }
}
