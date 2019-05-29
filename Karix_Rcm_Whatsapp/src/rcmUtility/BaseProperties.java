package rcmUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseProperties {
	
	static Properties props = new Properties();
	
    public static void loadRcmDBProperties() throws IOException {
    	File propertyFile = new File(System.getProperty("user.dir")+"\\src\\rcmUtility\\RcmDB.properties");
        FileInputStream fisRcmDB = new FileInputStream(propertyFile);
        props.load(fisRcmDB);
        fisRcmDB.close();
	    }
		
    public static void loadRcmCommonProperties() throws IOException {
    	File propertyFile = new File(System.getProperty("user.dir")+"\\src\\rcmUtility\\RcmCommon.properties");
        FileInputStream fisRcmCommon = new FileInputStream(propertyFile);
        props.load(fisRcmCommon);
        fisRcmCommon.close();
    }
    
    public static String getProperties(String data) throws IOException {
    	loadRcmCommonProperties();
    	loadRcmDBProperties();
    	String propertyValue = props.getProperty(data);
        return propertyValue;
    }
   
}
