package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class myForm {
    private JPanel panel1;
    private JButton button1;

    public myForm() {

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hi there");//Shows a message box
                Main.frame.setContentPane(new Main().getPanel());
                Main.frame.pack();

            }
        });
    }


    public JPanel getPanel() {
        return panel1;
    }



}
