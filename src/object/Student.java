package object;
import java.util.ArrayList;

public class Student 
{
	private String id;
	private String lastName;
	private String firstName;
	private String degree;
	private ArrayList<Address> addressList;
	
	//id
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	
	//lastName
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	//firstName
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	//degree
	public String getDegree() 
	{
		return degree;
	}
	public void setDegree(String degree) 
	{
		this.degree = degree;
	}
	
	//addressList
	public ArrayList<Address> getAddressList() 
	{
		return addressList;
	}
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	
	public String processStudent()
	{
		String studentOutput = new String();
		studentOutput += "Student id is " + id + "\n" +
											"Student name is " + lastName + ", " + firstName + "\n" +
											"Studying " + degree + "\n";
				
		for(Address address : addressList)
		{
			studentOutput += address;
		}
		return studentOutput;
	}
	
}
