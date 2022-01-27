package assignment_new;

import java.io.File;
/***
 * 
 * @author chethana somashekar
 *
 */


public class Assignment__1 {

	static String excelPath = "./testdata/testdata1.xls";
	/**
	 * This method is used to read string data from an excel file
	 * @param sheetname provide the sheet name where you have the test data
	 * @param rowNum provide the row number where you have test data
	 * @param cellNum provide the cell num which you want to read
	 * @return it returns the data in that respective sheet , row cell in the form of string
	 */
	public static String readStringData(String sheetname, int rowNum, int cellNum)  {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			
		}catch (EncryptedDocumentException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getStringCellValue();
		
	}
	public static double readNumberData(String sheetname, int rowNum, int cellNum)  {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			
		}catch (EncryptedDocumentException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getNumericCellValue();
	}
	public static boolean readBooleanData(String sheetname, int rowNum, int cellNum)  {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			
		}catch (EncryptedDocumentException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return workbook.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getBooleanCellValue();
	}
	public static Date readDateData(String sheetname, int rowNum, int cellNum) {
		Workbook workbook = null;
		try {
			File absPath = new File(excelPath);
			FileInputStream fis = new FileInputStream(absPath);
			workbook = WorkbookFactory.create(fis);
		}catch(FileNotFoundException e) {
			
		}catch (EncryptedDocumentException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  (Date) workbook.getSheet(sheetname).getRow(rowNum).getCell(cellNum).getDateCellValue();
	
	}
	

}
