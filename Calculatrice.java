import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculatrice extends JFrame {
	
	Calculatrice(){
		super("Calculatrice");
		JTextField tt=new JTextField(20);
		tt.setText("0");
		setLayout(new BorderLayout());
		
		JPanel p1= new JPanel();
		add(p1,"North");
		p1.add(tt);
		
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		JButton b0=new JButton("0");
		JButton bplus=new JButton("+/-");
		JButton bclear=new JButton("ClearAll");
		
		Panel p2=new Panel();
		add(p2,"West");
		p2.setLayout(new GridLayout(4,3));
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b0);
		p2.add(bplus);
		p2.add(bclear);
		
		JButton bplu=new JButton("+");
		JButton bmoins=new JButton("-");
		JButton bfois=new JButton("*");
		JButton bdiv=new JButton("/");
		
		Panel p3=new Panel();
		p3.setLayout(new GridLayout(4,1));
		add(p3,"East");
		p3.add(bplu);
		p3.add(bmoins);
		p3.add(bfois);
		p3.add(bdiv);
		
		JButton enter=new JButton("Enter");
		Panel p4=new Panel();
		enter.setSize(50, 60);
		add(p4,"South");
		p4.add(enter);
		
		pack();
		setVisible(true);
		b1.addActionListener(new EcouteurB(tt));
		b2.addActionListener(new EcouteurB(tt));
		b3.addActionListener(new EcouteurB(tt));
		b4.addActionListener(new EcouteurB(tt));
		b5.addActionListener(new EcouteurB(tt));
		b6.addActionListener(new EcouteurB(tt));
		b7.addActionListener(new EcouteurB(tt));
		b8.addActionListener(new EcouteurB(tt));
		b9.addActionListener(new EcouteurB(tt));
		b0.addActionListener(new EcouteurB(tt));
		bplu.addActionListener(new EcouteurB(tt));
		bmoins.addActionListener(new EcouteurB(tt));
		bfois.addActionListener(new EcouteurB(tt));
		bdiv.addActionListener(new EcouteurB(tt));
		enter.addActionListener(new EcouteurB(tt));
		bclear.addActionListener(new EcouteurB(tt));
		bplus.addActionListener(new EcouteurB(tt));
		
		
		
				
				
		
	}
 public static void main(String args[]) {
	 
	 Calculatrice cal=new Calculatrice();
 }

}
