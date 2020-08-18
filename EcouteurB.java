import java.awt.event.*;
import javax.swing.*;

public class EcouteurB implements ActionListener {

	JTextField tt= new JTextField();
	static int test=1;
	EcouteurB(JTextField tt){
		this.tt=tt;
	}
	
	public void actionPerformed(ActionEvent e)
	{	JButton b=(JButton) e.getSource();
	
		if (b.getActionCommand().equals("1") || b.getActionCommand().equals("2") ||b.getActionCommand().equals("3") ||b.getActionCommand().equals("4")||b.getActionCommand().equals("5")||b.getActionCommand().equals("6")||b.getActionCommand().equals("7")||b.getActionCommand().equals("8")||b.getActionCommand().equals("9")||b.getActionCommand().equals("0") )
			{if (test==0)
			 tt.setText(tt.getText()+b.getActionCommand());
			else {tt.setText(b.getActionCommand());test=0;}
			
			}
		else if (b.getActionCommand().equals("+") || b.getActionCommand().equals("-") || b.getActionCommand().equals("*") || b.getActionCommand().equals("/") )
		
			{tt.setText(tt.getText()+b.getActionCommand());
			 test=0;
			}
		else if (b.getActionCommand().equals("ClearAll"))
				{tt.setText("0");test=1;}
		else if (b.getActionCommand().equals("+/-")) 
		{ if (tt.getText().indexOf("-")==0)
			tt.setText(tt.getText().substring(1));
		 else tt.setText("-"+tt.getText());
		}
		
		
		else if (b.getActionCommand().equals("Enter"))
		{	test=1;
			String s=new String();
			s=tt.getText();
			int i,j,m=0,k=0;
			if(s.indexOf("+",1)!=-1)
				{
				
				i=	Integer.parseInt(s.substring(0, s.indexOf("+")));
				
                j=Integer.parseInt(s.substring(s.indexOf("+")+1));
                k=i+j;
			
		         }
			
			else if(s.indexOf("-",1)!=-1)
			{
			i=	Integer.parseInt(s.substring(0, s.indexOf("-",1)));
            j=Integer.parseInt(s.substring(s.indexOf("-",1)+1));
            k=i-j;}
			
		
	         
			else if(s.indexOf("*",1)!=-1)
			{i=	Integer.parseInt(s.substring(0, s.indexOf("*")));
            j=Integer.parseInt(s.substring(s.indexOf("*")+1));
            k=i*j;
		
	         }
			else if(s.indexOf("/",1)!=-1)
			{i=	Integer.parseInt(s.substring(0, s.indexOf("/")));
             j=Integer.parseInt(s.substring(s.indexOf("/")+1));
             if (j!=0)
               {k=i/j;
             	m=0;}
             else 
            	 m=1;
		
	         }
			else if (s.indexOf("-")==0 & s.indexOf("-",1)==-1)
				k=Integer.parseInt(s);
		
				
			if  (m==1)
				tt.setText("Error");
			else
			    tt.setText(new Integer(k).toString());	
		}
		
		
			
		
				
				
	}
	
	
	
}
