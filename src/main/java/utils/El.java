package utils;

import org.openqa.selenium.By;

public class El {

    public By selector;
    public String description;

    public El(By selector, String description) {
        this.selector = selector;
        this.description = description;
    }

}
