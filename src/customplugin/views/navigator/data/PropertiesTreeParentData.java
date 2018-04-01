package customplugin.views.navigator.data;

import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;

public class PropertiesTreeParentData extends PropertiesTreeData{
	
	private ArrayList<PropertiesTreeData> children;
	
	public PropertiesTreeParentData(String name, IFile file, IProject project) {
		super(name, file, project);
		// TODO Auto-generated constructor stub
		children = new ArrayList<PropertiesTreeData>();
	}
	
	public void addChild(PropertiesTreeData child){
		children.add(child);
	}
	
	public void removeChild(PropertiesTreeData child){
		children.remove(child);
	}
	
	public Object[] getChildren(){
		return this.children.toArray();
	} 
}
