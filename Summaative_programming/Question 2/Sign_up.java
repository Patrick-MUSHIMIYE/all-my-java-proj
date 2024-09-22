package sign_up;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

import javax.swing.*;

public class Sign_up implements ActionListener {
	private static JPanel panel;
	private static JFrame f;
	private static JLabel firstname;
	private static JLabel secondname;
	private static JLabel usernamelabel;
	private static JLabel passwordlabel;
	private static JTextField usertext;
	private static JTextField sectext;
	private static JTextField usernametext;
	private static JPasswordField passwordtext ;
	
public static void main(String[] args) {
	// calling JFrame JPane class, adding panel to Frame and decorating Frame by setting size, DefaultCloseOperation and layout to panel
	panel = new JPanel();
	f = new JFrame();
	f.setSize(500, 500);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.add(panel);
	panel.setLayout(null);
	
	// adding sign_in label to panel and setBounds of it
	JLabel sign_in = new JLabel("SIGN_UP");
	sign_in.setBounds(150, 10, 300, 50);
	panel.add(sign_in);
	
	// adding firstname label to panel and setBounds of it
	firstname = new JLabel("firstname");
	firstname.setBounds(10, 80, 80, 20);
	panel.add(firstname);
	
	// adding JTextField with usertext attribute to panel and setBounds of it
	usertext = new JTextField();
	usertext.setBounds(90, 80, 176, 20);
	panel.add(usertext);
	
	// adding secondname label to panel and setBounds of it
	secondname = new JLabel("lastname");
	secondname.setBounds(10, 130, 80, 20);
	panel.add(secondname);
	
	// adding JTextField with sectext attribute to panel and setBounds for it
	sectext = new JTextField();
	sectext.setBounds(90, 130, 176, 20);
	panel.add(sectext);
	
	// adding username label to panel and setBounds for it
	usernamelabel = new JLabel("username");
	usernamelabel.setBounds(10, 180, 80, 20);
	panel.add(usernamelabel);
	
	// adding JTextField with username text attribute to panel and setBounds for it
	usernametext = new JTextField();
	usernametext.setBounds(90, 180, 176, 20);
	panel.add(usernametext);
	
	// adding password label to panel and setBounds for it
	passwordlabel = new JLabel("password");
	passwordlabel.setBounds(10, 220, 80, 20);
	panel.add(passwordlabel);
	
	// adding JPasswordField with passwordtext attribute to panel and setBounds for it
	passwordtext = new JPasswordField();
	passwordtext.setBounds(90, 220, 176, 20);
	panel.add(passwordtext);

	// adding JButton with sign_in attribute to panel and setBounds of it
	JButton Sign_up = new JButton("Sign up");
	Sign_up.setBounds(100, 250, 90, 20);
	Sign_up.addActionListener(new Sign_up()); //call ActionListener by passing new Sign_up class when user click on button, the compiler listen and display the output
	panel.add(Sign_up);

	// set frame visible
	f.setVisible(true);
	}		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		String firstname = usertext.getText(); // assigning firstname variable name to usertext.getText to retrieve data input into JTextField
		String lastname = sectext.getText();  // assigning lastname variable name to sectext.getText to retrieve data input into JTextField
		String username = usernametext.getText(); // assigning username variable name to usernametext.getText to retrieve data input into JTextField
		String pass = passwordtext.getText(); // assigning pass variable name to passwordtext.getText to retrieve data input into JPasswordField
		int password = Integer.parseInt(pass); // converting String password into integer datatype
		String msg1 = ""+ firstname; // assigning value of firstname to msg1 variable
		String msg2 = ""+ lastname;  // assigning value of lastname to msg2 variable

		try {
			// get a connection to Database using jdbc url
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
			// defining query
			String querry = "INSERT INTO sign_up_table(firstname,lastname,username,password) VALUES ('"+firstname+"','"+lastname+"','"+username+"','"+password+"')";
			//creation of statement object
			Statement sta = connection.createStatement();
			// executing Sql query
			Integer x = sta.executeUpdate(querry);
			// if condition to check account has either created or not
			if(x == 0)
			{
				JOptionPane.showMessageDialog(f, "no account created");
			}
			else {
				JOptionPane.showMessageDialog(f, "welcome, " + msg1 + " "+ msg2 +" your account has successfully created, press ok, close the sign up flame and log in");
			}
			// close database connection
			connection.close();
		}catch(Exception exception) {
			exception.printStackTrace();
		}};
			
	}


