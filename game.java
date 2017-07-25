package housiegame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class game extends JFrame implements ActionListener{
public static JTextField input;
public  int n;
public game(){
input = new JTextField();
this.add(input);
this.setSize(500,500);
input.setSize(10,10);
input.addActionListener(this);
this.setVisible(true);
}
public void actionPerformed(ActionEvent e){
  JTextField t=(JTextField)e.getSource();
  n = Integer.parseInt(t.getText());
new Playhousie(n);
}

  public static void main(String[] argv){
new game();

}
}
