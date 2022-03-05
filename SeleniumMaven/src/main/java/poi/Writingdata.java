package poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileOutputStream fo = new FileOutputStream("C:\\Filehandling\\usernamedata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Mysheet");
		Row r = sheet.createRow(0);
		Cell c =r.createCell(0);
		c.setCellValue("Hi this is created from POI");
		workbook.write(fo);
		workbook.close();
		
	}

}
