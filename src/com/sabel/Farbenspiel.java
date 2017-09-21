package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farbenspiel extends JFrame {

    private JPanel jpnl;
    private JButton jBtnGruen;
    private JButton jBtnBlau;
    private JButton jBtnGelb;

    public Farbenspiel() {

        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        this.initComponents();
        this.initEvents();

        this.setVisible(true);
    }

    private void initEvents() {
        jBtnBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnl.setBackground(Color.blue);
            }
        });
        jBtnGelb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnl.setBackground(Color.yellow);
            }
        });
        jBtnGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpnl.setBackground(Color.green);
            }
        });
    }

    private void initComponents() {

        jBtnGruen = new JButton("Gruen");
        jBtnBlau = new JButton("Blau");
        jBtnGelb = new JButton("Gelb");

        jpnl = new JPanel();

        jBtnBlau.setBackground(Color.blue);
        jBtnGelb.setBackground(Color.yellow);
        jBtnGruen.setBackground(Color.green);

        jpnl.add(jBtnGruen);
        jpnl.add(jBtnGelb);
        jpnl.add(jBtnBlau);

        this.add(jpnl);
    }
}
