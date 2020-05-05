import javax.swing.*;
import java.awt.*;
public class OwnGUI extends JFrame{
    public static void main(String[]args){
        JFrame f1 = new JFrame();
        JPanel p1 = new JPanel();
        p1.setPreferredSize(new Dimension(200,200));
        p1.setLayout(new BorderLayout());
        p1.add(new JButton("Convert by Clicking Here"));
        p1.add(new JLabel("Metric to Mile Conversion")); 
        
        
        
        f1.add(p1);
        f1.pack();
        f1.setVisible(true);
    }
}

