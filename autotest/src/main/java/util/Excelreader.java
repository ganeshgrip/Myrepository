package util;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Excelreader {
		public static void main(String[] args) throws IOException {
			File src = new File("C:\\Users\\karpaga\\eclipse-workspace\\autotest\\src\\main\\resources\\Autoscript.xlsx");
			//load file
			FileInputStream fis = new FileInputStream(src);
			//load workbook
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			//Load sheet- here we are loading 1st sheet only
			XSSFSheet sh1 = wb.getSheetAt(0);
			System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
			System.out.println(sh1.getRow(0).getCell(2).getStringCellValue());
			System.out.println(sh1.getRow(0).getCell(0).getRawValue());
			System.out.println(sh1.getRow(2).getCell(2).getStringCellValue());
			

		}

	}


