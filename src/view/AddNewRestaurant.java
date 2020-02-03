package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class AddNewRestaurant extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_5;

	public static void main(String[] args) {
		
					AddNewRestaurant frame = new AddNewRestaurant();
	}

	public AddNewRestaurant() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Add New Restaurant");
		setBounds(100, 100, 1000, 800);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mn_AddNewRestaurantFile = new JMenu("File");
		menuBar.add(mn_AddNewRestaurantFile);
		
		JMenuItem mntm_addNewRestFileDisconect = new JMenuItem("Disconect");
		mn_AddNewRestaurantFile.add(mntm_addNewRestFileDisconect);
		
		JMenuItem mntm_addNewRestFileQuit = new JMenuItem("Quit");
		mn_AddNewRestaurantFile.add(mntm_addNewRestFileQuit);
		
		JMenu mn_addNewRestRestaurant = new JMenu("Restaurant");
		menuBar.add(mn_addNewRestRestaurant);
		
		JMenuItem mntm_addNewRestRestaurantCreate = new JMenuItem("Create");
		mn_addNewRestRestaurant.add(mntm_addNewRestRestaurantCreate);
		
		JMenuItem mntm_addNewRestRestaurantEdit = new JMenuItem("Edit");
		mn_addNewRestRestaurant.add(mntm_addNewRestRestaurantEdit);
		
		JMenuItem mntm_addNewRestRestaurantDelete = new JMenuItem("Delete");
		mn_addNewRestRestaurant.add(mntm_addNewRestRestaurantDelete);
		
		JMenu mn__addNewRestMenu = new JMenu("Menu");
		menuBar.add(mn__addNewRestMenu);
		
		JMenuItem mntm_addNewRestMenuCreate = new JMenuItem("Create");
		mn__addNewRestMenu.add(mntm_addNewRestMenuCreate);
		
		JMenuItem mntm_addNewRestMenuEdit = new JMenuItem("Edit");
		mn__addNewRestMenu.add(mntm_addNewRestMenuEdit);
		
		JMenuItem mntm_addNewRestMenuDelete = new JMenuItem("Delete");
		mn__addNewRestMenu.add(mntm_addNewRestMenuDelete);
		
		JMenu mn_addNewRestDeliveryMan = new JMenu("Delivery man");
		menuBar.add(mn_addNewRestDeliveryMan);
		
		JMenuItem mntm_addNewRestDeliveryManCreate = new JMenuItem("Create");
		mn_addNewRestDeliveryMan.add(mntm_addNewRestDeliveryManCreate);
		
		JMenuItem mntm_addNewRestDeliveryManEdit = new JMenuItem("Edit");
		mn_addNewRestDeliveryMan.add(mntm_addNewRestDeliveryManEdit);
		
		JMenuItem mntm_addNewRestDeliveryManDelete = new JMenuItem("Delete");
		mn_addNewRestDeliveryMan.add(mntm_addNewRestDeliveryManDelete);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(244, 164, 96));
		panel.setPreferredSize(new Dimension(0, 160));
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 160, 122));
		panel.add(panel_3);
		
		JLabel lblAddNewRestaurant = new JLabel("Add new restaurant");
		panel_3.add(lblAddNewRestaurant);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 160, 122));
		panel.add(panel_5);
		
		JLabel lblRestaurantName = new JLabel("Restaurant name: ");
		panel_5.add(lblRestaurantName);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setPreferredSize(new Dimension(7, 0));
		panel_5.add(horizontalGlue);
		
		textField = new JTextField();
		panel_5.add(textField);
		textField.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 160, 122));
		panel.add(panel_6);
		
		JLabel lblRestaurantAddress = new JLabel("Restaurant Address: ");
		panel_6.add(lblRestaurantAddress);
		
		textField_1 = new JTextField();
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 160, 122));
		panel.add(panel_7);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number:    (");
		panel_7.add(lblTelephoneNumber);
		
		textField_2 = new JTextField();
		panel_7.add(textField_2);
		textField_2.setColumns(2);
		
		JLabel label = new JLabel(")");
		panel_7.add(label);
		
		textField_3 = new JTextField();
		panel_7.add(textField_3);
		textField_3.setColumns(2);
		
		JLabel label_1 = new JLabel("-");
		panel_7.add(label_1);
		
		textField_4 = new JTextField();
		panel_7.add(textField_4);
		textField_4.setColumns(2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 160, 122));
		panel.add(panel_8);
		
		JLabel lblOpeningTime = new JLabel("Opening Time");
		panel_8.add(lblOpeningTime);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(200, 0));
		panel_1.setBackground(new Color(244, 164, 96));
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_2.setBackground(new Color(244, 164, 96));
		panel_2.setPreferredSize(new Dimension(209, 0));
		contentPane.add(panel_2, BorderLayout.EAST);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(244, 164, 96));
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(14, 0, 0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_4.add(panel_10);
		panel_10.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_23 = new JPanel();
		panel_23.setBackground(new Color(244, 164, 96));
		panel_10.add(panel_23);
		
		JLabel lblDay = new JLabel("Day");
		panel_23.add(lblDay);
		
		JPanel panel_24 = new JPanel();
		panel_24.setBackground(new Color(244, 164, 96));
		panel_10.add(panel_24);
		
		JLabel lblOpenningTime = new JLabel("Openning Time");
		panel_24.add(lblOpenningTime);
		
		JPanel panel_25 = new JPanel();
		panel_25.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_25.setBackground(new Color(244, 164, 96));
		panel_10.add(panel_25);
		
		JLabel lblClossingTime = new JLabel("Clossing Time");
		panel_25.add(lblClossingTime);
		
		JPanel panel_11 = new JPanel();
		panel_4.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(244, 164, 96));
		panel_11.add(panel_26);
		
		JLabel lblSunday = new JLabel("Sunday");
		panel_26.add(lblSunday);
		
		JPanel panel_51 = new JPanel();
		panel_51.setBackground(new Color(244, 164, 96));
		panel_11.add(panel_51);
		panel_51.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_51.add(comboBox);
		
		JLabel lblH = new JLabel("h");
		panel_51.add(lblH);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_51.add(comboBox_1);
		
		JPanel panel_27 = new JPanel();
		panel_27.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_27.setBackground(new Color(244, 164, 96));
		panel_11.add(panel_27);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_27.add(comboBox_14);
		
		JLabel label_8 = new JLabel("h");
		panel_27.add(label_8);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_27.add(comboBox_15);
		
		JPanel panel_14 = new JPanel();
		panel_4.add(panel_14);
		panel_14.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(244, 164, 96));
		panel_14.add(panel_12);
		
		JLabel lblMonday = new JLabel("Monday");
		panel_12.add(lblMonday);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(244, 164, 96));
		panel_14.add(panel_13);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_13.add(comboBox_2);
		
		JLabel label_2 = new JLabel("h");
		panel_13.add(label_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_13.add(comboBox_3);
		
		JPanel panel_48 = new JPanel();
		panel_48.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_48.setBackground(new Color(244, 164, 96));
		panel_14.add(panel_48);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_48.add(comboBox_16);
		
		JLabel label_9 = new JLabel("h");
		panel_48.add(label_9);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_48.add(comboBox_17);
		
		JPanel panel_15 = new JPanel();
		panel_4.add(panel_15);
		panel_15.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_28 = new JPanel();
		panel_15.add(panel_28);
		panel_28.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_29 = new JPanel();
		panel_28.add(panel_29);
		panel_29.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_30 = new JPanel();
		panel_30.setBackground(new Color(244, 164, 96));
		panel_29.add(panel_30);
		
		JLabel lblTuseday = new JLabel("Tuseday");
		panel_30.add(lblTuseday);
		
		JPanel panel_31 = new JPanel();
		panel_31.setBackground(new Color(244, 164, 96));
		panel_29.add(panel_31);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_31.add(comboBox_4);
		
		JLabel label_3 = new JLabel("h");
		panel_31.add(label_3);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_31.add(comboBox_5);
		
		JPanel panel_32 = new JPanel();
		panel_32.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_32.setBackground(new Color(244, 164, 96));
		panel_29.add(panel_32);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_32.add(comboBox_18);
		
		JLabel label_10 = new JLabel("h");
		panel_32.add(label_10);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_32.add(comboBox_19);
		
		JPanel panel_16 = new JPanel();
		panel_4.add(panel_16);
		panel_16.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_33 = new JPanel();
		panel_16.add(panel_33);
		panel_33.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_35 = new JPanel();
		panel_35.setBackground(new Color(244, 164, 96));
		panel_33.add(panel_35);
		
		JLabel lblWednseday = new JLabel("Wednseday");
		panel_35.add(lblWednseday);
		
		JPanel panel_36 = new JPanel();
		panel_36.setBackground(new Color(244, 164, 96));
		panel_33.add(panel_36);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_36.add(comboBox_6);
		
		JLabel label_4 = new JLabel("h");
		panel_36.add(label_4);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_36.add(comboBox_7);
		
		JPanel panel_49 = new JPanel();
		panel_49.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_49.setBackground(new Color(244, 164, 96));
		panel_33.add(panel_49);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_49.add(comboBox_20);
		
		JLabel label_11 = new JLabel("h");
		panel_49.add(label_11);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_49.add(comboBox_21);
		
		JPanel panel_41 = new JPanel();
		panel_4.add(panel_41);
		panel_41.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_38 = new JPanel();
		panel_38.setBackground(new Color(244, 164, 96));
		panel_41.add(panel_38);
		
		JLabel lblThursday = new JLabel("Thursday");
		panel_38.add(lblThursday);
		
		JPanel panel_43 = new JPanel();
		panel_43.setBackground(new Color(244, 164, 96));
		panel_41.add(panel_43);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_43.add(comboBox_8);
		
		JLabel label_5 = new JLabel("h");
		panel_43.add(label_5);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_43.add(comboBox_9);
		
		JPanel panel_44 = new JPanel();
		panel_44.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_44.setBackground(new Color(244, 164, 96));
		panel_41.add(panel_44);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_44.add(comboBox_22);
		
		JLabel label_12 = new JLabel("h");
		panel_44.add(label_12);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_44.add(comboBox_23);
		
		JPanel panel_42 = new JPanel();
		panel_4.add(panel_42);
		panel_42.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_45 = new JPanel();
		panel_45.setBackground(new Color(244, 164, 96));
		panel_42.add(panel_45);
		
		JLabel lblFriday = new JLabel("Friday");
		panel_45.add(lblFriday);
		
		JPanel panel_46 = new JPanel();
		panel_46.setBackground(new Color(244, 164, 96));
		panel_42.add(panel_46);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_46.add(comboBox_10);
		
		JLabel label_6 = new JLabel("h");
		panel_46.add(label_6);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_46.add(comboBox_11);
		
		JPanel panel_47 = new JPanel();
		panel_47.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_47.setBackground(new Color(244, 164, 96));
		panel_42.add(panel_47);
		
		JComboBox comboBox_24 = new JComboBox();
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_47.add(comboBox_24);
		
		JLabel label_13 = new JLabel("h");
		panel_47.add(label_13);
		
		JComboBox comboBox_25 = new JComboBox();
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_47.add(comboBox_25);
		
		JPanel panel_17 = new JPanel();
		panel_4.add(panel_17);
		panel_17.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_37 = new JPanel();
		panel_17.add(panel_37);
		panel_37.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_39 = new JPanel();
		panel_39.setBackground(new Color(244, 164, 96));
		panel_37.add(panel_39);
		
		JLabel lblSaturday = new JLabel("Saturday");
		panel_39.add(lblSaturday);
		
		JPanel panel_40 = new JPanel();
		panel_40.setBackground(new Color(244, 164, 96));
		panel_37.add(panel_40);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_40.add(comboBox_12);
		
		JLabel label_7 = new JLabel("h");
		panel_40.add(label_7);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_40.add(comboBox_13);
		
		JPanel panel_50 = new JPanel();
		panel_50.setBorder(new EmptyBorder(5, 5, 5, 0));
		panel_50.setBackground(new Color(244, 164, 96));
		panel_37.add(panel_50);
		
		JComboBox comboBox_26 = new JComboBox();
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_50.add(comboBox_26);
		
		JLabel label_14 = new JLabel("h");
		panel_50.add(label_14);
		
		JComboBox comboBox_27 = new JComboBox();
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30", "24:00"}));
		panel_50.add(comboBox_27);
		
		JPanel panel_18 = new JPanel();
		panel_4.add(panel_18);
		panel_18.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnModifyAllThe = new JButton("Modify all the time at once");
		btnModifyAllThe.setBackground(new Color(154, 205, 50));
		panel_18.add(btnModifyAllThe);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(244, 164, 96));
		panel_4.add(panel_19);
		
		JLabel lblDeliveryArea = new JLabel("Delivery Area");
		panel_19.add(lblDeliveryArea);
		
		JPanel panel_20 = new JPanel();
		panel_20.setPreferredSize(new Dimension(400, 50));
		panel_20.setBackground(new Color(255, 215, 0));
		panel_4.add(panel_20);
		panel_20.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField_5 = new JTextField();
		textField_5.setBackground(new Color(240, 255, 255));
		panel_20.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_21 = new JPanel();
		panel_21.setBackground(new Color(244, 164, 96));
		panel_4.add(panel_21);
		
		JLabel lblDeliveryArea_1 = new JLabel("Delivery Area: ");
		panel_21.add(lblDeliveryArea_1);
		
		textField_6 = new JTextField();
		textField_6.setBackground(new Color(245, 255, 250));
		panel_21.add(textField_6);
		textField_6.setColumns(2);
		
		JButton btnAddDeliveryArea = new JButton("Add Delivery Area");
		btnAddDeliveryArea.setBackground(new Color(154, 205, 50));
		panel_21.add(btnAddDeliveryArea);
		
		JPanel panel_22 = new JPanel();
		panel_22.setBackground(new Color(244, 164, 96));
		panel_4.add(panel_22);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(90, 0));
		panel_22.add(horizontalStrut_1);
		
		JButton btnDleleteDeliveryArea = new JButton("Dlelete Delivery Area");
		btnDleleteDeliveryArea.setBackground(new Color(154, 205, 50));
		panel_22.add(btnDleleteDeliveryArea);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(244, 164, 96));
		panel_4.add(panel_9);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(150, 0));
		panel_9.add(horizontalStrut);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(154, 205, 50));
		panel_9.add(btnSave);
		this.setVisible(true);
	}

}
