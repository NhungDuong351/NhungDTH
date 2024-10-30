package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClosePopup { // Đổi tên lớp cho phù hợp với quy tắc Java
    public void closePopup(WebDriver driver, int seconds) { // Đổi tên phương thức
        // Khởi tạo WebDriverWait với Duration
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));

        try {
            // Chờ đến khi button X có thể được nhìn thấy
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("popup-close")));

            // Tìm button X
            WebElement closeButton = driver.findElement(By.className("popup-close"));

            // Click vào button X
            closeButton.click();
        } catch (Exception e) {
            System.out.println("Error: Unable to close popup. " + e.getMessage());
        }
    }
}