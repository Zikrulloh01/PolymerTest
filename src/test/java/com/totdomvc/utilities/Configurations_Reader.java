package com.totdomvc.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Configurations_Reader {


    private static Properties properties;


    static{
        try {

            String path = "conf.properties";
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



    public static String getKey(String keyName){
        return properties.getProperty(keyName);
    }


}
