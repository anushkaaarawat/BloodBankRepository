package data;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Exception;
import java.sql.*;


class mmm implements ActionListener{
	JLabel l1;
	JTextField t;
    JTextField p;
	JLabel l2;
	JButton l4;
	mmm()
	{
JFrame f=new JFrame("Blood Donation");

l1=new JLabel();
l1.setText("Username");
l2=new JLabel();
l2.setText("Password");
t=new JTextField(15);
p=new JTextField(15);
l4=new JButton();
l4.setVisible(false);
JButton b1=new JButton("Submit");

ImageIcon i=new ImageIcon("C:\\Users\\sahit\\OneDrive\\Pictures\\Screenshots\\vita2.jpg");
f.add(new JLabel(i));
f.pack();




JLabel l3;
l3=new JLabel("VITA-DONOR");

l3.setBounds(300,200,100,20);
l1.setBounds(250,250,100,20);
t.setBounds(350,250,100,20);
l2.setBounds(250,300,100,20);
p.setBounds(350,300,100,20);
b1.setBounds(300,350,100,20);

b1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		String u=t.getText();
		String v=p.getText();
		boolean obje =LoginBackend.authenticateUser(u,v);
		if(obje){
			N obj=new N(u);
			JLabel l=new JLabel("welcome "+u);
			obj.getContentPane().add(l);
			obj.setVisible(true);
		}
		else
		{
          
		 }
		
	}
});

f.add(l3);
f.add(l1);
f.add(t);
f.add(p);
f.add(b1);
f.add(l2);

f.setSize(1000,1000);
f.setLocationRelativeTo(null);
f.setLayout(null);
f.setVisible(true);

	}
	

}
public class Mini{
	    public static void main(String arg[])  
	    {  
	        try  
	        {  
	            
	            mmm form = new mmm();  
	          // form.setSize(350,200);
	          //  form.setVisible(true);
	              
	        }  
	        catch(Exception e)  
	        {     
	           
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        	
	           
	        	
	        }  
	    }  

	
}

