package com.sabel;

import javax.swing.*;
import java.awt.*;

public class Farbenspiel extends JFrame {


    private JPanel jpnl;

    public Farbenspiel() {
        this.setTitle("Farbenspiel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        initComponents();
        this.setVisible(true);
    }

    private void initComponents(){
        JButton jBtnGruen = new JButton("Gruen");
        JButton jBtnBlau = new JButton("Blau");
        JButton jBtnGelb = new JButton("Gelb");
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
