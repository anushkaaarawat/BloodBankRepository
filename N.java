package data;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
class N extends JFrame  
{  
    N(String u)  
    {  
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ImageIcon i=new ImageIcon("C:\\Users\\sahit\\OneDrive\\Pictures\\Screenshots\\vita2.jpg");
    	add(new JLabel(i));
    	pack();
    	
    	JButton btn1 = new JButton("donate");
    	JButton btn2 = new JButton("take");
    	JButton btn3 = new JButton("Show");
    	JButton btn4 = new JButton("Inventory");
    	
    	btn1.setBounds(250,250,100,50);
    	btn2.setBounds(400,250,100,50);
    	btn3.setBounds(550,250,100,50);
    	btn4.setBounds(700,250,100,50);
    	
    	 btn1.addActionListener(new ActionListener() {
             @Override
			public void actionPerformed(ActionEvent e) {
            	 donate d= new donate(); 
 				d.setVisible(true);
				
			}
         });
    	 
    	 btn2.addActionListener(new ActionListener() {
             @Override
			public void actionPerformed(ActionEvent e) {
				take t=new take();
				t.setVisible(true);
				
			}
         });
    	
    	 btn3.addActionListener(new ActionListener() {
             @Override
			public void actionPerformed(ActionEvent e) {
				show s= new show(u); 
				s.setVisible(true);
				
			}
         });
    	 btn4.addActionListener(new ActionListener() {
             @Override
			public void actionPerformed(ActionEvent e) {
				inv s= new inv(); 
				s.setVisible(true);
				
			}
         });
    	 
    	add(btn1);
    	add(btn2);
    	add(btn3);
    	add(btn4);
    	
        setDefaultCloseOperation(javax.swing.  
        WindowConstants.DISPOSE_ON_CLOSE);    
        setSize(1000, 1000); 
        setTitle("Welcome");
        setLocationRelativeTo(null);
    }  
}