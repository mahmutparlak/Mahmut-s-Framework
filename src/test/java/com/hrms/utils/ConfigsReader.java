package com.hrms.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
    static Properties properties;
    /**
     * This method reads any property file
     * @param filePath
     * @return Properties
     */
    public static Properties readProperties(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    /**
     * This method retrieves single value based on the specified key
     * @param key
     * @return
     */
    public static String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}
