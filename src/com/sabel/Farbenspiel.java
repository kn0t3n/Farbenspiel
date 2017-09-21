package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farbenspiel extends JFrame implements ActionListener {

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
        jBtnBlau.addActionListener(this);
        jBtnGelb.addActionListener(this);
        jBtnGruen.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e.getActionCommand());

        switch (e.getActionCommand()) {
            case "Gruen":
                jpnl.setBackground(Color.green);
                break;
            case "Blau":
                jpnl.setBackground(Color.blue);
                break;
            case "Gelb":
                jpnl.setBackground(Color.yellow);
                break;
        }
        repaint();
    }
}
