import javax.swing.*;
import java.awt.*;
 class BoxLayout extends JFrame{
      public Example(){
            JButton b1=new JButton("Button 1");
            JButton b2=new JButton("Button 2");
            JButton b3=new JButton("Button 3");
            JButton b4=new JButton("Long Name Button 4");
            JButton b5=new JButton("5");
            setSize(300,350);
            Container c= getContentPane();
            setLayout(new BoxLayout (c,BoxLayout.Y_AXIS));
            c.add(b1);
            c.add(b2);
            c.add(b3);
            c.add(b4);
            c.add(b5);
            setTitle("BoxLayout Demo");
            setVisible(true);
        }
public static void main (String[]args){
    new Example();
}

      }
 