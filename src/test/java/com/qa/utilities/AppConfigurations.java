package com.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfigurations {
	
	public static String getValue(String key) throws IOException {

	
	File file =new File("AppConfigration//Appconfig.properties");
	
	FileInputStream fileInput=new FileInputStream(file);
	
	Properties properties= new Properties();
	
	properties.load(fileInput);
	
	return properties.getProperty(key);
	}
}
