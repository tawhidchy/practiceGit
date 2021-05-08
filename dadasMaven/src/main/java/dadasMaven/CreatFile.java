package dadasMaven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class CreatFile {

	public static void main(String[] args) throws IOException {
		
		writing();
		
	}
	
	public static void writing() throws IOException {
		String file = "data/Sample.xls";

		FileOutputStream fis = new FileOutputStream(file);

		Workbook wb = new HSSFWorkbook();
		Sheet sh = wb.createSheet("Sheet1");
		Row r = sh.createRow(0);
		Cell c = r.createCell(0);
		c.setCellValue("java");

		wb.write(fis);
		wb.close();
		fis.close();

	}

}
