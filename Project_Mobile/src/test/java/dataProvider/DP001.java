package dataProvider;

import org.testng.annotations.DataProvider;

public class DP001 {
	
	
	
	@DataProvider(name="DataMobile")
	public static String[][] getData() {
		// TODO Auto-generated method stub
		String[][] testData = new String[3][2];
		
		testData[0][0] = "Vignesh";
		testData[0][1] = "Data@123#";
		
		testData[1][0] = "Vi";
		testData[1][1] = "V2";
		
		testData[2][0] = "Vignesgoityrtdgfhhl884635565657657";
		testData[2][1] = "V21234xcfghjkl";
		
		
		
		return testData;

	}

}



