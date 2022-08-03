package dataProvider;

import org.testng.annotations.DataProvider;

public class DP004 {
	
	
	@DataProvider(name="OrderData")
	public static String[][] getData(){
		
		String[][] testData = new String[2][11];
		    
		    testData[0][0]="samsung";
		    testData[0][1]="Vignesh";
	        testData[0][2]="Viki";
	        testData[0][3]="abcd@gmail.com";
	        testData[0][4]="abc@123#";
	        testData[0][5]="9865098650";
	        testData[0][6]="No.1";
	        testData[0][7]="GH road";
	        testData[0][8]="Bengaluru";
	        testData[0][9]="560032";
	        testData[0][10]="1";

	        testData[1][0]="Apple";
	        testData[1][1]="Vi";
	        testData[1][2]="Ki";
	        testData[1][3]="qwer@yahoo.com";
	        testData[1][4]="qwe1235676543";
	        testData[1][5]="7865078650765";
	        testData[1][6]="2-454";
	        testData[1][7]="Manyata";
	        testData[1][8]="China";
	        testData[1][9]="560043";
	        testData[1][10]="2";
		
		return testData;
	}

}
