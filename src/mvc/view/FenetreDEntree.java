package mvc.view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class FenetreDEntree {

	private JFrame frmGestionDesContacts;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreDEntree window = new FenetreDEntree();
					window.frmGestionDesContacts.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetreDEntree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDesContacts = new JFrame();
		frmGestionDesContacts.setTitle("Gestion des contacts");
		frmGestionDesContacts.setBounds(100, 100, 450, 300);
		frmGestionDesContacts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
