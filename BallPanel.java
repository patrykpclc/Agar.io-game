import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;//need this for listners
public class BallPanel extends JPanel{
    private Color c;
    private int x=120;
    private int y = 250;
    private int xAdd = 1;
    private int yAdd = 3;
    private int diameter = 50;
    private Ball b;
    private ArrayList <Ball> balls = new ArrayList<Ball>();
    private JButton button;
    public BallPanel(Color inColor){
        this.setBackground(c);
        b= new Ball(10,30,20,Color.CYAN,4,5);
        for(int i = 0;i<20;i++){
            balls.add(new Ball());
        }
        //button = new JButton("Add Ball");
        //button.addActionListener(new MyFirstClass());
        setFocusable(true);

        addKeyListener(new KeyListenerClass());
        addMouseListener(new MyMouseListener());
    }
    //overriding paintComponent method
    //this method gets automatically called
    public void paintComponent(Graphics g){
        //calling paint component method that I overrode
        super.paintComponent(g);      
        g.setColor(Color.CYAN);
        //add(button);
        b.draw(g);
        for(Ball a:balls){
            a.draw(g);
            a.bounce(this);
            double x = b.getCenterX()-a.getCenterX();
            double y = b.getCenterY()-a.getCenterY();
            double square = Math.pow(x,2)+Math.pow(y,2);
            double distance = Math.sqrt(square);
            System.out.println(distance);    
            
            if(distance<b.getDiameter()/2.0+a.getDiameter()/2.0||b.getDiameter()>a.getDiameter()){                
                System.out.println("remove ball");
                balls.remove(a);
                b.increaseDiameter();
                break;
            }
            //a.move();
            
        }
        //balls.get(0).draw(g);
        //g.setColor(Color.GREEN);
        //g.fillOval(y,x,diameter,diameter);
        //y+=yAdd;
        //x+=xAdd;
        // for(Ball br: balls){
            // double x = b.getCenterX()-br.getCenterX();
            // double y = b.getCenterY()-br.getCenterY();
            // double square = Math.pow(x,2)+Math.pow(y,2);
            // double distance = Math.sqrt(square);
            // System.out.println(distance);            
            // if(distance<b.getDiameter()/2.0+br.getDiameter()/2.0){                
                // balls.remove(br);
            // }
        // }

        try{
            Thread.sleep(10);//pauses computer, you pass milliseconds 
        }
        catch(Exception e){

        }
        this.repaint();//refreshes screen
    }
    public class MyFirstClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            balls.add(new Ball());          
        }
    }    
    public class KeyListenerClass extends KeyAdapter{
        public void keyPressed(KeyEvent e){
            //System.out.println(e.getKeyCode());
            if(e.getKeyCode()==83){
                b.moveDown();
            }
            if(e.getKeyCode()==87){
                b.moveUp();
            }
            if (e.getKeyCode()==65){
                b.moveLeft();
            }
            if(e.getKeyCode()==68){
                b.moveRight();
            }
        }
    }
    public class MyMouseListener extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            System.out.println("mouse clicked");          

            for(Ball br: balls){
                double x = b.getCenterX()-br.getCenterX();
                double y = b.getCenterY()-br.getCenterY();
                double square = Math.pow(x,2)+Math.pow(y,2);
                double distance = Math.sqrt(square);
                System.out.println(distance);            
                if(distance<b.getDiameter()/2.0+br.getDiameter()/2.0){                
                    balls.remove(br);
                }
            }
        }
    }
}