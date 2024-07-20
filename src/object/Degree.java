package object;

public class Degree 
{
	private String degreeType;
	private String BSCS, BSIE, BSCE, BSECE;
		
	//degreeType
	public String getDegreeType() 
	{
		return degreeType;
	}
	public void setDegreeType(String degreeType) 
	{
		this.degreeType = degreeType;
	}

	public void processDegree()
	{
		if(degreeType== BSCS)
		{
			System.out.println("Studying BS Computer Science");
		}
		else if(degreeType == BSIE)
		{
			System.out.println("Studying  BS Industrial Engineering");
		}
		else if(degreeType == BSCE)
		{
			System.out.println("Studying  BS Civil Engineering");
		}
		else if(degreeType == BSECE)
		{
			System.out.println("Studying  BS Electronics Engineering");
		}			 
	}

}
