package testn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ng {
	
	@Test
	
	
	public void m1()
	{
		System.out.println("1111");
	}
@Test
	
	
	public void m4()
	{
		System.out.println("ttttt222");
	}
 @BeforeClass
	public void m2()
	{
		
	System.out.println("Befor class1111");
	}
	
   @AfterClass(enabled=false)

 
   public void m3()
	{
		
	System.out.println("After classs1111");
	}
 
 
	
@BeforeClass
	public void m5()
	{
		
	System.out.println("Beforeclasss2222");
	}
	
  @AfterClass


  public void m6()
	{
		
	System.out.println("Afterclass2");
 
	}
  
  
  
  
  
  
  
}
