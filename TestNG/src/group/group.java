package group;
import org.testng.annotations.Test;

public class group {
	
	@Test (groups= {"smoke"})
	
	public void g1()
	{
		System.out.println("we r in class1    g1 smoke ");
		
		
	}
	
@Test (groups= {"functional"})
	
	public void g2()
	{
		System.out.println("we r in class 1   g2   functional2");
		
		
	}
	
	
@Test (groups= {"smoke"})

public void g3()
{
	System.out.println("we r in class1 g3   smoke");
			
}

	
@Test (groups= {"sanity"})

public void g4()
{
	System.out.println("we r in class 1 g4 sanity");
		
}	
	
		

}
