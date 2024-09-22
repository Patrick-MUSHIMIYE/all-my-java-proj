package users;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
// creation of class name and its attribute 
public class UsersList{
	static JFrame f;
	static JPanel p;
	static JLabel title;
	static JButton cs;
	static JButton GC;
	static JButton BS;
	static JTable tblData;
	static JScrollPane ScrollPane;
	static JButton clrbtn;
	

	public static void main(String[] args) {
		// calling JFrame JPane class, adding panel to Frame and decorating Frame by setting size, DefaultCloseOperation and layout to panel
		p = new JPanel();
		f = new JFrame("list of enrolled students in each degree program and it's roll number");
		f.setSize(600, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		p.setLayout(null);
		
		// adding JLabel with variable name title to panel
		title = new JLabel("list of enrolled students in each degree program and it's roll number");
		title.setBounds(20, 30, 1000, 35);
		p.add(title);
		p.setBorder(new EmptyBorder(5,5,5,5));
		
		//add scrollpane to panel
		ScrollPane = new JScrollPane();
		ScrollPane.setBounds(30, 150, 432, 188);
		p.add(ScrollPane);
		// set the JTable appeard and displayed in JScrollPane
		tblData = new JTable();
		ScrollPane.setViewportView(tblData);
		
		
	// for the rest of this block of code all are similar, I Created a button for each degree and retrieve data from database regarding grade allo
	// wed to pass either in computer Science, Global challenge and business studies	
		
		cs = new JButton("Computer Science");
		cs.setBounds(10, 90, 150, 35);
		cs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// get a connection to Database using jdbc url
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
					// defining sql userroll
					String userroll = "(SELECT * FROM register cross join roll_nbr where register.Grade >= 18 && register.Grade <= 20)";
					//creation of statement object
					Statement stmt = conn.createStatement();
					// execute Sql query using ResultSet class
					ResultSet out = stmt.executeQuery(userroll);
					//get the metadata about a ResultSet object with rsmd container
					ResultSetMetaData rsmd = out.getMetaData();
					//using model object to DefaultTableModel class to have a default table on panel
					DefaultTableModel model =(DefaultTableModel) tblData.getModel();
					// access and count the column using rsmd and store them into cols variable name
					int cols = rsmd.getColumnCount();
					// declaring Array colName
					String [] colName = new String[cols];
					// loop the from the column
					for (int i = 0; i < cols; i++ )
						colName[i]=rsmd.getColumnName(i+1);
					// display the column name in the table
					model.setColumnIdentifiers(colName);
					String first_name, last_name, Grade, Roll_number;
					
					// looping inside the column name using its index to find the data hold by them
					while(out.next()) {
						first_name = out.getString(1);
						last_name = out.getString(2);
						Grade = out.getString(3);
						Roll_number = out.getString(4);
						String[] row = {first_name,last_name, Grade, Roll_number};
						model.addRow(row);
					}
					// close connection and statement
					out.close();
					conn.close();
					}catch(Exception exception) {
						exception.printStackTrace();
		
					}
			}
		});
		// add cs button to panel
		p.add(cs);
		
		GC = new JButton("Global challenge");
		GC.setBounds(180, 90, 150, 35);
		GC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
					String userroll = "(SELECT * FROM register cross join roll_nbr where register.Grade >= 15 && register.Grade <= 17)";
					Statement stmt = conn.createStatement();
					ResultSet out = stmt.executeQuery(userroll);
					ResultSetMetaData rsmd = out.getMetaData();
					DefaultTableModel model =(DefaultTableModel) tblData.getModel();
					int cols = rsmd.getColumnCount();
					String [] colName = new String[cols];
					for (int i = 0; i < cols; i++ )
						colName[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String first_name, last_name, Grade, Roll_number;
					while(out.next()) {
						first_name = out.getString(1);
						last_name = out.getString(2);
						Grade = out.getString(3);
						Roll_number = out.getString(4);
						String[] row = {first_name,last_name,Grade, Roll_number};
						model.addRow(row);
					}
					out.close();
					conn.close();
					}catch(Exception exception) {
						exception.printStackTrace();
		
					}
			}
		});
		// add GC button to panel
		p.add(GC);
		
		
		BS = new JButton("Business studies");
		BS.setBounds(345, 90, 150, 35);
		BS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/sign_up_database","root","");
					String userroll = "(SELECT * FROM register cross join roll_nbr where register.Grade >= 12 && register.Grade <= 15)";
					Statement stmt = conn.createStatement();
					ResultSet out = stmt.executeQuery(userroll);
					ResultSetMetaData rsmd = out.getMetaData();
					DefaultTableModel model =(DefaultTableModel) tblData.getModel();
					int cols = rsmd.getColumnCount();
					String [] colName = new String[cols];
					for (int i = 0; i < cols; i++ )
						colName[i]=rsmd.getColumnName(i+1);
					model.setColumnIdentifiers(colName);
					String first_name, last_name, Grade, Roll_number;
					while(out.next()) {
						first_name = out.getString(1);
						last_name = out.getString(2);
						Grade = out.getString(3);
						Roll_number = out.getString(4);
						
						String[] row = {first_name,last_name, Grade,Roll_number};
						model.addRow(row);
					}
					out.close();
					conn.close();
					}catch(Exception exception) {
						exception.printStackTrace();
		
					}
			}
		});
		// add BS button to panel
		p.add(BS);
		
		// add clear Jbutton to panel and pass new ActionListener
		clrbtn = new JButton("Clear");
		clrbtn.setBounds(150, 350, 150, 30);
		clrbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// set defaultTableModel empty, when user click on clear it will automatically erase the data from ScrollPane
				tblData.setModel(new DefaultTableModel());
				
			}
			
		});
		p.add(clrbtn);
		
		// set frame visible
		f.setVisible(true);
	}

}
	