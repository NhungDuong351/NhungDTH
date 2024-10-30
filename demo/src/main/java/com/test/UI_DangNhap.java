package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_DangNhap {
    private WebDriver driver;
    public void setUp() {
        // Đường dẫn tới driver của Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        // Khởi tạo WebDriver với ChromeDriver
        driver = new ChromeDriver();

        // Mở một trang web
        driver.get(Variables.URL);
    }
    
    public void redirect_to_DangNhap (){
        //Tạo đối tượng -> Gọi hàm ClosePopup
        ClosePopup ClosePopup = new ClosePopup();
        ClosePopup.closePopup(driver, 3);

        //Tim -> Click button Dang Nhap
        WebElement button_login = driver.findElement(By.className("btn-login"));
        button_login.click();

        //Gọi hàm chờ 1s
        Common.waitForSeconds(1);
    }

    public void test_UI_DangNhap (){
        // Tìm phần tử chứa label mong muốn
        WebElement Label_1 = driver.findElement(By.className("title-signup"));  

        // Lấy giá trị của label thực tế
        String actualLabel_1 = Label_1.getText();

        // Giá trị mong muốn (label mong muốn)
        String expectedLabel_1 = "Đăng nhập vào tài khoản của bạn";  // Thay bằng giá trị mong muốn

        // So sánh giữa giá trị mong muốn và giá trị thực tế
        if (actualLabel_1.equals(expectedLabel_1)) {
            System.out.println("Test Passed: Label is correct.");
        } else {
            System.out.println("Test Failed: Label is incorrect.");
            System.out.println("Expected: " + expectedLabel_1);
            System.out.println("Actual: " + actualLabel_1);
        }
    }
    public void quit() {
        // Đóng trình duyệt
        driver.quit();
    }
    public static void main(String[] args) {
        UI_DangNhap UI_dangNhap = new UI_DangNhap();
        UI_dangNhap.setUp();
        UI_dangNhap.redirect_to_DangNhap();
        UI_dangNhap.test_UI_DangNhap();
        UI_dangNhap.quit();
    }
}