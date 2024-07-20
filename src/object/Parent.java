package object;

public class Parent 
{
	private String id;
	private String parentType;
	private String F, M, G;
	private String parentName;

	//id
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
		
	//parentType
	public String getParentType() 
	{
		return parentType;
	}
	public void setParentType(String parentType) 
	{
		this.parentType = parentType;
	}

	//parentName
	public String getParentName() 
	{
		return parentName;
	}
	public void setParentName(String parentName) 
	{
		this.parentName = parentName;
	}

	public void processParent()
	{
		if(parentType == F)
		{
			System.out.println("Father's name is " + parentName);
		}
		else if(parentType == M)
		{
			System.out.println("Mother's name is " + parentName);
		}
		else if(parentType == G)
		{
			System.out.println("Guardian's name is " + parentName);
		}
		else
		{
			System.out.println();
		}						 
	}
	
}
