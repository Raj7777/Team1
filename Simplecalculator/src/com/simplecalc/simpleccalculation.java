package com.simplecalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;//nu se formeaza cand fac butonul in design? R: dublu click pe buton in design
import java.awt.event.ActionEvent;//nu se formeaza cand fac butonul in design?R: la fel ca sus
import javax.swing.JOptionPane; // where is in design? how to create?

public class simpleccalculation {

	private JFrame frame;
	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField textResult;
	private double num1, num2, result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpleccalculation window = new simpleccalculation();
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
	public simpleccalculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 367);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Simple Calculator App");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 414, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 57, 72, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(20, 112, 86, 21);
		frame.getContentPane().add(lblNewLabel_2);
		
		textNum1 = new JTextField();
		textNum1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textNum1.setBounds(153, 61, 174, 20);
		frame.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		textNum2 = new JTextField();
		textNum2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textNum2.setBounds(153, 112, 174, 20);
		frame.getContentPane().add(textNum2);
		textNum2.setColumns(10);
		
		JLabel lblResult = new JLabel("The Result is");
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblResult.setBounds(20, 221, 86, 45);
		frame.getContentPane().add(lblResult);
		
		textResult = new JTextField();
		textResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textResult.setBounds(153, 236, 111, 21);
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);	
		
		JButton btnPlussButton = new JButton("+");
		btnPlussButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {						
				try {//new? explain!!(integer.parseInt, double.parse?)whai is parse? de ce nu am pus doar int ci integer?(pt numere fara decimala)
					num1=Double.parseDouble(textNum1.getText());
					num2= Double.parseDouble(textNum2.getText());
					result = num1+num2;
						textResult.setText(Double.toString(result));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");// de ce am folosit null si cand se foloseste?				
				}
			}
		});		
		btnPlussButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnPlussButton.setBounds(17, 171, 61, 39);
		frame.getContentPane().add(btnPlussButton);
		
		JButton btnMinusButton = new JButton("-");
		btnMinusButton.addActionListener(new ActionListener() {// nu apare cand formes butonul in design? R: dubluc clic pe buton in design
			public void actionPerformed(ActionEvent e) {
				try {
					num1= Double.parseDouble(textNum1.getText());
					num2= Double.parseDouble(textNum2.getText());
					result = num1-num2;				
					textResult.setText(Double.toString(result));
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}			
		});
		btnMinusButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnMinusButton.setBounds(88, 171, 61, 39);
		frame.getContentPane().add(btnMinusButton);
		
		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1= Double.parseDouble(textNum1.getText());
					num2= Double.parseDouble(textNum2.getText());
					result = num1*num2;
					textResult.setText(Double.toString(result));
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
		});
		btnMultiply.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnMultiply.setBounds(159, 171, 61, 39);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("\u00F7");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1= Double.parseDouble(textNum1.getText());
					num2= Double.parseDouble(textNum2.getText());
					result = num1/num2;
					textResult.setText(Double.toString(result));
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}				
			}
		});
		btnDivide.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnDivide.setBounds(230, 171, 61, 39);
		frame.getContentPane().add(btnDivide);
	}
	}
		
		