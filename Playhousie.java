package housiegame;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
<<<<<<< HEAD
import javax.swing.*;
=======
import javax.swing.*;  
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
public class Playhousie extends JFrame implements ActionListener{
public static int n;
private static final long serialVersionUID = 1L;
public static JButton [] board=new JButton[100];
public Ticket t[];
public int jflag[],r1flag[],r2flag[],r3flag[],hflag[],count[];
public static boolean fjflag,frflag[],fhflag;
<<<<<<< HEAD

public Playhousie(int num){
  n= num;
  frflag=new boolean[4];

  for(int i=1;i<=99;i++){

board[i]=new JButton(String.valueOf(i));
    }
=======
public Playhousie(int n){
        
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
	jflag=new int[n+1];
	r1flag=new int[n+1];
	r2flag=new int[n+1];
	r3flag=new int[n+1];
	hflag=new int[n+1];
	count=new int[n+1];
	t=new Ticket[n+1];
	for(int i=1;i<=n;i++)
		t[i]=new Ticket();
	JButton start=new JButton("start");
<<<<<<< HEAD
  this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  JFrame temp=this;
                this.addWindowListener( new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                      JOptionPane.showMessageDialog((Component)temp, "Bye Bye!");
                        System.exit(0);
                    }
                } );
	this.setSize(500,500);

	this.add(start);

	start.addActionListener(this);
	//start.setVisible(true);
	for(int i=1;i<=99;i++){

    board[i].setBackground(Color.red);
            //  board[i].setVisible(true);
=======
	this.setSize(500,500);

	this.add(start);
	
	start.addActionListener(this);	
	//start.setVisible(true);
	for(int i=1;i<=99;i++){
              board[i].setVisible(true);
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
		this.add(board[i]);
             board[i].addActionListener(this);
            board[i].setEnabled(false);
	}
<<<<<<< HEAD

	this.setLayout(new FlowLayout());
	this.setVisible(true);
}

public static void main(String[] args){
JFrame j=new JFrame();
JTextField input= new JTextField();
JLabel l= new JLabel("enter number of players");

j.add(l);
l.setBounds(50,50, 300,30);
j.add(input);
input.setBounds(50,100, 100,30);
j.setLayout(null);
j.setSize(300,300);

j.setVisible(true);
input.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    int num=Integer.parseInt(((JTextField)e.getSource()).getText());
    new Playhousie(num);
  }
});
  /*scanning player count from console
	Scanner cin=new Scanner(System.in);
System.out.println("enter no of players");
	n=cin.nextInt();
*/
	//new Playhousie(n);

	}

	public void actionPerformed(ActionEvent e){

=======
       
	this.setLayout(new FlowLayout());
	this.setVisible(true);
}
public static void main(String[] args){
	frflag=new boolean[4];
	
	for(int i=1;i<=99;i++){
			board[i]=new JButton(String.valueOf(i));
			board[i].setBackground(Color.red);
			//board[i].setVisible(true);
			
		}
	
	
	Scanner cin=new Scanner(System.in);
System.out.println("enter no of players");
	n=cin.nextInt();
	new Playhousie(n);
	                   
	}
	
	public void actionPerformed(ActionEvent e){
	
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
		JButton b=(JButton)e.getSource();
		if(b.getText().equals("start")){
                b.setEnabled(false);
                 for(int i=1;i<=99;i++)
                 board[i].setEnabled(true);
<<<<<<< HEAD

		System.out.println(b.getText());


=======
		
		System.out.println(b.getText());
                
		
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
		return;
		}
		else{
             // System.out.println("working");
               System.out.println(b.getText());
		int r=Integer.parseInt(b.getText());
		int row=0;
<<<<<<< HEAD

			//if(bflag[r]==1) return;
			if((board[r].getBackground())==Color.GREEN){return;}

=======
	
			//if(bflag[r]==1) return;
			if((board[r].getBackground())==Color.GREEN){return;}
				
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
			else{	//bflag[r]=1;                               //checking number in every ticket
			board[r].setBackground(Color.green);  //board[r]=1;
                        board[r].setEnabled(false);
			for(int i=1;i<=n;i++){
				int k=r/10;
				                 //searching number
				    if(k==0){
						for(int j=1;j<=3;j++){
							if(Integer.parseInt(t[i].ticket[j][0].getText())==r){
								row=j;
								t[i].ticket[j][0].setText(String.valueOf("0"));	//p[i].t.t[j][0])=0;
                              t[i].ticket[j][0].setBackground(Color.GREEN);
								count[i]=count[i]+1;
								break;
							}
						}
					}
					else {
						for(int j=1;j<=3;j++){
							if(Integer.parseInt(t[i].ticket[j][k].getText())==r){//(p[i].t.t[j][k])==r){
								row=j;
								t[i].ticket[j][k].setText(String.valueOf("0"));//(p[i].t.t[j][k])=0;
                           t[i].ticket[j][k].setBackground(Color.GREEN);
								count[i]=count[i]+1;
								break;
<<<<<<< HEAD

							}
						}
						}
						             //checking for any jaldee
							if(count[i]<5){
                             continue;
							}

						if(!fjflag && count[i]==5){
							//number.setText("player"+ i +"wins jaldee");//System.out.println("player" + i + "wins jaldee \n");
                                                 t[i].setTitle("Player"+i+"wins jaldee");
							jflag[i]=1;

						}
						                  //checking for row
=======
								
							}
						}
						}                    
						             //checking for any jaldee 
							if(count[i]<5){
                             continue;	
							}
                      						 
						if(!fjflag && count[i]==5){
							//number.setText("player"+ i +"wins jaldee");//System.out.println("player" + i + "wins jaldee \n"); 
                                                 t[i].setTitle("Player"+i+"wins jaldee");
							jflag[i]=1;
							
						}
						                  //checking for row 
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
					if(count[i]>=5){
						switch(row)	{
                        case 1: if(!frflag[row]){          //first row
					           if(check(i,row)){
								   r1flag[i]=1;
<<<<<<< HEAD
								   //l1.setText("player"+ i +"wins row" + row); //System.out.println("player" + i + "wins row"+ row);
                                                 t[i].setTitle("Player"+i+"wins row"+row);
						       }
							}	break;
						case 2: if(!frflag[row]){        //second row
							        if(check(i,row)){
								      r2flag[i]=1;
								      //l2.setText("player"+ i +"wins row" + row);   //System.out.println("player" + i + "wins row"+ row);
						 t[i].setTitle("Player"+i+"wins row"+row);
							        }
						        }
=======
								   //l1.setText("player"+ i +"wins row" + row); //System.out.println("player" + i + "wins row"+ row); 
                                                 t[i].setTitle("Player"+i+"wins row"+row);
						       }  
							}	break;
						case 2: if(!frflag[row]){        //second row
							        if(check(i,row)){            
								      r2flag[i]=1;
								      //l2.setText("player"+ i +"wins row" + row);   //System.out.println("player" + i + "wins row"+ row);
						 t[i].setTitle("Player"+i+"wins row"+row);		
							        }
						        }	
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
							       break;
						case 3: if(!frflag[row]){        //third row
							        if(check(i,row)){
										r3flag[i]=1;
<<<<<<< HEAD
										//l3.setText("player"+ i +"wins row" + row);//System.out.println("player" + i + "wins row "+row);
=======
										//l3.setText("player"+ i +"wins row" + row);//System.out.println("player" + i + "wins row "+row); 
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
                                                     t[i].setTitle("Player"+i+"wins row"+row);
									}
						        }
								break;
			            }
						if(count[i]==15){
							hflag[i]=1;
						     t[i].setTitle("PLAYER"+i+"WINS HOUSIE");//System.out.println("player "+ i + "wins housie");
<<<<<<< HEAD

						}

					}


=======
							 
						}
                      						
					}
					                            
                                            					
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
			}
			                 //checking any thing happened after the random number "r"
					if(!fjflag){
                    for(int i=1;i<=n;i++){    //jaldee
						if(jflag[i]==1){
							fjflag=true;
							break;
						}
					}
					}
<<<<<<< HEAD

=======
                    
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
                    if(!frflag[1]){				//row1
					    for(int i=1;i<=n;i++){
						 if(r1flag[i]==1){
							frflag[1]=true;
						   break;
<<<<<<< HEAD
					     }
					    }
				    }

=======
					     }		
					    }
				    }
					
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
					if(!frflag[2]){
					 for(int i=1;i<=n;i++){  //row2
						if(r2flag[i]==1){
							frflag[2]=true;
						   break;
<<<<<<< HEAD
						}
=======
						}		
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
					 }
					}
					if(!frflag[3]){
					  for(int i=1;i<=n;i++){  //row3
						if(r3flag[i]==1){
							frflag[3]=true;
						   break;
						}
					  }
					}
					int gameflag=0;
					for(int i=1;i<=n;i++){
						if(hflag[i]==1){
							this.getContentPane().setBackground(Color.green);//System.out.println("game completed");
							gameflag=1;//System.exit(0);
						}
					}
                 if(gameflag==1){}
                	 //break;
			}
		}
		}
<<<<<<< HEAD



=======
				
			
	
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
	public boolean check(int i,int row){
		for(int column=0;column<=9;column++){
			if(Integer.parseInt(t[i].ticket[row][column].getText())!=0)           //(p[i].t.t[row][column])!=0)
			  return false;
<<<<<<< HEAD
		}
		return true;

	}
}
=======
		}  
		return true;
	
	}
}


		
>>>>>>> 36fe322a62e662211c038b555c22cead95b1255a
