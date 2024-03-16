import java.awt.*;
import javax.swing.*;

class VentanaInicio  extends JFrame {
	
	JInternalFrame internalFrameTarea;
	JMenu menu1,menu2,menu3,menu4, menu5, menu6, menu7,menu8,menu9, menu10;
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public VentanaInicio() {
		
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 850);
		setLocationRelativeTo(null);
		setTitle("MENUS - INTERNALFRAMES");
		setVisible(true);
		
		//----------------- MENU ------------------
		JMenuBar menuBar = new JMenuBar();
		
			menu1 = new JMenu("Masters");
			menuBar.add(menu1);
			menu2 = new JMenu("Booking");
			menuBar.add(menu2);
			menu3 = new JMenu("Test Perform");
			menuBar.add(menu3);
			menu4 = new JMenu("Printng");
			menuBar.add(menu4);
			menu5 = new JMenu("Transaction");
			menuBar.add(menu5);
			menu6 = new JMenu("lab reports");
			menuBar.add(menu6);
			menu7 = new JMenu("Settings");
			menuBar.add(menu7);
			menu8 = new JMenu("Utilities");
			menuBar.add(menu8);
			menu9 = new JMenu("Windows");
			menuBar.add(menu9);
			menu10 = new JMenu("Help");
			menuBar.add(menu10);
	
		setJMenuBar(menuBar);
		
		//Barra de herramientas de acceso rapido
			JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
			
				JButton btnadd = new JButton( "  Add  ");
				btnadd.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnadd.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnadd);
				
				JButton btnEdit = new JButton( "  Edit  ");
				btnEdit.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnEdit.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnEdit);
				
				JButton btnBack = new JButton( " Back ");
				btnBack.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnBack);
				
				JButton btnNext = new JButton( " Next ");
				btnNext.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnNext.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnNext);
				
				JButton btnList = new JButton( "  List  ");
				btnList.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnList.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnList);
				
				JButton btnSave = new JButton( " Save ");
				btnSave.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnSave.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnSave);
				
				JButton btnPrint = new JButton( " Print ");
				btnPrint.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnPrint.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnPrint);
				
				JButton btnTest = new JButton( " Test ");
				btnTest.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnTest.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnTest);
				
				JButton btnCancel = new JButton( "Cancel");
				btnCancel.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnCancel.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnCancel);
				
				JButton btnSettings = new JButton( "Settings");
				btnSettings.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnSettings.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnSettings);
				
				JButton btnDelete = new JButton( "Delete");
				btnDelete.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnDelete.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnDelete);
				
				JButton btnSlip = new JButton( "  Slip   ");
				btnSlip.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnSlip.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnSlip);
				
				JButton btnExit = new JButton( "  Exit   ");
				btnExit.setVerticalTextPosition(SwingConstants.BOTTOM);
				btnExit.setHorizontalTextPosition(SwingConstants.CENTER);
				toolBar.add(btnExit);
				
			add(toolBar, BorderLayout.NORTH);	
		
		//---------------------------- INTERNALFRAME -----------------------------
		JDesktopPane desktopPane = new JDesktopPane();
		
			internalFrameTarea = new JInternalFrame();
		
			internalFrameTarea.getContentPane().setLayout(new BorderLayout());
			internalFrameTarea.setDefaultCloseOperation(HIDE_ON_CLOSE);
			internalFrameTarea.setSize(1000, 650);
			internalFrameTarea.setVisible(true);
			internalFrameTarea.setMaximizable(true);
			internalFrameTarea.setClosable(true);
			internalFrameTarea.setIconifiable(true);
			internalFrameTarea.setResizable(true);
			
			desktopPane.add(internalFrameTarea);
			
			//---------------------------------PANEL 1-------------------------------------------------------------------
			
			Color color1=new Color(242,248,253);
			
			JPanel panel1 = new JPanel();
			
			panel1.setBorder(BorderFactory.createTitledBorder(""));
			
			panel1.setLayout(gbl);
			
			panel1.setBackground(color1);;
			
			internalFrameTarea.add(panel1, BorderLayout.NORTH);
			JLabel lblP1_1 = new JLabel("Patient ID");
			metodoAcomodoPanel(lblP1_1,0,0,1,1,panel1);
			JTextField txtP1_1 = new JTextField(7);
			metodoAcomodoPanel(txtP1_1,1,0,2,1,panel1);
			
			JLabel lblP1_2 = new JLabel("Date");
			metodoAcomodoPanel(lblP1_2,4,0,1,1,panel1);
			JComboBox comboP1_1 = new JComboBox<String>();
			comboP1_1.addItem("02/12/2012");
			metodoAcomodoPanel(comboP1_1,6,0,3,1,panel1);
			
			JLabel lblP1_3 = new JLabel("* Time(hh:mm)");
			metodoAcomodoPanel(lblP1_3,9,0,1,1, panel1);
			JTextField txtP1_2 = new JTextField("0",2);
			metodoAcomodoPanel(txtP1_2,10,0,1,1,panel1);
			JLabel lblP1_4 = new JLabel(":");
			metodoAcomodoPanel(lblP1_4,11,0,1,1,panel1);
			JTextField txtP1_3 = new JTextField("0",2);
			metodoAcomodoPanel(txtP1_3,12,0,1,1,panel1);
			
			JLabel lblP1_5 = new JLabel("Lab No");
			metodoAcomodoPanel(lblP1_5,14,0,1,1,panel1);
			JTextField txtP1_4 = new JTextField(7);
			metodoAcomodoPanel(txtP1_4,15,0,2,1,panel1);
			
			JLabel lblP1_6 = new JLabel("Name");
			metodoAcomodoPanel(lblP1_6,0,1,1,1,panel1);
			JComboBox comboP1_2 = new JComboBox<String>();
			comboP1_2.addItem("MR.");
			metodoAcomodoPanel(comboP1_2,1,1,1,1,panel1);
			JTextField txtP1_5 = new JTextField();
			metodoAcomodoPanel(txtP1_5,2,1,6,1, panel1);
			
			JLabel lblP1_7 = new JLabel("Sex");
			metodoAcomodoPanel(lblP1_7,0,2,1,1, panel1);
			JComboBox comboP1_3 = new JComboBox<String>();
			comboP1_3.addItem("MALE");
			metodoAcomodoPanel(comboP1_3,1,2,1,1,panel1);
			
			JLabel lblP1_8 = new JLabel("Age");
			metodoAcomodoPanel(lblP1_8,2,2,1,1, panel1);
			JTextField txtP1_6 = new JTextField("0",2);
			metodoAcomodoPanel(txtP1_6,3,2,1,1, panel1);
			
			JLabel lblP1_9 = new JLabel("Mons");
			metodoAcomodoPanel(lblP1_9,4,2,1,1, panel1);
			JTextField txtP1_7 = new JTextField("0",2);
			metodoAcomodoPanel(txtP1_7,5,2,1,1, panel1);
			
			JLabel lblP1_10 = new JLabel("Days");
			metodoAcomodoPanel(lblP1_10,6,2,1,1,panel1);
			JTextField txtP1_8 = new JTextField("0",2);
			metodoAcomodoPanel(txtP1_8,7,2,1,1, panel1);

			JLabel lblP1_11 = new JLabel("Sample By");
			metodoAcomodoPanel(lblP1_11,9,2,1,1,panel1);
			JTextField txtP1_9 = new JTextField(8);
			metodoAcomodoPanel(txtP1_9,10,2,4,1,panel1);
			
			JLabel lblP1_12 = new JLabel("Referred By");
			metodoAcomodoPanel(lblP1_12,0,3,1,1,panel1);
			JTextField txtP1_10 = new JTextField();
			metodoAcomodoPanel(txtP1_10,1,3,2,1,panel1);
			JTextField txtP1_11 = new JTextField();
			txtP1_11.setEditable(false);
			metodoAcomodoPanel(txtP1_11,4,3,4,1,panel1);


			JLabel lblP1_13 = new JLabel("Panel Code");
			metodoAcomodoPanel(lblP1_13,9,3,1,1,panel1);
			JTextField txtP1_12 = new JTextField(8);
			metodoAcomodoPanel(txtP1_12,10,3,4,1,panel1);

			JLabel lblP1_14 = new JLabel("Panel ID");
			metodoAcomodoPanel(lblP1_14,9,4,1,1,panel1);
			JTextField txtP1_13 = new JTextField(8);
			metodoAcomodoPanel(txtP1_13,10,4,4,1,panel1);

			JLabel lblP1_15 = new JLabel("e-mail");
			metodoAcomodoPanel(lblP1_15,9,5,1,1, panel1);
			JTextField txtP1_14 = new JTextField(8);
			metodoAcomodoPanel(txtP1_14,10,5,4,1,panel1);
			
			//---------------------------------PANEL 2-------------------------------------------------------------------
			
			Color colorLila=new Color(215,215,255);
			
			JPanel panel2 = new JPanel();
			panel2.setLayout(gbl);
			
			panel2.setBackground(colorLila);
			
			String[] columnNames = {"Test ID", "Test Name", "Rate", "Disc %", "Discount Amount", "Tax (%)", "Tax Amt"};
			
			Object[][] data = {
				    {"EVA-01", "Shinji Ikari", "98/100", "5", "NP", "NP", "NP"},

				};
			
			JTable table = new JTable(data, columnNames);
			
			JScrollPane scrollPane = new JScrollPane(table);
			
			//table.setFillsViewportHeight(true);
			panel2.setLayout(new BorderLayout());
			panel2.add(table.getTableHeader(), BorderLayout.PAGE_START);
			panel2.add(table, BorderLayout.CENTER);
			
			internalFrameTarea.add(panel2, BorderLayout.CENTER);

			//---------------------------------PANEL 3-------------------------------------------------------------------
			
			JPanel panel3 = new JPanel();
			panel3.setLayout(gbl);
			panel3.setBackground(colorLila);
			
			JLabel lblP3_1 = new JLabel("Total Less");
			metodoAcomodoPanel(lblP3_1,0,0,1,1,panel3);
			JTextField txtP3_1 = new JTextField(8);
			txtP3_1.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_1,1,0,1,1,panel3);
		
			JLabel lblP3_2 = new JLabel("Lest Amt.");
			metodoAcomodoPanel(lblP3_2,0,1,1,1,panel3);
			JTextField txtP3_2 = new JTextField(8);
			txtP3_2.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_2,1,1,1,1,panel3);

			JLabel lblP3_3 = new JLabel("Concession");
			metodoAcomodoPanel(lblP3_3,0,2,1,1,panel3);
			JTextField txtP3_3 = new JTextField(8);
			txtP3_3.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_3,1,2,1,1,panel3);

			JLabel lblP3_4 = new JLabel("Home Collection");
			metodoAcomodoPanel(lblP3_4,0,3,1,1,panel3);
			JTextField txtP3_4 = new JTextField(8);
			txtP3_4.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_4,1,3,1,1,panel3);

			JLabel lblP3_5 = new JLabel("Tax Amt");
			metodoAcomodoPanel(lblP3_5,0,4,1,1,panel3);
			JTextField txtP3_5 = new JTextField(8);
			txtP3_5.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_5,1,4,1,1,panel3);

			JLabel lblP3_6 = new JLabel("Net Amt");
			metodoAcomodoPanel(lblP3_6,0,5,1,1,panel3);
			JTextField txtP3_6 = new JTextField(8);
			txtP3_6.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_6,1,5,1,1,panel3);

			JLabel lblP3_7 = new JLabel("Balance");
			metodoAcomodoPanel(lblP3_7,0,6,1,1,panel3);
			JTextField txtP3_7 = new JTextField(8);
			txtP3_7.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtP3_7,1,6,1,1,panel3);
		
			internalFrameTarea.add(panel3, BorderLayout.EAST);
			
			//---------------------------------PANEL 4-------------------------------------------------------------------
			JPanel panel4 = new JPanel();
			panel4.setLayout(gbl);
			panel4.setBackground(Color.GRAY);
			
			JLabel lblP4_1 = new JLabel("Home Collection");
			metodoAcomodoPanel(lblP4_1,0,0,1,1, panel4);
			JTextField txtP4_1 = new JTextField(4);
			metodoAcomodoPanel(txtP4_1,1,0,1,1, panel4);

			JLabel lblP4_2 = new JLabel("Paid");
			metodoAcomodoPanel(lblP4_2,2,0,1,1, panel4);
			JTextField txtP4_2 = new JTextField("0",4);
			metodoAcomodoPanel(txtP4_2,3,0,1,1, panel4);

			JLabel lblP4_3 = new JLabel("Pay Tipe");
			metodoAcomodoPanel(lblP4_3,4,0,1,1, panel4);
			JComboBox comboP4_1 = new JComboBox<String>();
			comboP4_1.addItem("CASH");
			metodoAcomodoPanel(comboP4_1,5,0,1,1, panel4);

			JLabel lblP4_4 = new JLabel("Receipt No.");
			metodoAcomodoPanel(lblP4_4,6,0,1,1, panel4);
			JTextField txtP4_3 = new JTextField(8);
			metodoAcomodoPanel(txtP4_3,7,0,1,1, panel4);
			
			JTextArea txtAreaP4_1 = new JTextArea(3,3);
			txtAreaP4_1.setBackground(Color.BLUE);
			metodoAcomodoPanel(txtAreaP4_1,0,1,10,1, panel4);
			
			internalFrameTarea.add(panel4, BorderLayout.SOUTH);
			
		add(desktopPane, BorderLayout.CENTER);
	}
	
	public void metodoAcomodoPanel(Component c, int x, int y, int w, int h, JPanel panel) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
		panel.add(c);
	}	
	
}

public class Ejercicio_Gui {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				new VentanaInicio();
				
			}
			
		});
		
	}

}