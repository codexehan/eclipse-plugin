package customplugin.views.navigator;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import customplugin.views.navigator.data.PropertiesTreeData;
import customplugin.views.navigator.data.PropertiesTreeParentData;
import customplugin.views.navigator.data.PropertiesTreeRootData;

public class NavigatorContentProvider implements ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		// TODO Auto-generated method stub
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		// TODO Auto-generated method stub
		/*if(parentElement instanceof IFile){
			IFile file = (IFile) parentElement;
			String name = file.getName() +"[Tree Data]";
			PropertiesTreeData propertiesTreeData = new PropertiesTreeData(name, file, file.getProject());
			return new Object[]{propertiesTreeData};
		}*/
		if(parentElement instanceof PropertiesTreeRootData){
			return ((PropertiesTreeRootData)parentElement).getParentNodes();
		}
		else if(parentElement instanceof PropertiesTreeParentData){
			return ((PropertiesTreeParentData)parentElement).getChildren();
		}
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		// TODO Auto-generated method stub
		/*if(element instanceof IFile){
			return true;
		}*/
		if(element instanceof PropertiesTreeParentData){
			return true;
		}
		return false;
	}

}
