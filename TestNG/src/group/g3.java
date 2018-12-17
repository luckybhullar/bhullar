package group;

import org.testng.annotations.Test;

public class g3 {
@Test (groups= {"smoke"})
	
	public void g1()
	{
		System.out.println("we r in class3    g1 smoke ");
		
		
	}
	
@Test (groups= {"functional"})
	
	public void g2()
	{
		System.out.println("we r in class 3   g2   functional2");
		
		
	}
	
	
@Test (groups= {"smoke"})

public void g33()
{
	System.out.println("we r in class3 g3   smoke");
			
}

}
