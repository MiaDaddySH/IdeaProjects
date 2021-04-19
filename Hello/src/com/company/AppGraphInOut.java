package com.company;

import javax.swing.*;
import java.awt.*;

public class AppGraphInOut {
    public static void main(String[] args) {
        new AppFrame();
    }
}

class AppFrame extends JFrame{
    JTextField input = new JTextField("12");
    JButton btn = new JButton("Calculate");
    JLabel out = new JLabel();

    public AppFrame(){
        setLayout(new FlowLayout());
        getContentPane().add(input);
        getContentPane().add(btn);
        getContentPane().add(out);

        btn.addActionListener( e -> {
            String s = input.getText();
            double d = Double.parseDouble(s);
            double sq = d*d;
            out.setText(d + "的平方是："+ sq);
        });
        setSize(400, 100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}


