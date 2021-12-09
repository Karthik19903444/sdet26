package com.crm.comcast.genericutility;

import java.io.FileInputStream;
import java.util.Properties;








public class FileUtility {
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./vtigercommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		 String value = pobj.getProperty(key);
			return value;
		
	    }
	}


