/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.nanogrid;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Gateway1
 */
public class MaxValueChangeListener implements ChangeListener {

    
    GridSizeDialog GUI;
    MaxValueChangeListener(GridSizeDialog gui) {
   
        GUI=gui;
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        SpinnerNumberModel Source = (SpinnerNumberModel) ce.getSource();
        GUI.validateChange(Source);
    }
    
}
