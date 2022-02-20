package com.SalesForce.Manager;

import com.SalesForce.ConfigFileReader.ConfigFileReader;

public class FileReadManager {

	
	private FileReadManager() {
	}
	
	private static FileReadManager fileReadManager = new FileReadManager();

	public static FileReadManager getInstance() {
		return fileReadManager;
	}
	
	ConfigFileReader configFileReader;
	public ConfigFileReader getConfogFileReader() {
		return (configFileReader==null)? new ConfigFileReader():configFileReader;
	}


}
