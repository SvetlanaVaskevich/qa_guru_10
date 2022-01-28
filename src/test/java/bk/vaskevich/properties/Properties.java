package bk.vaskevich.properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class Properties {

    @Tag("properties")
    @Test
    public void systemProretiesTest(){
        String browser = System.getProperty("browser","");
        String version = System.getProperty("version","");

        System.out.println(browser);
        System.out.println(version);
    }
}
