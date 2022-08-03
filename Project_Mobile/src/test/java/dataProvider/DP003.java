package dataProvider;

import org.testng.annotations.DataProvider;

public class DP003 {
	
	
	@DataProvider(name="ContactData")
	public static String[][] getData(){
		
		String[][] testData = new String[2][4];
		
		testData[0][0]="Vignesh";
		testData[0][1]="viki123@gmail.com";
		testData[0][2]="9876543210";
		testData[0][3]="error due to rain ";
		
		
		testData[1][0]="Vi";
		testData[1][1]="123@yahoo.com";
		testData[1][2]="987654";
		testData[1][3]="A";
		
		
		return testData;
		
	}

}
