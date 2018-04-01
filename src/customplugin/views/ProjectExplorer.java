package customplugin.views;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.navigator.CommonNavigator;

import customplugin.views.navigator.data.PropertiesTreeRootData;

public class ProjectExplorer extends CommonNavigator {
	
	protected IAdaptable getInitialInput()
    {
        return new PropertiesTreeRootData();
    }
}
