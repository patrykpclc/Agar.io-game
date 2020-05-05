import javax.swing.*;
public class GraphicsNotes{
    public static void main(String[]args){

        int clown = JOptionPane.showConfirmDialog(null, "Luke");
        if(clown ==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "you said yes to my message");
        }
        else if(clown ==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "you said no to my message");
        }
        while(true){

            String age = JOptionPane.showInputDialog(null,"enter your age");
            try{
                int lax =  Integer.parseInt(age);
                lax+=10;
                JOptionPane.showConfirmDialog(null,"You will be "+lax+" in 10 years");
                break;
            }
            catch(Exception blah){
                System.out.println(blah);
            }

        }

    }
}