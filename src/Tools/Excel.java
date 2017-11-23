package Tools;

import java.io.File;
import java.io.FileInputStream;
import java.util.Dictionary;
import java.util.Hashtable;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.HSSF.usermodel.HSSFSheet;
//import org.apache.poi.HSSF.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class Excel {
	
	
	public static Dictionary<String, String> readfromExcelinDict() 
	{
		try
		{
			System.out.println("inside excel");
		String sDataFile=	System.getProperty("user.dir") +"\\Resources\\" +"Test_data.xls";
		//test file is located in your project path         
	    FileInputStream fileIn = new FileInputStream(sDataFile);
	    //read file 
	    POIFSFileSystem fs = new POIFSFileSystem(fileIn); 
	    HSSFWorkbook filename = new HSSFWorkbook(fs);
	    //open sheet 0 which is first sheet of your worksheet
	    HSSFSheet sheet = filename.getSheet("Sheet1");
	    
	    
	 // create a new hashtable
	    Dictionary<String, String> dict = new Hashtable();
	 	  
	    // add elements in the hashtable
	    int icount;
	    for (icount=0 ; icount<17;icount++)
	    {
	    dict.put(sheet.getRow(0).getCell(icount).getStringCellValue(), sheet.getRow(1).getCell(icount).getStringCellValue());
	    
	     
	    }
	  //  System.out.println(dict.get("URL"));
	    
	    System.out.println("outside excel");
	    return dict;
		}
		catch(Exception e)
		{
			return null;
		
		}
		
		
	}

	public static Dictionary<String, String> readfromExcelinDict(String sSheet) 
	{
		try
		{
		
		String sDataFile=	System.getProperty("user.dir") +"\\Resources\\" +"Test_data.xls";
		
		//test file is located in your project path         
	    FileInputStream fileIn = new FileInputStream(sDataFile);
	    //read file 
	   
	    POIFSFileSystem fs = new POIFSFileSystem(fileIn);
	   
	    HSSFWorkbook filename = new HSSFWorkbook(fs);
	   
	    //open sheet 0 which is first sheet of your worksheet
	    HSSFSheet sheet = filename.getSheet(sSheet);
	   
	    
	    
	 // create a new hashtable
	    Dictionary<String, String> dict = new Hashtable();
	    int iCheck;
	    System.out.println("bfore loop");
	    for ( iCheck=0;iCheck<50;iCheck++)
	    {
	    	if(sheet.getRow(0).getCell(iCheck).getStringCellValue().equals("end") )
	    	{
	    		break;
	    	}
	    	
	    }
	    
	    System.out.println("totla column is" +iCheck);
	    // add elements in the hashtable
	    int icount;
	    
		for (icount=0 ; icount<iCheck;icount++)
	    {
	    dict.put(sheet.getRow(0).getCell(icount).getStringCellValue(), sheet.getRow(1).getCell(icount).getStringCellValue());
	    
	     
	    }
	  //  System.out.println(dict.get("URL"));
	    
	    
	    return dict;
		}
		catch(Exception e)
		{
			return null;
		
		}
		
		
	}
	

	public static String readFromExcel(String filePath,String sheetName,int row,int col) 
	{
		 String sdata;
	 try {

		 File src=new File(filePath);
		 FileInputStream fis=new FileInputStream(src);
		 HSSFWorkbook wb=new HSSFWorkbook(fis);
		 HSSFSheet sh1= wb.getSheet(sheetName);
		 sdata=sh1.getRow(row).getCell(col).getStringCellValue();
		 } 
	 catch (Exception e) {
		 System.out.println(e.getMessage());
		 sdata=null;
		 }
		return sdata;
}
	
	public static String readFromExcel(String filePath,int sheetIndex,int row,int col) 
	{
		 String sdata;
	 try {

		 File src=new File(filePath);
		 FileInputStream fis=new FileInputStream(src);
		 HSSFWorkbook wb=new HSSFWorkbook(fis);
		 HSSFSheet sh1= wb.getSheetAt(sheetIndex);
		 sdata=sh1.getRow(row).getCell(col).getStringCellValue();
		 } 
	 catch (Exception e) {
		 System.out.println(e.getMessage());
		 sdata=null;
		 }
		return sdata;
}
	
	public static String readFromExcel(String filePath,int row,int col) 
	{
		 String sdata;
		
	 try {

		 File src=new File(filePath);
		
		 FileInputStream fis=new FileInputStream(src);
		 HSSFWorkbook wb=new HSSFWorkbook(fis);
		 //HSSFWorkbook wb=new HSSFWorkbook(fis);
		 HSSFSheet sh1= wb.getSheetAt(0);
		
		 sdata=sh1.getRow(row).getCell(col).getStringCellValue();
		 } 
	 catch (Exception e) {
		
		 sdata=null;
		 }
		return sdata;
}
}
