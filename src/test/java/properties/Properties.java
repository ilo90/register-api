package properties;

import java.io.IOException;
import java.io.InputStream;

public class Properties {
    private static final java.util.Properties properties = new java.util.Properties();

    static {
        try (InputStream in = Properties.class.getClassLoader().getResourceAsStream("configuration.properties")) {
            if (in != null) {
                properties.load(in);
            }
        } catch (IOException e) {
            throw new RuntimeException("Couldn't load config.properties", e);
        }
    }

    public static String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }
}
