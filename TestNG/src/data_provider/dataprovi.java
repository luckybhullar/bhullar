package data_provider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovi {
	@Test(dataProvider="datademo")
	
public void m(String para )
{
		
		System.out.println(para);
		
		
		
		
		
		
		
}

	@DataProvider(name ="datademo")
	public Object[][] da() {
		
		Object[][]  arr=new Object[][] {{"user1"},{"user2"},{"user3"}};
		
		
		return arr;
		
		
		
	}


}
