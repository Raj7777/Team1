package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame; //J for java
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // runnable is interface
			public void run() {
				try {
					Calculator window = new Calculator();//window is object la clasa calculator (numele clasei)
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
	public Calculator() { //constructor
		initialize();//method
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 374, 431);//size of your window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setBounds(0, 0, 358, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnFirstButton = new JButton("First button");
		btnFirstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnFirstButton.setBounds(0, 45, 89, 45);
		frame.getContentPane().add(btnFirstButton);
		
		JButton btnSecond = new JButton("Second button");
		btnSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSecond.setBounds(99, 45, 103, 45);
		frame.getContentPane().add(btnSecond);
	}
}
