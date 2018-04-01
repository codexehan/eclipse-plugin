package customplugin;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import customplugin.views.ExampleView1;

public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// TODO Auto-generated method stub
		layout.addView(ExampleView1.ID, IPageLayout.RIGHT,
                (float) 0.75, IPageLayout.ID_EDITOR_AREA);
		
	}

}
