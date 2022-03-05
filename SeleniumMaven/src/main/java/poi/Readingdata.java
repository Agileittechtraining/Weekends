package poi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingdata {

public String readrowandcol(String filename,String sheetname,int rownumber,int colnumber) throws IOException {
FileInputStream fi = new FileInputStream(filename);
XSSFWorkbook workbook = new XSSFWorkbook(fi);
Sheet sheet = workbook.getSheet(sheetname);
Row r = sheet.getRow(rownumber);
Cell c = r.getCell(colnumber);
String valuefromexcel = c.getStringCellValue();
return valuefromexcel;
	}

}
