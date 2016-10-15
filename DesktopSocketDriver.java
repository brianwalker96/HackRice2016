import javax.swing.JFrame;
import java.net.*;
import java.io.*;

public class DesktopSocketDriver {
    public static void main(String[] args) {
//         new Thread(new Runnable() {
//             public void run() {
//                 try {
//                     System.out.println("Connection attempted");
//                     ServerSocket serverSocket = new ServerSocket(6666);
//                     System.out.println(serverSocket.getInetAddress());
//                     System.out.println(serverSocket.getLocalPort());
//                     System.out.println(serverSocket.getLocalSocketAddress());
//                     System.out.println(serverSocket.isBound());
//                     System.out.println("serverSocket made");
//                     Socket clientSocket = serverSocket.accept();
//                     System.out.println("serverSocket accepted");
//                     PrintWriter out =
//                             new PrintWriter(clientSocket.getOutputStream(), true);
//                     System.out.println("out made");
//                     BufferedReader in = new BufferedReader(
//                             new InputStreamReader(clientSocket.getInputStream()));
//                     System.out.println("in made");
//                     String inputLine, outputLine;
//                     System.out.println("Connection made?");
//                     while ((inputLine = in.readLine()) != null){
//                         System.out.println(inputLine);
//                     }
// 
//                 } catch (IOException e){
//                     System.out.println("No connection made!!");
//                     System.out.println(e);
//                 }
//             }
//         }).start();
    
        JFrame frame = new JFrame("Desktop Socket Panel");
        frame.setSize(500, 350);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new DesktopSocketPanel());
        frame.setVisible(true);        
    }
}
