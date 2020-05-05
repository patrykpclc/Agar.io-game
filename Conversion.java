import javax.swing.*;
public class Conversion{
    public static void main(String[]args){
        int answer =1;
        while(answer==1){            
            String x = JOptionPane.showInputDialog(null,"Enter how many meters");
            try{
                double meters = Integer.parseInt(x);
                while(meters<0){
                    JOptionPane.showMessageDialog(null, "Please enter a valid input");
                    x = JOptionPane.showInputDialog(null,"Enter how many meters");
                    meters = Integer.parseInt(x);
                }
                JOptionPane.showMessageDialog(null,"That is "+meters/1609+" miles");
                String y = JOptionPane.showInputDialog(null,"Do you want to continue testing conversions?(1 for yes and 2 for no)");
                answer = Integer.parseInt(y);
            }
            catch(Exception blah){
                JOptionPane.showMessageDialog(null, "Please enter a valid input");
            }

        }

    }
}