package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FileMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					FileMenu frame = new FileMenu();
	}
		
	public FileMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		this.setTitle("File Menu");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mn_AdimFlie = new JMenu("File");
		menuBar.add(mn_AdimFlie);
		
		JMenuItem mntm_AdimFileDisconnect = new JMenuItem("Disconnect");
		mn_AdimFlie.add(mntm_AdimFileDisconnect);
		
		JMenuItem mntm_AdimFileQuite = new JMenuItem("Quite");
		mn_AdimFlie.add(mntm_AdimFileQuite);
		
		JMenu mn_AdminRestaurant = new JMenu("Restaurant");
		menuBar.add(mn_AdminRestaurant);
		
		JMenuItem mntm_AdminRestaurantCreate = new JMenuItem("Create");
		mn_AdminRestaurant.add(mntm_AdminRestaurantCreate);
		
		JMenuItem mntm_AdminRestaurantEdit = new JMenuItem("Edit");
		mn_AdminRestaurant.add(mntm_AdminRestaurantEdit);
		
		JMenuItem mntm_adminRestaurantDelete = new JMenuItem("Delete");
		mn_AdminRestaurant.add(mntm_adminRestaurantDelete);
		
		JMenu mn_AminMenu = new JMenu("Menu");
		menuBar.add(mn_AminMenu);
		
		JMenuItem mntm_AdminMenuCreate = new JMenuItem("Create");
		mn_AminMenu.add(mntm_AdminMenuCreate);
		
		JMenuItem mntm_AminMenuEdit = new JMenuItem("Edit");
		mn_AminMenu.add(mntm_AminMenuEdit);
		
		JMenuItem mntm_AminMenuDelete = new JMenuItem("Delete");
		mn_AminMenu.add(mntm_AminMenuDelete);
		
		JMenu mn_AdminDelivery = new JMenu("Delivery");
		menuBar.add(mn_AdminDelivery);
		
		JMenuItem mntm_AminDeliveryCreate = new JMenuItem("Create");
		mn_AdminDelivery.add(mntm_AminDeliveryCreate);
		
		JMenuItem mntm_AminDeliveryEdit = new JMenuItem("Edit");
		mn_AdminDelivery.add(mntm_AminDeliveryEdit);
		
		JMenuItem mntm_AminDeliveryDelete = new JMenuItem("Delete");
		mn_AdminDelivery.add(mntm_AminDeliveryDelete);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		this.setVisible(true);
	}

}
