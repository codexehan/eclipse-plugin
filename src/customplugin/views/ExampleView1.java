package customplugin.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ExampleView1 extends ViewPart {
public static final String ID = "CustomPlugin.views.ExampleView1";
	public ExampleView1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		Text text = new Text(parent, SWT.BORDER);
        text.setText("Hello View");
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
