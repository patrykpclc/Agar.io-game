import javax.swing.*;
import java.awt.*;
public class MyFrame{
    public static void main(String[]args){
        JFrame frame1 = new JFrame();
        BallPanel panel1 = new BallPanel(Color.RED);
        panel1.setPreferredSize(new Dimension(500,500));
        
        frame1.add(panel1);
        frame1.pack();
        frame1.setVisible(true);
    }
}