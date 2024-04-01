package data;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Exception;
import java.sql.*;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;


public class inv extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	

	public inv() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 885);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton show = new JButton("show ");
		show.setFont(new Font("Tahoma", Font.PLAIN, 15));
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/loginpage","root","groot"); 
					Statement st=c.createStatement();
					String query="select * from inv";
					ResultSet rs=st.executeQuery(query);
					ResultSetMetaData rsmd=rs.getMetaData();
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					
					int cols=rsmd.getColumnCount();
					String[] colName=new String[cols];
					for(int i=0;i<cols;i++)
					{
						colName[i]=rsmd.getColumnName(i+1);
					}
					model.setColumnIdentifiers(colName);
					String blood_group,units;
					while(rs.next())
					{
						
						blood_group=rs.getString(1);
						units=rs.getString(2);
						String[] row= {blood_group,units};
						model.addRow(row);
					}
					st.close();
					c.close();
				
					
				} catch (ClassNotFoundException | SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		show.setBounds(66, 300, 85, 31);
		contentPane.add(show);
		setLocationRelativeTo(null);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(231, 81, 422, 352);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}