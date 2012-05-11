package it.unitn._152549.colorpicker;

import java.awt.BorderLayout;
import java.util.Dictionary;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class ColorSlider extends UIcomponent {
    JSlider slider;
    JLabel name;
    Dictionary labels = new Hashtable();
    
    ColorSlider(String color) {
        slider = new JSlider(0, 255, 0);
        slider.setMajorTickSpacing(128);
        slider.setMinorTickSpacing(64);
        Integer i = 0;
        labels.put(i, new JLabel(i.toString()));
        for (i = 63; i<256; i+=64) {
            labels.put(i, new JLabel(i.toString()));
        }
        slider.setLabelTable((Dictionary) labels);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        name = new JLabel(color);
        name.setLabelFor(slider);
        this.setLayout(new BorderLayout());
        this.add(slider, BorderLayout.CENTER);
        this.add(name, BorderLayout.WEST);
    }
    
    @Override
    public void reset() {
        slider.setValue(0);
    }
    
}
