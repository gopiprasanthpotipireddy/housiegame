package housiegame;
import java.awt.*;
import java.util.*;
import javax.swing.*;  
public class Ticket extends JFrame {
/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
public JButton [][] ticket=new JButton[4][10];
public Ticket(){
	for(int  i=1;i<=3;i++){
		for(int j=0;j<=9;j++){
			ticket[i][j]=new JButton("0");
			this.add(ticket[i][j]);
			ticket[i][j].setVisible(true);
			
		}
                this.setSize(400,200);
		this.setVisible(true);
		this.setLayout(new GridLayout(3,9));
	}
	this.generateTicket();
}
public void generateTicket(){
	
	Random random = new Random();
	int r,j;
	
	
	for(int i=1;i<=3;i++){
	int countcolumn[]=new int[10];
		for(int rowcount=0;rowcount<5; ){
 
			j=random.nextInt(10);  //random(max-min+1)+min
			if(countcolumn[j]==0){
				if(j==0)
					r=random.nextInt(9-1+1)+1;
			else 
				r=random.nextInt(9+1)+(j)*10;
			
				switch(i){
			
			case 1:	
				ticket[i][j].setText(String.valueOf(r));  //ticket[i][j]=r;
			countcolumn[j]=1;
			rowcount++;
               break;
			case 2: if (Integer.parseInt(ticket[i-1][j].getText())!=r) {    //t[i-1][j]!=r)
				ticket[i][j].setText(String.valueOf(r)); //t[i][j]=r;
				countcolumn[j]=1;
				rowcount++;
			}
		         break;
			
			case 3:
				if((Integer.parseInt(ticket[i-1][j].getText())!=r)&& (Integer.parseInt(ticket[i-2][j].getText())!=r)){
					ticket[i][j].setText(String.valueOf(r));	//t[i][j]=r;
					countcolumn[j]=1;
					rowcount++;
					
				}
				break;
			
				}
			}
		}
	}
}
				
public static void main(String[] args){
	     JFrame f=new JFrame();
		   Scanner cin=new Scanner(System.in);
		   System.out.println("enter no of tickets");
		   int n=cin.nextInt();
		  Ticket t[]=new Ticket[n];
		  for(int i=0;i<n;i++){
			   t[i]=new Ticket();
			   f.add(t[i]);
		   }
                
		  f.setLayout(new FlowLayout());
		 f.setVisible(true);
		   
}   
}


