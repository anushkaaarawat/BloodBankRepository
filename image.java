package data;
import javax.swing.*;
import java.awt.*;
public class image {

	public static void main(String[] args) {
		JFrame f=new JFrame("Chutiyaap");
		ImageIcon i=new ImageIcon("C:\\Users\\sahit\\OneDrive\\Pictures\\Camera Roll\\WIN_20230322_15_14_15_Pro.jpg");
		f.add(new JLabel(i));
		f.pack();
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
