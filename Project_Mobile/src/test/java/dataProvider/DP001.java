package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP001 {
     
	@Test
	//@DataProvider(name="mobileData")
	public void getData()  {
		
		String[][] testData = new String[2][4];
		
		try {
			
			FileInputStream fis = new FileInputStream("./testData/TC001.xlsf");
			
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workBook.getSheetAt(0);
			
			int rowCount =  sheet.getLastRowNum();
			
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			System.out.println("Row count "+rowCount);
			System.out.println("Column count "+columnCount);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//return testData;
		
		

		
		
		
	}

}
