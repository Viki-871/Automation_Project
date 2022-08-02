package files;

import org.testng.annotations.DataProvider;

public class DP001 {

	
	@DataProvider(name="DataMobile")
	public static String[][] getData() {
		// TODO Auto-generated method stub
		String[][] testData = new String[2][2];
		
		testData[0][0] = "Vignesh";
		testData[0][1] = "1234567";
		
		testData[1][0] = "Vignesh";
		testData[1][1] = "1234567";
		
		
		return testData;

	}

}
