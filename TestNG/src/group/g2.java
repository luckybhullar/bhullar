package group;

import org.testng.annotations.Test;

public class g2 {
	
	
	
	
	
	
@Test (groups= {"smoke","functional"})
	
	public void g1()
	{
		System.out.println("we r in class2    g1 smoke ");
		
		
	}
	
@Test (groups= {"functional"})
	
	public void g222()
	{
		System.out.println("we r in class 2   g2   functional2");
		
		
	}
	
	
@Test (groups= {"smoke"})

public void g3()
{
	System.out.println("we r in class2 g3   smoke");
			
}
	

}
