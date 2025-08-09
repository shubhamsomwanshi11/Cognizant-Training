package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingDataPropertyFile {
	public String getData(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream fStream = new FileInputStream(AutoConstant.propertyFilePath);
		properties.load(fStream);
		return properties.getProperty(key);
	}
}
