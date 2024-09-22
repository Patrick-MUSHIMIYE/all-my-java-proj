package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// create a class name and use implements ActionListener to access abstract(interface) in the main
public class Calculator implements ActionListener{
	// declaring JFrame class and JTextField,JButton,JPanel components
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton add_sign_Btn,sub_sign_Btn,mul_sign_Btn,div_sign_Btn;
	JButton decimal_point_Btn, negative_sign_Btn, equal_sign_Btn, delete_Btn, clear_Btn;
	JPanel panel;
	
	// set font colour
	Font myFont = new Font("Serif",Font.ROMAN_BASELINE,28);
	
	// assigning 0 as default value for variable num1, num2, and result
	double num1 = 0, num2 = 0, result = 0;
	char operator;// declare variable operator as character that will hold all operators
	
	// create a constructor by calling class itself
	Calculator(){
		// call new JFrame and Decorating a frame by setting size, frame layout and defaultClose operation
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);
		
		//call new JTextField and Decorating it by setting Bounds, font, background and set as editable
		textfield = new JTextField();
		textfield.setBounds(50, 25, 300, 50);
		textfield.setFont(myFont);
		textfield.setBackground(Color.WHITE);
		textfield.setEditable(false);
		
		// add operators to JButton hold by add_sign_Btn variable, sub_sign_Btn, mul_sign_Btn, div_sign_Btn, decimal_point_Btn, negative_sign_Btn, equal_sign_Btn,delete_btn, clear_Btn variable
		add_sign_Btn  = new JButton("+");
		sub_sign_Btn  = new JButton("-");
		mul_sign_Btn  = new JButton("*");
		div_sign_Btn  = new JButton("/");
		decimal_point_Btn = new JButton(".");
		negative_sign_Btn = new JButton("(-)");
		equal_sign_Btn  = new JButton("=");
		delete_Btn  = new JButton("Delete");
		clear_Btn = new JButton("C");
		
		// add all operators button to functionButtons Array
		functionButtons[0] = add_sign_Btn;
		functionButtons[1] = sub_sign_Btn;
		functionButtons[2] = mul_sign_Btn;
		functionButtons[3] = div_sign_Btn;
		functionButtons[4] = decimal_point_Btn;
		functionButtons[5] = negative_sign_Btn;
		functionButtons[6] = equal_sign_Btn;
		functionButtons[7] = delete_Btn;
		functionButtons[8] = clear_Btn;
		
		// using for loop to iterate through this functionButtons array
		for(int i =0;i<9;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		// using for loop to iterate through numberButtons array
		for(int i =0;i<10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));	
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
			
		}
		// setting bounds to negative_sign_btn, delete_btn, clear_btn, and set backgrounds with green colour to add_sign_Btn,sub_sign_Btn,div_sign_Btn,mul_sign_Btn
		negative_sign_Btn.setBounds(40, 430, 100, 50);
		delete_Btn.setBounds(150,430,110,50);
		clear_Btn.setBounds(270,430,100,50);
		add_sign_Btn.setBackground(Color.GREEN);
		sub_sign_Btn.setBackground(Color.GREEN);
		div_sign_Btn.setBackground(Color.GREEN);
		mul_sign_Btn.setBackground(Color.GREEN);

		// set font, foreground and background to clear_btn
		clear_Btn.setFont(myFont);
		clear_Btn.setForeground(Color.WHITE);
		clear_Btn.setBackground(Color.RED);
		
		
		//call new JPanel and Decorating it by setting Bounds, layout, and set background of panel as gray
		panel = new JPanel();
		panel.setBounds(50, 100, 300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.GRAY);
		
		// add numberButtons with it's index to the panel, and also add mul_sign_Btn,mul_sign_Btn,equal_sign_Btn and div_sign_btn
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(add_sign_Btn);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(sub_sign_Btn);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mul_sign_Btn);
		panel.add(decimal_point_Btn);
		panel.add(numberButtons[0]);
		panel.add(equal_sign_Btn);
		panel.add(div_sign_Btn);
		
		// add panel, negative_sign_btn,delete_btn,clear_btn, and textField to frame
		frame.add(panel);
		frame.add(negative_sign_Btn);
		frame.add(delete_Btn);
		frame.add(clear_Btn);
		frame.add(textfield);
		
		// set frame by passing true boolean value
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		// create a class object with class name
		Calculator calc = new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// for loop to iterate through numberButtons
		for(int i=0; i<10; i++){
			// condition to check if the number clicked on the panel is held by numberButton variables names
			if (e.getSource() == numberButtons[i]) {
				// if number is in numberButtons, will be updated and displayed on textField 
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
		}
		// condition to check if decimal point is hold by decimal_point_Btn, when user click on decimal_point_btn, the dot point will be displayed on the textField
		if (e.getSource() == decimal_point_Btn) {
			textfield.setText(textfield.getText().concat("."));
		}
		// condition to check the plus sign in add_asign_btn 
		if (e.getSource() == add_sign_Btn) {
			// Initialising  variable num1 as Double data type
			num1 = Double.parseDouble(textfield.getText());
			operator = '+'; // assign sign plus to operator variable name
			textfield.setText(""); // set empty text to textField
	}
		// condition to check the minus sign in add_asign_btn 
		if (e.getSource() == sub_sign_Btn) {
			// Initialising  variable num1 as Double data type
			num1 = Double.parseDouble(textfield.getText());
			operator = '-'; // assign sign minus to operator variable name
			textfield.setText(""); // // set empty text to textField
		}
		
		// condition to check the multiplication sign in add_asign_btn 
		if (e.getSource()==mul_sign_Btn) {
			//  Initialising  variable num1 as Double data type
			num1 = Double.parseDouble(textfield.getText());
			operator = '*'; // assign sign multiplication to operator variable name
			textfield.setText(""); // set empty text to textField
	}
		// condition to check the division sign in add_asign_btn 
		if (e.getSource() == div_sign_Btn) {
			// Initialising  variable num1 as Double data type
			num1 = Double.parseDouble(textfield.getText());
			operator = '/'; // assign sign division to operator variable name
			textfield.setText(""); // set empty text to textField
		}
		// condition to check the division sign in add_asign_btn 
	if (e.getSource() == equal_sign_Btn) {
		// Initialising  variable num1 as Double data type
		num2 = Double.parseDouble(textfield.getText());
		
		// use switch statement pass operator as expression
		switch(operator) {
		// if case is +, num1 will be added to num2 and the result variable hold the value
		case'+':
			result = num1 + num2;
			break; // use break to terminate the expression
		// if case is -, num1 will be subtracted to num2 and the result variable hold the value
		case'-':
			result = num1 - num2;
			break; // use break to terminate the expression
		// if case is *, num1 will be multiplied to num2 and the result variable hold the value
		case'*':
			result = num1 * num2;
			break; // use break to terminate the expression
		// if case is /, num1 will be divided by num2 and result hold the value
		case'/':
			result = num1 / num2;
			break; // use break to terminate the expression
		}
		// display the result in textField
		textfield.setText(String.valueOf(result));
		num1 = result;
	}
	// condition to check if user click on clear_btn, the textField will remain empty
	if (e.getSource() == clear_Btn) {
		textfield.setText("");
	}
	// condition to check if user click on delete_btn, the least digit will be deleted as you keep clicking on delete_btn 
	if (e.getSource() == delete_Btn) {
		String string = textfield.getText();
		textfield.setText("");
		for(int i =0; i<string.length()-1; i++) {
			textfield.setText(textfield.getText()+ string.charAt(i));
		}
	}
	// condition to check if user input sign minus at the most digit of element
		if (e.getSource() == negative_sign_Btn) {
			double temp = Double.parseDouble(textfield.getText());
			temp*=-1;
			textfield.setText(String.valueOf(temp));
}
	}
	// creation of add_sign_Btn method, its expression and return the result
	public double add_sign_Btn(double num1, double num2, double result) {
		result = num1 + num2;
		return result;
	}
	// creation of sub_sign_Btn method, its expression and return the result
	public double sub_sign_Btn(double num1, double num2, double result) {
		result = num1 - num2;
		return result;
}
	// creation of mul_sign_Btn method, its expression and return the result
	public double mul_sign_Btn(double num1, double num2, double result) {
		result = num1 * num2;
		return result;
}	
	// creation of div_sign_Btn method, its expression and return the result
	public double div_sign_Btn(double num1, double num2, double result) {
		result = num1 / num2;
		return result;
}
}
