package mvc.view;

import javax.swing.JFrame;

import mvc.model.FenetreDEntreeModel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class FenetreDEntree {

	private JFrame frmGestionDesContacts;
	private FenetreDEntreeModel model;
	private JTable table;

	/**
	 * Create the application.
	 */
	public FenetreDEntree(FenetreDEntreeModel model) {
		this.model = model;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDesContacts = new JFrame();
		frmGestionDesContacts.setTitle(model.getTitre());
		frmGestionDesContacts.setBounds(100, 100, 710, 449);
		frmGestionDesContacts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDesContacts.getContentPane().setLayout(new BorderLayout(11, 5));
		
		JMenuBar menuBar = new JMenuBar();
		frmGestionDesContacts.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu mnNewMenu = new JMenu("Gestion des contacts");
		menuBar.add(mnNewMenu);
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Lister");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Rechercher");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmLister = new JMenuItem("Statistiques genr\u00E9es");
		mnNewMenu.add(mntmLister);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmGestionDesContacts.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Liste des contacts", null, panel_1, null);
		
		table = new JTable();
		table.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 11));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"Pseudonyme", "\u2640 \u2642", "Nom", "Pr\u00E9nom", "Adresse", "Code Postal", "Ville"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, String.class, String.class, String.class, Integer.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(92);
		table.getColumnModel().getColumn(1).setPreferredWidth(30);
		table.getColumnModel().getColumn(2).setPreferredWidth(92);
		table.getColumnModel().getColumn(3).setPreferredWidth(92);
		table.getColumnModel().getColumn(4).setPreferredWidth(205);
		table.getColumnModel().getColumn(5).setPreferredWidth(67);
		table.getColumnModel().getColumn(6).setPreferredWidth(112);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Rechercher", null, panel_2, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Statistiques", null, panel, null);
	}

	public void setVisible() {
		this.frmGestionDesContacts.setVisible(true);
	}

}
