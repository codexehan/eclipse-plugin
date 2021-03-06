package customplugin.views.navigator.data;

import java.util.ArrayList;

import org.eclipse.core.runtime.IAdaptable;

public class PropertiesTreeRootData implements IAdaptable{

	private ArrayList<PropertiesTreeData> parents;
	
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		// TODO Auto-generated method stub
		return null;
	}
	public PropertiesTreeRootData(){
		parents = new ArrayList<PropertiesTreeData>();
		//create parent nodes and its children nodes
		for(int i = 1; i < 3; i++){
			PropertiesTreeParentData parent = new PropertiesTreeParentData("Parent " + i, null, null);
			for(int j = 1; j < 3; j++){
				PropertiesTreeData child = new PropertiesTreeData("Child " + i+ j, null, null);
				parent.addChild(child);
			}
			parents.add(parent);
		}
	}
	public Object[] getParentNodes(){
		return this.parents.toArray();
	}
}
