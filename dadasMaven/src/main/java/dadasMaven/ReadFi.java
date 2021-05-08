package dadasMaven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadFi {
	public static void main(String[] args) throws IOException {
		readxls();
	}

	public static void readxls() throws IOException {
		System.out.println("chudurBudur");

		String file = "data/Sample.xls";

		FileInputStream fi = new FileInputStream(file);

		Workbook wb = new HSSFWorkbook(fi);

		Sheet sh = wb.getSheet("Sheet1");

		for (Row r : sh) {
			for (Cell c : r) {
//				String t = c.getStringCellValue();
//				System.out.println(t);

				if (c.getCellType() == Cell.CELL_TYPE_STRING) {
					System.out.println(c.getStringCellValue());
				} else if (c.getCellType() == Cell.CELL_TYPE_NUMERIC) {

					if (c.getNumericCellValue() % 1 == 0) {
						int i = (int) c.getNumericCellValue();
						System.out.println(i);

					} else {
						double d = c.getNumericCellValue();
						System.out.println(d);
					}
				}

			}

		}

		wb.close();
		fi.close();

	}

}
