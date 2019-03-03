import java.awt.EventQueue;
import data.access.layer.MySQLConnector;
import mvc.ctrl.FenetreDEntreeCtrl;

public class PointDEntreePrincipal {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		MySQLConnector.test(null);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				FenetreDEntreeCtrl ctrl = new FenetreDEntreeCtrl();
				ctrl.displayView();
				
			}
		});
	}

}
