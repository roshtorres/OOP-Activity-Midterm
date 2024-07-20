package information;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import object.Student;

public class StudentInfo 
{
	private ArrayList<Student> studentList;
	
	public StudentInfo() throws FileNotFoundException
	{
		//read studentFile
		Scanner studentFile = new Scanner(new FileReader("../OOP Activity/src/StudInfo.csv"));
		
		studentList = new ArrayList<Student>();
		
		while(studentFile.hasNext())
		{
			String rowStudent = new String();
			rowStudent = studentFile.nextLine();
			
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			
			//Student object
			Student student = new Student();
			
			//put data in Student object
			student.setId(rowStudentSpecific[0].trim());
			student.setLastName(rowStudentSpecific[1].trim());
			student.setFirstName(rowStudentSpecific[2].trim());
			student.setDegree(rowStudentSpecific[3].trim());
			
			//create addressInfo
			AddressInfo addressInfo = new AddressInfo(student.getId());
			
			//attach the courseList to Student object
			student.setAddressList(addressInfo.getAddressList());
			
			studentList.add(student);
		}
		studentFile.close();
	}
	
	public ArrayList<Student> getStudentList()
	{
		return studentList;
	}

}
