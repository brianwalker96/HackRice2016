import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class DesktopSocketPanel extends JPanel implements KeyListener
{
    private JTextField box;
    private JLabel label;
    private Socket desktopSocket;
    private PrintWriter out;
    private BufferedReader in;

    public DesktopSocketPanel() {
        this.setPreferredSize(new Dimension(500,500));
        addKeyListener(this);
        
        String host = "192.168.24.210";
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
    
     public void addNotify() {
        super.addNotify();
        requestFocus();
    }
    
    public void keyPressed(KeyEvent e) {
      System.out.println("pressed");
      if (e.isActionKey()){
         out.println(e.getKeyText(e.getKeyCode()));
      } else {
         out.println(e.getKeyChar());
      }
    }

    public void keyReleased(KeyEvent e) {
      System.out.println("released");
    }


    public void keyTyped(KeyEvent e) {
      System.out.println("typed");
    }

}
