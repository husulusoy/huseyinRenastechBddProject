package guru99.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties configfile;
    static {


        try{
            FileInputStream fileInputStream=new FileInputStream("src/test/resources/Configuration.properties");
            configfile=new Properties();
            configfile.load(fileInputStream);

            fileInputStream.close();
        }catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        return configfile.getProperty(key);
    }
}
