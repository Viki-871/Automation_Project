package dataProvider;

import org.testng.annotations.DataProvider;

public class DP002 {

	
	@DataProvider(name="signUpData")
	public static String[][] getData() {
		
		
		String[][] testData = new String[3][7];
		
		testData[0][0] ="Vignesh";
		testData[0][1]="Viki";
		testData[0][2]="viki123@gmail.com";
		testData[0][3]="Viki@123#";
		testData[0][4]="04-03-1998";
		testData[0][5]="9876543210";
		testData[0][6]="Hi";
		
		testData[1][0] ="Vi";
		testData[1][1]="ki";
		testData[1][2]="123@gmai.com";
		testData[1][3]="vi";
		testData[1][4]="09-12-2000";
		testData[1][5]="98765498776";
		testData[1][6]="Hi";
		
		testData[2][0] ="Vignesh987654";
		testData[2][1]="Viki34567890";
		testData[2][2]="vdf@yahoo.com";
		testData[2][3]="234567890-poikjhgfdxcvb";
		testData[2][4]="09-09-2023";
		testData[2][5]="98asdfghj76543210";
		testData[2][6]="Hi";
		
		return testData;
		
	}
}
