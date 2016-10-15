package com.hackrice2016.DesktopSocket;
import javax.swing.JFrame;

public class DesktopSocketDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop Socket Panel");
        frame.setSize(300, 150);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DesktopSocketPanel());
        frame.setVisible(true);
    }
}
