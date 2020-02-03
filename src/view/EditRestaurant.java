package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.FlowLayout;

public class EditRestaurant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	public static void main(String[] args) {

		EditRestaurant frame = new EditRestaurant();
	}

	public EditRestaurant() {
		setBackground(new Color(244, 164, 96));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Edit Restaurant");
		setBounds(100, 100, 1200, 1000);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("Flie");
		menuBar.add(mnFile);
		
		JMenuItem mntmDisconnect = new JMenuItem("Disconnect");
		mnFile.add(mntmDisconnect);
		
		JMenuItem mntmQuit = new JMenuItem("Quit");
		mnFile.add(mntmQuit);
		
		JMenu mnNewMenu = new JMenu("Restaurant");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCreate = new JMenuItem("Create");
		mnNewMenu.add(mntmCreate);
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		mnNewMenu.add(mntmEdit);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnNewMenu.add(mntmDelete);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmCreate_1 = new JMenuItem("Create");
		mnMenu.add(mntmCreate_1);
		
		JMenuItem mntmEdit_1 = new JMenuItem("Edit");
		mnMenu.add(mntmEdit_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("Delete");
		mnMenu.add(mntmDelete_1);
		
		JMenu mnDeliveryMan = new JMenu("Delivery man");
		menuBar.add(mnDeliveryMan);
		
		JMenuItem mntmCreate_2 = new JMenuItem("Create");
		mnDeliveryMan.add(mntmCreate_2);
		
		JMenuItem mntmEdit_2 = new JMenuItem("Edit");
		mnDeliveryMan.add(mntmEdit_2);
		
		JMenuItem mntmDelete_2 = new JMenuItem("Delete");
		mnDeliveryMan.add(mntmDelete_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(300, 0));
		panel.setBackground(new Color(244, 164, 96));
		contentPane.add(panel, BorderLayout.WEST);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(244, 164, 96));
		panel.add(panel_36);
		panel_36.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_63 = new JPanel();
		panel_63.setBackground(new Color(244, 164, 96));
		panel_63.setPreferredSize(new Dimension(285, 30));
		panel.add(panel_63);
		panel_63.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRestaurant = new JLabel("Restaurant");
		panel_63.add(lblRestaurant);
		
		JPanel panel_64 = new JPanel();
		panel_64.setPreferredSize(new Dimension(295, 800));
		panel.add(panel_64);
		panel_64.setLayout(new GridLayout(0, 1, 0, 0));
		
		textField_7 = new JTextField();
		textField_7.setBackground(new Color(240, 248, 255));
		textField_7.setBorder(new EmptyBorder(7, 7, 7, 7));
		textField_7.setPreferredSize(new Dimension(12, 700));
		panel_64.add(textField_7);
		textField_7.setColumns(10);
		
		JPanel panel_65 = new JPanel();
		panel_65.setBackground(new Color(244, 164, 96));
		panel_65.setPreferredSize(new Dimension(295, 30));
		panel.add(panel_65);
		panel_65.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setBackground(new Color(107, 142, 35));
		panel_65.add(btnSelect);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(244, 164, 96));
		panel_1.setPreferredSize(new Dimension(500, 1000));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(19, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_4);
		
		JLabel lblEditRestaurant = new JLabel("Edit Restaurant");
		panel_4.add(lblEditRestaurant);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_5);
		
		JLabel lblRestaurantName = new JLabel("Restaurant Name: ");
		lblRestaurantName.setBackground(new Color(244, 164, 96));
		panel_5.add(lblRestaurantName);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_6);
		
		JLabel lblRestaurantAddresss = new JLabel("Restaurant Addresss: ");
		panel_6.add(lblRestaurantAddresss);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(240, 255, 240));
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_7);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number: ");
		panel_7.add(lblTelephoneNumber);
		
		JLabel label = new JLabel("(");
		panel_7.add(label);
		
		textField_2 = new JTextField();
		panel_7.add(textField_2);
		textField_2.setColumns(2);
		
		JLabel label_1 = new JLabel(")");
		panel_7.add(label_1);
		
		textField_3 = new JTextField();
		panel_7.add(textField_3);
		textField_3.setColumns(2);
		
		JLabel label_2 = new JLabel("-");
		panel_7.add(label_2);
		
		textField_4 = new JTextField();
		panel_7.add(textField_4);
		textField_4.setColumns(2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_8);
		
		JLabel lblOpenningTime = new JLabel("Openning Time");
		panel_8.add(lblOpenningTime);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(244, 164, 96));
		panel_3.add(panel_9);
		
		JLabel lblDay = new JLabel("Day");
		panel_9.add(lblDay);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(244, 164, 96));
		panel_3.add(panel_10);
		
		JLabel lblOpenningTime_1 = new JLabel("Openning Time");
		panel_10.add(lblOpenningTime_1);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(244, 164, 96));
		panel_3.add(panel_11);
		
		JLabel lblClossingTime = new JLabel("Clossing Time");
		panel_11.add(lblClossingTime);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_13);
		panel_13.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(244, 164, 96));
		panel_13.add(panel_25);
		panel_25.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(244, 164, 96));
		panel_25.add(panel_26);
		
		JLabel lblSunday = new JLabel("Sunday");
		panel_26.add(lblSunday);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBackground(new Color(244, 164, 96));
		panel_25.add(panel_27);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_27.add(comboBox);
		
		JLabel lblH = new JLabel("h");
		panel_27.add(lblH);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_27.add(comboBox_1);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(244, 164, 96));
		panel_25.add(panel_28);
		
		JPanel panel_56 = new JPanel();
		panel_56.setBackground(new Color(244, 164, 96));
		panel_28.add(panel_56);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_56.add(comboBox_14);
		
		JLabel label_9 = new JLabel("h");
		panel_56.add(label_9);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_56.add(comboBox_15);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_29.setBackground(new Color(244, 164, 96));
		panel_14.add(panel_29);
		
		JLabel lblMonday = new JLabel("Monday");
		panel_29.add(lblMonday);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(244, 164, 96));
		panel_14.add(panel_30);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_30.add(comboBox_2);
		
		JLabel label_3 = new JLabel("h");
		panel_30.add(label_3);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_30.add(comboBox_3);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(244, 164, 96));
		panel_14.add(panel_31);
		
		JPanel panel_57 = new JPanel();
		panel_57.setBackground(new Color(244, 164, 96));
		panel_31.add(panel_57);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_57.add(comboBox_16);
		
		JLabel label_10 = new JLabel("h");
		panel_57.add(label_10);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setBackground(new Color(244, 164, 96));
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_57.add(comboBox_17);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_15);
		panel_15.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_32 = new JPanel();
		panel_32.setBackground(new Color(244, 164, 96));
		panel_15.add(panel_32);
		panel_32.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_33 = new JPanel();
		panel_33.setBackground(new Color(244, 164, 96));
		panel_32.add(panel_33);
		
		JLabel lblTuesday = new JLabel("Tuesday");
		panel_33.add(lblTuesday);
		
		JPanel panel_34 = new JPanel();
		panel_34.setBackground(new Color(244, 164, 96));
		panel_32.add(panel_34);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(new Color(244, 164, 96));
		panel_34.add(panel_51);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBackground(new Color(244, 164, 96));
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_51.add(comboBox_4);
		
		JLabel label_4 = new JLabel("h");
		panel_51.add(label_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_51.add(comboBox_5);
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(244, 164, 96));
		panel_32.add(panel_35);
		
		JPanel panel_58 = new JPanel();
		panel_58.setBackground(new Color(244, 164, 96));
		panel_35.add(panel_58);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_58.add(comboBox_18);
		
		JLabel label_11 = new JLabel("h");
		panel_58.add(label_11);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_58.add(comboBox_19);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_16);
		panel_16.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_37 = new JPanel();
		panel_37.setBackground(new Color(244, 164, 96));
		panel_16.add(panel_37);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		panel_37.add(lblWednesday);
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(244, 164, 96));
		panel_16.add(panel_38);
		
		JPanel panel_52 = new JPanel();
		panel_52.setBackground(new Color(244, 164, 96));
		panel_38.add(panel_52);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_52.add(comboBox_6);
		
		JLabel label_5 = new JLabel("h");
		panel_52.add(label_5);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_52.add(comboBox_7);
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(244, 164, 96));
		panel_16.add(panel_39);
		
		JPanel panel_59 = new JPanel();
		panel_59.setBackground(new Color(244, 164, 96));
		panel_39.add(panel_59);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_59.add(comboBox_20);
		
		JLabel label_12 = new JLabel("h");
		label_12.setBackground(new Color(244, 164, 96));
		panel_59.add(label_12);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_59.add(comboBox_21);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_17);
		panel_17.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(244, 164, 96));
		panel_17.add(panel_40);
		panel_40.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_41 = new JPanel();
		panel_41.setBackground(new Color(244, 164, 96));
		panel_40.add(panel_41);
		panel_41.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_42 = new JPanel();
		panel_42.setBackground(new Color(244, 164, 96));
		panel_41.add(panel_42);
		
		JLabel lblThursday = new JLabel("Thursday");
		panel_42.add(lblThursday);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(new Color(244, 164, 96));
		panel_41.add(panel_43);
		
		JPanel panel_53 = new JPanel();
		panel_53.setBackground(new Color(244, 164, 96));
		panel_43.add(panel_53);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_53.add(comboBox_8);
		
		JLabel label_6 = new JLabel("h");
		panel_53.add(label_6);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_53.add(comboBox_9);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBackground(new Color(244, 164, 96));
		panel_41.add(panel_44);
		
		JPanel panel_60 = new JPanel();
		panel_60.setBackground(new Color(244, 164, 96));
		panel_44.add(panel_60);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_60.add(comboBox_22);
		
		JLabel label_13 = new JLabel("h");
		panel_60.add(label_13);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setBackground(new Color(244, 164, 96));
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_60.add(comboBox_23);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(new Color(244, 164, 96));
		panel_18.add(panel_45);
		
		JLabel lblFriday = new JLabel("Friday");
		panel_45.add(lblFriday);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(new Color(244, 164, 96));
		panel_18.add(panel_46);
		
		JPanel panel_54 = new JPanel();
		panel_54.setBackground(new Color(244, 164, 96));
		panel_46.add(panel_54);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_54.add(comboBox_10);
		
		JLabel label_7 = new JLabel("h");
		panel_54.add(label_7);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_54.add(comboBox_11);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBackground(new Color(244, 164, 96));
		panel_18.add(panel_47);
		
		JPanel panel_61 = new JPanel();
		panel_61.setBackground(new Color(244, 164, 96));
		panel_47.add(panel_61);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_61.add(comboBox_24);
		
		JLabel label_14 = new JLabel("h");
		panel_61.add(label_14);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_61.add(comboBox_25);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_19);
		panel_19.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_48 = new JPanel();
		panel_48.setBackground(new Color(244, 164, 96));
		panel_19.add(panel_48);
		
		JLabel lblSaturday = new JLabel("Saturday");
		panel_48.add(lblSaturday);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBackground(new Color(244, 164, 96));
		panel_19.add(panel_49);
		
		JPanel panel_55 = new JPanel();
		panel_55.setBackground(new Color(244, 164, 96));
		panel_49.add(panel_55);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_55.add(comboBox_12);
		
		JLabel label_8 = new JLabel("h");
		panel_55.add(label_8);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_55.add(comboBox_13);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBackground(new Color(244, 164, 96));
		panel_19.add(panel_50);
		
		JPanel panel_62 = new JPanel();
		panel_62.setBackground(new Color(244, 164, 96));
		panel_50.add(panel_62);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_62.add(comboBox_26);
		
		JLabel label_15 = new JLabel("h");
		panel_62.add(label_15);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_62.add(comboBox_27);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(218, 165, 32));
		panel_1.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnModifyAllThe = new JButton("Modify all the time at once");
		btnModifyAllThe.setBackground(new Color(107, 142, 35));
		panel_20.add(btnModifyAllThe);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_21);
		
		JLabel lblDeliveryArea = new JLabel("Delivery Area");
		panel_21.add(lblDeliveryArea);
		
		JPanel panel_22 = new JPanel();
		panel_1.add(panel_22);
		panel_22.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField_5 = new JTextField();
		panel_22.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_23);
		
		JLabel lblDeliveryArea_1 = new JLabel("Delivery Area :");
		panel_23.add(lblDeliveryArea_1);
		
		textField_6 = new JTextField();
		panel_23.add(textField_6);
		textField_6.setColumns(2);
		
		JButton btnAddDeliveryArea = new JButton("Add Delivery Area");
		btnAddDeliveryArea.setBackground(new Color(107, 142, 35));
		panel_23.add(btnAddDeliveryArea);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_24);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(100, 0));
		panel_24.add(horizontalStrut);
		
		JButton btnDeleteDeliveryArea = new JButton("Delete Delivery Area");
		btnDeleteDeliveryArea.setBackground(new Color(107, 142, 35));
		panel_24.add(btnDeleteDeliveryArea);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(244, 164, 96));
		panel_1.add(panel_12);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(140, 0));
		panel_12.add(horizontalStrut_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(107, 142, 35));
		panel_12.add(btnSave);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(300, 1000));
		panel_2.setBackground(new Color(244, 164, 96));
		contentPane.add(panel_2, BorderLayout.EAST);
		this.setVisible(true);
	}

}
