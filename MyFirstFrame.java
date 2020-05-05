import javax.swing.*;
import java.awt.*;
public class MyFirstFrame{    
    public static void main(String[]args){
        JFrame f1 = new JFrame("My First Frame");
        f1.setSize(200,200);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(255,0,0));
        JButton b1 = new JButton("Click");
        b1.setBounds(12,200,50,50);
        b1.setBackground(new Color(0,255,0));
        p1.add(b1);
        //b1.setOpaque(true);
        
        ImageIcon pic = new ImageIcon("esch.jpg");
        JLabel the = new JLabel(pic);
        p1.add(the);
        pic.setImage(pic.getImage().getScaledInstance(20,20, Image.SCALE_DEFAULT));
        
        Container cont =f1.getContentPane();
        cont.add(p1);
        cont.setLayout(null);
        
        p1.add( new JLabel("Hi"));
        
        f1.setVisible(true);
    }
}