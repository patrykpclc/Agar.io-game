import java.awt.*;
import javax.swing.*;
public class Ball{
    private int x,y,diameter,xspeed,yspeed;
    private Color c;
    public Ball(int x,int y,int diameter, Color c,int xspeed,int yspeed){
        this.x=x;
        this.y=y;
        this.diameter=diameter;
        this.c=c;
        this.xspeed=xspeed;
        this.yspeed=yspeed;
    }
    public Ball(){
        x=(int)(Math.random()*400+2);        
        y=(int)(Math.random()*400+2);
        diameter = (int)(Math.random()*50+5);
        xspeed=(int)(Math.random()*4+1);
        yspeed=(int)(Math.random()*4+1);
        c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)); 
    }
    public void draw(Graphics g){
        g.setColor(c);
        g.fillOval(x,y,diameter,diameter);
    }
    public void move(){
        x+=xspeed;
        y+=yspeed;
    }
    public void bounce(BallPanel p){
        if(x<=0||x>=p.getWidth()-diameter){
            xspeed*=-1;            
        }
        if(y<=0||y>=p.getHeight()-diameter){
            yspeed*=-1;
        }
    }
    public void moveDown(){
        y+=3;
    }
    public void moveUp(){
        y-=3;
    }
    public void moveRight(){
        x+=3;
    }
    public void moveLeft(){
        x-=3;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getDiameter(){
        return diameter;
    }
    public double getCenterX(){
        return x+diameter/2.0;
    }
    public double getCenterY(){
        return y+diameter/2.0;
    }
    public void increaseDiameter(){
        diameter+=5;
    }
}