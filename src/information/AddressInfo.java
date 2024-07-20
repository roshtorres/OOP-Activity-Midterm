package information;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import object.Address;

public class AddressInfo 
{
	private ArrayList<Address> addressList;
	
	public AddressInfo(String id) throws FileNotFoundException
	{
		//read addressfile
		Scanner addressFile = new Scanner(new FileReader("../OOP Activity/src/AddressInfo.csv"));
	
		addressList = new ArrayList<Address>();
	
		while(addressFile.hasNext())
		{
			String rowAddress = new String();
			rowAddress = addressFile.nextLine();
		
			String[] rowAddressSpecific = new String[3];
			rowAddressSpecific = rowAddress.split(",");
		
			if(id.equals(rowAddressSpecific[0]))
			{
				//Address object
				Address address = new Address();
			
				//put data in Address object
				address.setId(rowAddressSpecific[0].trim());
				address.setAddressType(rowAddressSpecific[1].trim());
				address.setLocation(rowAddressSpecific[2].trim());
			
				addressList.add(address);
			}
		}	
		addressFile.close();
	}
	
	public ArrayList<Address> getAddressList()
	{
		return addressList;
	}
	
}
