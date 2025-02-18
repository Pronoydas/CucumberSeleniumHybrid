package com.learn.automation.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class GenericUtils    {
	String filePath = System.getProperty("user.dir")+"\\Resource\\Properties\\Global.properties";
	
	
	
	
	public String readProperites(String properitesName) throws Exception {
		File file =new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
		String value=(String) p.get(properitesName);
		return value;
		
		
	}

}
