package object;
import java.util.ArrayList;

public class Address 
{
	private String id;
	private String addressType;
	private String C, P;
	private String location;
	private ArrayList<Parent> parentList;
	
	//id
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
		
	//addressType
	public String getAddressType() 
	{
		return addressType;
	}
	public void setAddressType(String addressType) 
	{
		this.addressType = addressType;
	}

	//location
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}

	//parentList
	public ArrayList<Parent> getParentList() 
	{
		return parentList;
	}
	public void setParentList(ArrayList<Parent> parentList) 
	{
		this.parentList = parentList;
	}
	
	public void processAddress()
	{
		if(addressType == C)
		{
			System.out.println("City address is " + location);
		}
		else if(addressType == P)
		{
			System.out.println("Provincial address is " + location);
		}				 
	}
	
}
