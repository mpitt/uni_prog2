package it.unitn._152549.colorpicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

class ResetButton extends JButton implements ActionListener {
    
    UIcomponent[] targets;
    
    ResetButton(UIcomponent[] targets) {
        super("Reset");
        this.targets = targets;
        listenToSelf();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0 ; i < targets.length; i++) {
            targets[i].reset();
        }
    }

    private void listenToSelf() {
        addActionListener(this);
    }
    
}
