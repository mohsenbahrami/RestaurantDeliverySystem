package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Text_username;
	private JTextField Text_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					Login frame = new Login();
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(0, 40));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(new Color(255, 102, 0));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblDeliverySystem = new JLabel("Delivery System");
		lblDeliverySystem.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblDeliverySystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_1.setBackground(new Color(255, 102, 0));
		panel_1.setPreferredSize(new Dimension(395, 100));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 0, 10));
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblUsername);
		
		Text_username = new JTextField();
		panel_1.add(Text_username);
		Text_username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblPassword);
		
		Text_Password = new JTextField();
		panel_1.add(Text_Password);
		Text_Password.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 102, 0));
		panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_2.setPreferredSize(new Dimension(395, 150));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(3, 1, 5, 10));
		
		JButton btn_connect = new JButton("Connect");
		btn_connect.setBackground(new Color(153, 204, 0));
		btn_connect.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_2.add(btn_connect);
		
		JButton btn_newClients = new JButton("New Clients");
		btn_newClients.setBackground(new Color(153, 204, 0));
		btn_newClients.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_2.add(btn_newClients);
		
		JButton btn_quit = new JButton("Quit");
		btn_quit.setBackground(new Color(153, 204, 0));
		btn_quit.setFont(new Font("Verdana", Font.BOLD, 20));
		panel_2.add(btn_quit);
		this.setTitle("Login");
		this.setVisible(true);
	}

}
