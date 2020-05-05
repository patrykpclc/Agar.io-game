import javax.swing.*;
import java.awt.*;
public class LayoutManagerNotes{
    public static void main(String[]args){
        JFrame frame1 = new JFrame();
        
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setPreferredSize(new Dimension(300,200));
        panel1.setLayout(new GridLayout(2,2,0,0));
        
        JButton button1 = new JButton("Click");
        JButton button2 = new JButton("Click1");
        JButton button3 = new JButton("Click2");
        JButton button4 = new JButton("Click3");
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(button4);
        
        
        
        
        frame1.add(panel1);
        frame1.pack();//packs frame around panel        
        frame1.setVisible(true);
    }
}