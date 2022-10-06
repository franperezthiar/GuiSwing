package model;

import javax.swing.*;

public class GuiSwing1 {
    public static void main(String[] args) {
        JFrame marco = new JFrame("Mi primer interfaz GUI");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(300,300);
        JButton boton1 = new JButton("Pulsa");
        marco.add(boton1);
        marco.setVisible(true);
    }
}
