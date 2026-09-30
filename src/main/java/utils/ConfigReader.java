package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    public static void loadProperties() throws IOException {

        prop = new Properties();

        InputStream input = ConfigReader.class.getClassLoader()
                .getResourceAsStream("config/properties/Config.properties");

        if (input == null) {

            throw new RuntimeException(
                    "Config.properties file not found on classpath");
        }

        prop.load(input);
    }

    public static String getProperty(String key) {

        return prop.getProperty(key);
    }
}