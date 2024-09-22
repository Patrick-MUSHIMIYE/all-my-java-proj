package app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import sign_up.Sign_up;
import rgster.Register;

// creation of class and declare the attribute as private static means that no instantiation or calling method outside needed
public class ALU_APP {
	private static JPanel panel;
	private static JFrame Frame;
	private static JLabel username;
	private static JTextField usertext;
	private static JLabel passwordlabel;
	private static JPasswordField passwordtext ;
	private static JButton log_in;

	
public static void main(String[] args) {
	// calling JFrame JPane class, adding panel to Frame and decorating Frame by setting size, DefaultCloseOperation and layout to panel
		panel = new JPanel();
		Frame = new JFrame();
		Frame.setSize(400, 300);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.add(panel);
		panel.setLayout(null);
		
		// adding sign_in label to panel and setBounds of it
		JLabel sign_in = new JLabel("SIGN_IN");
		sign_in.setBounds(160, 10, 300, 50);
		panel.add(sign_in);
		
		// adding user name label to panel and setBounds of it
		username = new JLabel("Username");
		username.setBounds(10, 80, 80, 20);
		panel.add(username);
		
		// adding JTextField with usertext attribute to panel and setBounds of it
		usertext = new JTextField();
		usertext.setBounds(90, 80, 176, 20);
		panel.add(usertext);
		
		// adding JTlabel with passwordlabel attribute to panel and setBounds of it
		passwordlabel = new JLabel("password");
		passwordlabel.setBounds(10, 130, 80, 20);
		panel.add(passwordlabel);
		
		// adding JPasswordField with passwordtext attribute to panel and setBounds of it
		passwordtext = new JPasswordField();
		passwordtext.setBounds(90, 130, 176, 20);
		panel.add(passwordtext);
		
		// adding JButton with log_in attribute to panel and setBounds of it
		log_in = new JButton("log in");
		log_in.setBounds(90, 170, 90, 20);
		log_in.addActionListener(new ActionListener() {  // passing ActionListener when user click on button, the compiler listen and display the output

			@Override
			public void actionPerformed(ActionEvent e) {
					String username = usertext.getText(); // assigning username variable name to usertext.getText to retrieve data input into JTextField
					String password = passwordtext.getText(); // assigning password variable name to password.getText to retrieve data input into JPasswordField
					
					// calling an object called selected to JButton class, will help the compiler to understand which button clicked
					JButton selected = (JButton) e.getSource(); 
						try {
							// get a connection to Database using jdbc url
							Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
							// creation of statement object
							Statement sta = connection.createStatement();
							// creation of variable name querry that will hold the data retrieved from the database/ defining query
							String querry = "(SELECT * FROM sign_up_table where username = '"+usertext.getText()+"' and password = '"+passwordtext.getText()+"')";
							// execute Sql query using ResultSet class
							ResultSet rs = sta.executeQuery(querry);
							// if condition to check if data input is in rs, and return login successfully, press OK to register if rs hold the element.
							if(rs.next()) {
								JOptionPane.showMessageDialog(Frame, "login successfully, press OK to register");
								// call register class main 
							    Register.main(null);
							}
							else {
								//  return incorrect username or password if rs not hold the element
								JOptionPane.showMessageDialog(Frame, "incorrect username or password");
							}
							connection.close();
						}catch(Exception exception) {
							exception.printStackTrace();
						}}				
					});
		// add logi_in to panel
		panel.add(log_in);
		
		// calling signup object with JButton class and set bounds for it
		JButton Signup = new JButton("Sign up");
		Signup.setBounds(200, 170, 90, 20);
		// passing ActionListener when user click on button, the compiler listen and display the output
		Signup.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// call the main of Sign_up class inside actionPerformed
				Sign_up info = new Sign_up();
						Sign_up.main(null);	
			}
			
		});
		// add signup button to panel
		panel.add(Signup);
		Frame.setVisible(true); // set frame visibe by passing boolean value (true)
	}		
}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String username = usertext.getText();
//		String password = passwordtext.getText();
//		JButton selected = (JButton) e.getSource();
//		String textonbutton = selected.getText();
//		if (textonbutton.equals("Sign up")) {
//			
//			Sign_up info = new Sign_up();
//			Sign_up.main(null);
//		}
//		else if (textonbutton.equals("log in"));
//		{
//			try {
////				Class.forName("com.mysql.jdbc.Driver");
//				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
//				Statement sta = connection.createStatement();
//				String querry = "(SELECT * FROM sign_up_table where username = '"+usertext.getText()+"' and password = '"+passwordtext.getText()+"')";
//				System.out.println(username +", " + password);
//				ResultSet rs = sta.executeQuery(querry);
//				if(rs.next()) {
//					JOptionPane.showMessageDialog(Frame, "login successfully, press OK to register");
//				    Register.main(null);
//				}
//				else {
//					JOptionPane.showMessageDialog(Frame, "incorrect username or password");
//				}
//				connection.close();
//			}catch(Exception exception) {
//				exception.printStackTrace();
//			}};
//		}
//		}
//@Override
//public void actionPerformed(ActionEvent e) {
//	String username = usertext.getText();
//	String password = passwordtext.getText();
//	JButton selected = (JButton) e.getSource();
//	String textonbutton = selected.getText();
//	if (textonbutton.equals("log in"));
//	{
//		try {
////			Class.forName("com.mysql.jdbc.Driver");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
//			Statement sta = connection.createStatement();
//			String querry = "(SELECT * FROM sign_up_table where username = '"+usertext.getText()+"' and password = '"+passwordtext.getText()+"')";
//			System.out.println(username +", " + password);
//			ResultSet rs = sta.executeQuery(querry);
//			if(rs.next()) {
//				JOptionPane.showMessageDialog(Frame, "login successfully, press OK to register");
//			    Register.main(null);
//			}
//			else {
//				JOptionPane.showMessageDialog(Frame, "incorrect username or password");
//			}
//			connection.close();
//		}catch(Exception exception) {
//			exception.printStackTrace();
//		}}
//	if(textonbutton.equals("Sign up")) {
//		Sign_up info = new Sign_up();
//		Sign_up.main(null);
//		
//		
//	};
//	}
//	}



