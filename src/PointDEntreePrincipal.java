import java.awt.EventQueue;

import mvc.ctrl.FenetreDEntreeCtrl;

public class PointDEntreePrincipal {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FenetreDEntreeCtrl ctrl = new FenetreDEntreeCtrl();
				ctrl.displayView();
			}
		});
	}

}
