package com.session;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class ReadApplicationProperties {

	public static Properties getProperties() throws IOException{
		
		Path path = Paths.get("src/main/resources").toAbsolutePath().resolve("application.properties");
		Properties properties = new Properties();
		properties.load(new FileInputStream(path.toString()));
		
		return properties;
	}
	
	public static String getInfo() throws IOException{
		
		String url = getProperties().getProperty("hatasource.url");
		String name = getProperties().getProperty("datasource.username");
		String password = getProperties().getProperty("DataSource.password");
		
		return String.format("url : %s\nuser name : %s\npassword : %s", url,name,password);
	}
}
