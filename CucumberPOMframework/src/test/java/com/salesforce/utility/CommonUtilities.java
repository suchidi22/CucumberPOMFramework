package com.salesforce.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;



public class CommonUtilities {
	
	private FileInputStream stream=null;
	private Properties propertyFile=null;
	
	public  Properties loadFile(String filename){
		
		propertyFile = new Properties();
		String  PropertyFilePath=null;
		switch(filename) {
		case "applicationDataProperties":
			PropertyFilePath =Constants.APPLICATION_PROPERTIES;
							break;
		case "studentRegistrationProperties":
			PropertyFilePath =Constants.STUDENT_REGISTRATION_PROPERTIES;
							break;
		}
		try {
			stream=new FileInputStream(PropertyFilePath);
			propertyFile.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertyFile;
	}
	
	public String getPropertyValue(String Key) {//,Properties file//reading the property value
		
		String value = propertyFile.getProperty(Key);
		System.out.println("Property we got from the file is::" + value);
		try {
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}
	
	public HashMap getAllPropertiesAsSet(Properties propertyFile) {
		
		return new HashMap(propertyFile);
	}

}
