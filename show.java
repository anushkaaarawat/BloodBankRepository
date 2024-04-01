package data;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Exception;
import java.sql.*;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;


public class show extends JFrame {
	

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	

	public show(String User) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int i=0;
		try {
		            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage", "root", "groot");
		            PreparedStatement statement = conn.prepareStatement("select * from details where username=?");
		            statement.setString(1, User);
		            ResultSet rs= statement.executeQuery();
		            while(rs.next()&&i<1000){
		               int age=rs.getInt("age");
		               String bg=rs.getString("blood_group");
		                String ag=String.valueOf(age);
		                String name=rs.getString("username");
		                
		                
		                
		                JLabel l =new JLabel(bg);
		                JLabel l1 =new JLabel(ag);
		                JButton b =new JButton("");
		                JLabel l2=new JLabel(name);
		                
		                
		                l.setBounds(200,10+i,105,30);
		                l1.setBounds(300,10+i,105,30);
		                l2.setBounds(100,10+i,100,20);
		               
		                add(l2);
		                add(l);
		                add(l1);
		                add(b);
		                
		                
		                
		                b.setVisible(false);
		                setSize(1000,1000);
		            	setLocationRelativeTo(null);
		                setVisible(true);
		                i +=30;
		              
		            }
		            statement.close();
		        }catch(SQLException e){
		            e.printStackTrace();
		            System.out.print("Error");

		        }
			}
		
		
	
}
