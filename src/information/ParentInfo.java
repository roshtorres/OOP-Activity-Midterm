package information;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import object.Parent;

public class ParentInfo 
{
	private ArrayList<Parent> parentList;
	
	public ParentInfo(String id) throws FileNotFoundException
	{
		//read parentFile
		Scanner parentFile = new Scanner(new FileReader("../OOP Activity/src/ParentInfo.csv"));
	
		parentList = new ArrayList<Parent>();
	
		while(parentFile.hasNext())
		{
			String rowParent = new String();
			rowParent = parentFile.nextLine();
		
			String[] rowParentSpecific = new String[3];
			rowParentSpecific = rowParent.split(",");
		
			if(id.equals(rowParentSpecific[0]))
			{
				//Parent object
				Parent parent = new Parent();
			
				//put data in Parent object
				parent.setId(rowParentSpecific[0].trim());
				parent.setParentType(rowParentSpecific[1].trim());
				parent.setParentName(rowParentSpecific[2].trim());
			
				parentList.add(parent);
			}
		}	
		parentFile.close();
	}
	
	public ArrayList<Parent> getParentList()
	{
		return parentList;
	}
	
}
