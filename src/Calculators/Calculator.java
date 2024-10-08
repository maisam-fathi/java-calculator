package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 235, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 200, 40);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		// -------------- Row 1 -------------
				JButton btnBackSpace = new JButton("\u2190");
				btnBackSpace.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String backspace = null;
								
						if(txtDisplay.getText().length() > 0) {
							StringBuilder strB = new StringBuilder(txtDisplay.getText());
							strB.deleteCharAt(txtDisplay.getText().length()-1);
							backspace = strB.toString();
							txtDisplay.setText(backspace);
						}
					}
				});
				btnBackSpace.setFont(new Font("Tahoma", Font.BOLD, 16));
				btnBackSpace.setBounds(10, 60, 50, 50);
				frame.getContentPane().add(btnBackSpace);
				
				JButton btnClear = new JButton("C");
				btnClear.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						txtDisplay.setText(null);
					}
				});
				btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnClear.setBounds(60, 60, 50, 50);
				frame.getContentPane().add(btnClear);
				
				JButton btnPercent = new JButton("%");
				btnPercent.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "%";
					}
				});
				btnPercent.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnPercent.setBounds(110, 60, 50, 50);
				frame.getContentPane().add(btnPercent);
				
				JButton btnPlus = new JButton("+");
				btnPlus.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "+";
					}
				});
				btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPlus.setBounds(160, 60, 50, 50);
				frame.getContentPane().add(btnPlus);
				
		// -------------- Row 2 -------------
				JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String EnterNumber = txtDisplay.getText() + btn7.getText();
					txtDisplay.setText(EnterNumber);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn7.setBounds(10, 110, 50, 50);
				frame.getContentPane().add(btn7);
		
				JButton btn8 = new JButton("8");
				btn8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					String EnterNumber = txtDisplay.getText() + btn8.getText();
					txtDisplay.setText(EnterNumber);	
					}
				});
				btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn8.setBounds(60, 110, 50, 50);
				frame.getContentPane().add(btn8);
		
				JButton btn9 = new JButton("9");
				btn9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn9.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn9.setBounds(110, 110, 50, 50);
				frame.getContentPane().add(btn9);
		
				JButton btnSub = new JButton("-");
				btnSub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "-";
					}
				});
				btnSub.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnSub.setBounds(160, 110, 50, 50);
				frame.getContentPane().add(btnSub);
		
				// -------------- Row 3 -------------
				JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn4.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(10, 160, 50, 50);
				frame.getContentPane().add(btn4);
		
				JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn5.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBounds(60, 160, 50, 50);
				frame.getContentPane().add(btn5);
		
				JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn6.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBounds(110, 160, 50, 50);
				frame.getContentPane().add(btn6);
		
				JButton btnMulti = new JButton("x");
				btnMulti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "*";
					}
				});
				btnMulti.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnMulti.setBounds(160, 160, 50, 50);
				frame.getContentPane().add(btnMulti);

				// -------------- Row 4 -------------
				JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn1.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(10, 210, 50, 50);
				frame.getContentPane().add(btn1);
		
				JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn2.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBounds(60, 210, 50, 50);
				frame.getContentPane().add(btn2);
		
				JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn3.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBounds(110, 210, 50, 50);
				frame.getContentPane().add(btn3);
		
				JButton btnDiv = new JButton("/");
				btnDiv.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						firstnum = Double.parseDouble(txtDisplay.getText());
						txtDisplay.setText("");
						operations = "/";
					}
				});
				btnDiv.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDiv.setBounds(160, 210, 50, 50);
				frame.getContentPane().add(btnDiv);
				
				// -------------- Row 5 -------------
				JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btn0.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(10, 260, 50, 50);
				frame.getContentPane().add(btn0);
		
				JButton btnDot = new JButton(".");
				btnDot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String EnterNumber = txtDisplay.getText() + btnDot.getText();
						txtDisplay.setText(EnterNumber);
					}
				});
				btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnDot.setBounds(60, 260, 50, 50);
				frame.getContentPane().add(btnDot);
		
				JButton btnPlMn = new JButton("\u00B1");
				btnPlMn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
						ops = ops * (-1);
						txtDisplay.setText(String.valueOf(ops));
					}
				});
				btnPlMn.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnPlMn.setBounds(110, 260, 50, 50);
				frame.getContentPane().add(btnPlMn);
		
				JButton btnEqual = new JButton("=");
				btnEqual.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String answer;
						secondnum = Double.parseDouble(txtDisplay.getText());
						if (operations == "+")
						{
							result = firstnum + secondnum;
							answer = String.format("%.0f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "-")
						{
							result = firstnum - secondnum;
							answer = String.format("%.0f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "*")
						{
							result = firstnum * secondnum;
							answer = String.format("%.0f", result);
							txtDisplay.setText(answer);
						}
						else if (operations == "/")
						{
							result = firstnum / secondnum;
							answer = String.format("%.0f", result);
							txtDisplay.setText(answer);
						}
						if (operations == "%")
						{
							result = firstnum % secondnum;
							answer = String.format("%.0f", result);
							txtDisplay.setText(answer);
						}
					}
				});
				btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnEqual.setBounds(160, 260, 50, 50);
				frame.getContentPane().add(btnEqual);
	}
}
