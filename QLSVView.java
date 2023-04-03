package View;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.QLSVModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.Box;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class QLSVView extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	QLSVModel model;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLSVView frame = new QLSVView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSVView() {
		getContentPane().setFont(new Font("Segoe UI", Font.PLAIN, 12));
		getContentPane().setLayout(null);
		
		JLabel lbQuêQuán = new JLabel("Thông tin Sinh Viên");
		lbQuêQuán.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbQuêQuán.setBounds(10, 257, 136, 24);
		getContentPane().add(lbQuêQuán);
		
		JLabel lblMãSinhViên = new JLabel("Mã Sinh Viên");
		lblMãSinhViên.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMãSinhViên.setBounds(345, 13, 95, 44);
		getContentPane().add(lblMãSinhViên);
		
		textField_1 = new JTextField();
		textField_1.setBounds(440, 15, 158, 44);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox QuêQuán = new JComboBox();
		QuêQuán.setBounds(110, 13, 169, 49);
		getContentPane().add(QuêQuán);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 79, 698, 2);
		getContentPane().add(separator);
		
		JLabel lblDsSinhVin = new JLabel("Ds Sinh Viên");
		lblDsSinhVin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDsSinhVin.setBounds(10, 79, 88, 32);
		getContentPane().add(lblDsSinhVin);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"STT", "MSV", "H\u1ECD v\u00E0 t\u00EAn", "Ng\u00E0y Sinh", "Gi\u1EDBi T\u00EDnh", "Qu\u00EA Qu\u00E1n", "M\u00F4n 1", "M\u00F4n 2", "M\u00F4n 3", "Trung B\u00ECnh"
			}
		));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 110, 698, 147);
		getContentPane().add(scrollPane);
		
		JLabel lbQuêQuán_1 = new JLabel("Quê Quán");
		lbQuêQuán_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbQuêQuán_1.setBounds(39, 11, 72, 49);
		getContentPane().add(lbQuêQuán_1);
		
		JLabel lblHVTn = new JLabel("Họ và Tên");
		lblHVTn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHVTn.setBounds(10, 288, 95, 44);
		getContentPane().add(lblHVTn);
		
		JLabel lblMãSinhViên_2 = new JLabel("Mã Sinh Viên");
		lblMãSinhViên_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMãSinhViên_2.setBounds(10, 342, 95, 32);
		getContentPane().add(lblMãSinhViên_2);
		
		JLabel lblQuQun = new JLabel("Quê Quán");
		lblQuQun.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuQun.setBounds(10, 385, 95, 37);
		getContentPane().add(lblQuQun);
		
		JLabel lblNgySinh = new JLabel("Ngày Sinh");
		lblNgySinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNgySinh.setBounds(10, 425, 95, 44);
		getContentPane().add(lblNgySinh);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(102, 296, 158, 32);
		getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 344, 158, 32);
		getContentPane().add(textField_2);
		
		JComboBox QuêQuán_1 = new JComboBox();
		QuêQuán_1.setBounds(102, 391, 158, 28);
		getContentPane().add(QuêQuán_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 433, 158, 32);
		getContentPane().add(textField_3);
		
		JLabel lblGiiTnh = new JLabel("Giới Tính");
		lblGiiTnh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGiiTnh.setBounds(326, 247, 95, 44);
		getContentPane().add(lblGiiTnh);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBounds(411, 260, 47, 23);
		getContentPane().add(rdbtnNam);
		
		JRadioButton rdbtnNữ = new JRadioButton("Nữ");
		rdbtnNữ.setBounds(473, 260, 39, 23);
		getContentPane().add(rdbtnNữ);
		
		JLabel lblHVTn_1 = new JLabel("Môn 1");
		lblHVTn_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHVTn_1.setBounds(326, 288, 95, 44);
		getContentPane().add(lblHVTn_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(421, 296, 158, 32);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(418, 344, 158, 32);
		getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(418, 389, 158, 32);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(418, 433, 158, 32);
		getContentPane().add(textField_7);
		
		JLabel lblMn = new JLabel("Môn 2");
		lblMn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMn.setBounds(326, 336, 95, 44);
		getContentPane().add(lblMn);
		
		JLabel lblMn_1 = new JLabel("Môn 3");
		lblMn_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMn_1.setBounds(326, 381, 95, 44);
		getContentPane().add(lblMn_1);
		
		JLabel lblMn_2 = new JLabel("Trung Bình");
		lblMn_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMn_2.setBounds(326, 425, 95, 44);
		getContentPane().add(lblMn_2);
		
		JButton btnNewButton = new JButton("TÌM");
		btnNewButton.setBounds(625, 13, 83, 44);
		getContentPane().add(btnNewButton);
		
		JButton btnThm = new JButton("THÊM");
		btnThm.setBounds(39, 480, 99, 44);
		getContentPane().add(btnThm);
		
		JButton btnXo = new JButton("XOÁ");
		btnXo.setBounds(170, 480, 109, 44);
		getContentPane().add(btnXo);
		
		JButton btnCpNht = new JButton("CẬP NHẬT");
		btnCpNht.setBounds(300, 480, 109, 44);
		getContentPane().add(btnCpNht);
		
		JButton btnLu = new JButton("LƯU");
		btnLu.setBounds(440, 480, 83, 44);
		getContentPane().add(btnLu);
		
		JButton btnHuB = new JButton("HUỶ BỎ");
		btnHuB.setBounds(547, 480, 83, 44);
		getContentPane().add(btnHuB);
		this.model = new QLSVModel(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 585);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuFile.add(menuOpen);
		
		JMenuItem menuClose = new JMenuItem("Close");
		menuFile.add(menuClose);
		
		JMenuItem menuExit = new JMenuItem("Exit");
		menuFile.add(menuExit);
		
		JMenu menuAbout = new JMenu("About ");
		menuBar.add(menuAbout);
		
		JMenuItem menuIDK = new JMenuItem("IDK");
		menuAbout.add(menuIDK);
		
		this.setVisible(true);
	}
}
