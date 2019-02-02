package mvc.view;

import javax.swing.JFrame;

import mvc.model.FenetreDEntreeModel;

public class FenetreDEntree {

	private JFrame frmGestionDesContacts;
	private FenetreDEntreeModel model;

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
		frmGestionDesContacts.setBounds(100, 100, 450, 300);
		frmGestionDesContacts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setVisible() {
		this.frmGestionDesContacts.setVisible(true);
	}

}
