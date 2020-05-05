import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel{
    private Color c;
    public DrawPanel(Color inColor){
        c = inColor;
    }
    //overriding paintComponent method
    //this method gets automatically called
    public void paintComponent(Graphics g){
        //calling paint component method that I overrode
        super.paintComponent(g);
        this.setBackground(c);
        g.setColor(Color.YELLOW);
        g.fillOval(20,50,100,100);
        g.drawString("Hello world",250,250);
        g.setColor(Color.MAGENTA);
        g.fillRect(30,200,100,10);
        
    }
    
}