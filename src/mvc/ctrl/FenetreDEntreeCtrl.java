package mvc.ctrl;

import mvc.model.FenetreDEntreeModel;
import mvc.view.FenetreDEntree;

public class FenetreDEntreeCtrl {
	private FenetreDEntree view;
	private FenetreDEntreeModel model = new FenetreDEntreeModel();


	public void displayView() {
		try {
			view = new FenetreDEntree(model);
			view.setVisible();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
