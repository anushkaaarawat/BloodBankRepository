package data;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Exception;
import java.sql.*;


public class donate extends JFrame {
	
	public donate()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon i=new ImageIcon("C:\\Users\\sahit\\OneDrive\\Pictures\\Screenshots\\vita2.jpg");
		add(new JLabel(i));
		pack();
		
		try {
			
		JLabel l1=new JLabel("Blood group:");
		JTextField f1=new JTextField(5);
		JButton b=new JButton("Done");
		
		
		l1.setBounds(250,250,100,20);
		f1.setBounds(350,250,100,20);
		b.setBounds(300,350,100,20);
		
		
		b.addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	new donatebackend(f1.getText());
           	 thanks d= new thanks(); 
				d.setVisible(true);
				
			}
        });
		
		
		
		add(l1);
		add(f1);
		add(b);
		
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		}
		catch(Exception e){
           
            System.out.print("Error");

        }
		
		
	}
	
	
	

}
