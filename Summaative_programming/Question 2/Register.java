package rgster;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Calendar;
import java.util.Random;

import javax.swing.*;
import users.UsersList;

// creation of class name implements ActionListener
public class Register implements ActionListener {
	private static JFrame frm;
	static JPanel pnl;
	static JLabel lblhead;
	static JLabel first_name;
	static JLabel second_name;
	static JLabel Grade;
	static JTextField firstname;
	static JTextField secondname;
	static JTextField grade;
	static JButton reg;
	static JButton degree;


	
// inside of main class
	public static void main(String[] args) {
		// calling JFrame JPane class, adding panel to Frame and decorating Frame by setting size, DefaultCloseOperation and layout to panel
		pnl = new JPanel();
		frm = new JFrame();
		frm.setSize(400, 500);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.add(pnl);
		pnl.setLayout(null);
		
		// adding JLabel With lblhead variable name to panel and setBounds
		lblhead = new JLabel("Register with your names and Grade");
		lblhead.setBounds(80, 10, 300, 50);
		pnl.add(lblhead);
		
		// adding JLabel with first_name variable name to panel and setBounds
		first_name = new JLabel("first_name");
		first_name.setBounds(10, 80, 80, 20);
		pnl.add(first_name);
		
		// adding JTextField with firstname variable name to panel and setBounds
		firstname = new JTextField();
		firstname.setBounds(105, 80, 176, 20);
		pnl.add(firstname);
		
		// adding JLabel with second_name to panel and setBounds
		second_name = new JLabel("second_name");
		second_name.setBounds(10, 130, 96, 20);
		pnl.add(second_name);
		
		// adding JTextField with secondname variable name to panel and setBounds
		secondname = new JTextField();
		secondname.setBounds(105, 130, 176, 20);
		pnl.add(secondname);
		
		// adding JLabel with first_name variable to panel and setBounds
		Grade = new JLabel("Grade");
		Grade.setBounds(20, 175, 96, 20);
		pnl.add(Grade);
		
		// adding JTextField with grade variable name to panel and setBounds
		grade = new JTextField();
		grade.setBounds(105, 175, 176, 20);
		pnl.add(grade);
		
		// adding JButton with reg variable name to panel, setBounds and add ActonListener
		reg = new JButton("Submit");
		reg.setBounds(120, 220, 90, 20);
		reg.addActionListener(new Register());
		pnl.add(reg);
		
		// adding JButton with degree variable name to panel, setBounds and add ActonListener
		degree = new JButton("list of registered sudent");
		degree.setBounds(70, 250, 170, 20);
		degree.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	
				// call UsersList class main 
				UsersList.main(null);
			}
			
		});
		// add degree to panel
		pnl.add(degree);
		
		// set frame visible
		frm.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// calling an object called selected to JButton class, will help the compiler to understand which button clicked
		JButton selected = (JButton) e.getSource();
		
		// access the text using selected objec and store them to textonbutton
		String textonbutton = selected.getText();
		
		//assigning firstname.getText() to first_name
		String first_name = firstname.getText(); 
		
		//assigning secondname.getText() to second_name
		String second_name = secondname.getText();
		
		//assigning and accepting integer value
		int Grade = Integer.parseInt(grade.getText());
		
		// create and call calendar class to get current year
		Calendar c = Calendar.getInstance();
		// access current year by passing two argument which 2 specify current year and true
		c.roll(2, true);
		// creating object to Random class
		Random unique = new Random();
		
		// using random object name to provide a random unique number
		int unique_number = unique.nextInt(1000);
		String l = "/"; // variable name l hold forward slash
		// creation of roll_number variable name hold the student roll number(current year and unique number)
		String Roll_number = (c.get(Calendar.YEAR)+""+l+""+unique_number);
		
		
		try {
			// get a connection to Database using jdbc url
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
			// defining query for register table
			String querry = "INSERT INTO register(first_name,second_name,Grade) VALUES ('"+first_name+"','"+second_name+"','"+Grade+"')";
			// defining query for roll_nbr
			String querr = "INSERT INTO roll_nbr(Roll_number) VALUES ('"+Roll_number+"')";
			//creation of statement object for register
			Statement sta = connection.createStatement();
			//creation of statement object for roll_nbr
			Statement stmt = connection.createStatement();
			// executing Sql query
			stmt.executeUpdate(querr);
			int x = sta.executeUpdate(querry);
			
			// if condition to check account has either created or not
			if (x == 0) {
				JOptionPane.showMessageDialog(frm, "you are not registered");	
			}
			else {
				JOptionPane.showMessageDialog(frm, "welcome, you have already registered, press Ok to check your program");
				// if condition to check if student grade is less or equal 20 and grater or equal 18
				if (Integer.parseInt(grade.getText()) >= 18 && Integer.parseInt(grade.getText()) <= 20){
					// print a statement using JOptionPane.showMessageDialog if result is between the specified grade
					JOptionPane.showMessageDialog(frm, (" your roll number is " + (c.get(Calendar.YEAR)+""+l+""+unique_number)));
					JOptionPane.showMessageDialog(frm, "you are enrolled under computer science");
//					System.out.println("your enrolled number is " +c.get(Calendar.YEAR)+""+ l +""+ unique_number);
				}
				// if condition to check if student grade is less or equal 17 and grater or equal 15
				else if (Integer.parseInt(grade.getText()) >= 15 && Integer.parseInt(grade.getText()) <= 17) {
					// print a statement using JOptionPane.showMessageDialog if result is between the specified grade
					JOptionPane.showMessageDialog(frm, (" your roll number is " + c.get(Calendar.YEAR)+""+l+""+unique_number));
					JOptionPane.showMessageDialog(frm, "you are enrolled under Global challenge");
//					System.out.println("your enrolled number is " +c.get(Calendar.YEAR)+""+ l +""+ unique_number);

				}
				// if condition to check if student grade is less or equal 14 and grater or equal 12
				else if (Integer.parseInt(grade.getText()) >= 12 && Integer.parseInt(grade.getText()) <= 14) {
					// print a statement using JOptionPane.showMessageDialog if result is between the specified grade
					JOptionPane.showMessageDialog(frm, (" your roll number is " + c.get(Calendar.YEAR)+""+l+""+unique_number));
					JOptionPane.showMessageDialog(frm, "you are enrolled under Business studies");	
//					System.out.println("your enrolled number is " +c.get(Calendar.YEAR)+""+ l +""+ unique_number);

				}
				// print a statement using JOptionPane.showMessageDialog no admission if result is not between the specified grade

				else {
					JOptionPane.showMessageDialog(frm, "no admission");	
					System.exit(0);
				}
			}
			connection.close();
		}catch(Exception exception) {
			exception.printStackTrace();
		
		}
		// if list of registered student button clicked, return the result from UsersList main class
		if (textonbutton.equals("list of registered student"));
		{ 
			UsersList.main(null);
		}};

	}
	


