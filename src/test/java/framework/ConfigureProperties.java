package framework;

import org.apache.log4j.Level;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigureProperties {

    public static String adminUsername;
    public static String adminPassword;
    public static String local_URL;
    public static String patientFirstName;
    public static String patientLastName;
    public static String patientGender;
    public static String patientAgeInYears;
    public static String patientVillage;
    public static String registrationFee;

    public static void readProperties() {
        Properties properties = new Properties();
        try {
            InputStream inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);

            adminUsername = properties.getProperty("adminUsername");
            adminPassword = properties.getProperty("adminPassword");
            local_URL = properties.getProperty("local_URL");
            patientFirstName = properties.getProperty("patientFirstName");
            patientLastName = properties.getProperty("patientLastName");
            patientGender = properties.getProperty("patientGender");
            patientAgeInYears = properties.getProperty("patientAgeInYears");
            patientVillage = properties.getProperty("patientVillage");
            registrationFee = properties.getProperty("registrationFee");

        } catch (Exception e) {
            LoggerClass.showLog(ConfigureProperties.class, Level.WARN, "Exception: " + e.getMessage());
        }
    }
}