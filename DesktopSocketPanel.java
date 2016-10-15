package com.hackrice2016.DesktopSocket;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class DesktopSocketPanel extends JPanel
{
    private JTextField box;
    private JLabel label;
    private Socket desktopSocket;
    private PrintWriter out;
    private BufferedReader in;

    public DesktopSocketPanel() {
        setLayout(new BorderLayout());

        JPanel subpanel = new JPanel();
        subpanel.setLayout(new FlowLayout());
        add(subpanel, BorderLayout.NORTH);

        box = new JTextField("Test", 10);
        box.setHorizontalAlignment(SwingConstants.LEFT);
        subpanel.add(box);

        JButton button = new JButton("Send");
        button.addActionListener(new Listener());
        subpanel.add(button);

        label = new JLabel("Received");
        add(label, BorderLayout.CENTER);

        String host = "192.168.24.168";
        int port = 6666;

        try {
            desktopSocket = new Socket(host, port);
            out = new PrintWriter(desktopSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(desktopSocket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Error: could not connect to server!");
            System.exit(0);
        }
    }

    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            out.println(box.getText());
        }
    }
}
