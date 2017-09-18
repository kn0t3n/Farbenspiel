package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Farbenspiel extends JFrame implements ActionListener {


    private JPanel jpnl;

    public Farbenspiel() {
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents() {
        JButton jBtnGruen = new JButton("Gruen");
        JButton jBtnBlau = new JButton("Blau");
        JButton jBtnGelb = new JButton("Gelb");
        jpnl = new JPanel();
        jBtnBlau.setBackground(Color.blue);
        jBtnGelb.setBackground(Color.yellow);
        jBtnGruen.setBackground(Color.green);
        jBtnBlau.addActionListener(this);
        jBtnGelb.addActionListener(this);
        jBtnGruen.addActionListener(this);
        jpnl.add(jBtnGruen);
        jpnl.add(jBtnGelb);
        jpnl.add(jBtnBlau);
        this.add(jpnl);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand() == "Blau") {
            jpnl.setBackground(Color.blue);
        }
        if (e.getActionCommand()=="Gelb"){
            jpnl.setBackground(Color.yellow);
        }
        if (e.getActionCommand()=="Gruen"){
            jpnl.setBackground(Color.green);
        }
        repaint();
    }
}
