import javax.swing.JFrame;
import java.net.*;
import java.io.*;

public class DesktopSocketDriver {
    public static void main(String[] args) {   
        JFrame frame = new JFrame("Desktop Socket Panel");
        frame.setSize(500, 350);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DesktopSocketPanel());
        frame.setVisible(true);        
    }
}
