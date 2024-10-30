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

    public void redirect_to_DangNhap() {
        // Tạo đối tượng -> Gọi hàm ClosePopup
        ClosePopup ClosePopup = new ClosePopup();
        ClosePopup.closePopup(driver, 3);

        // Tim -> Click button Dang Nhap
        WebElement button_login = driver.findElement(By.className("btn-login"));
        button_login.click();

        // Gọi hàm chờ 1s
        Common.waitForSeconds(1);
    }

    public void test_UI_DangNhap() {
        test_UI_label_1();
        test_UI_label_2();
        test_UI_placeholder_1();
        test_UI_placeholder_2();
        test_UI_text_button();
    }

    public void test_UI_label_1() {
        // Tìm phần tử chứa label mong muốn
        WebElement label1 = driver.findElement(By.className("title-signup"));

        // Lấy giá trị của label thực tế
        String actualLabel1 = label1.getText();

        // Giá trị mong muốn (label mong muốn)
        String expectedLabel1 = "Đăng nhập vào tài khoản của bạn"; // Thay bằng giá trị mong muốn

        // So sánh giữa giá trị mong muốn và giá trị thực tế
        if (actualLabel1.equals(expectedLabel1)) {
            System.out.println("Test Passed: Label 1 is correct.");
        } else {
            System.out.println("Test Failed: Label 1 is incorrect.");
            System.out.println("Expected: " + expectedLabel1);
            System.out.println("Actual: " + actualLabel1);
        }
    }

    public void test_UI_label_2() {
        // Tìm phần tử chứa label mong muốn
        WebElement label2 = driver.findElement(By.className("sub-title-signup"));

        // Lấy giá trị của label thực tế
        String actualLabel2 = label2.getText();

        // Giá trị mong muốn
        String expectedLabel2 = "Học tập và giao lưu với hàng triệu học viên trên\nmọi miền đất nước.";

        // So sánh giữa giá trị mong muốn và giá trị thực tế
        if (actualLabel2.equals(expectedLabel2)) {
            System.out.println("Test Passed: Label 2 is correct");
        } else {
            System.out.println("Test failed: Label 2 is incorrect");
            System.out.println("Expect:" + expectedLabel2);
            System.out.println("Actual:" + actualLabel2);
        }
    }

    public void test_UI_placeholder_1() {
        // Tìm phần tử chứa placeholder mong muốn
        WebElement placeholder1 = driver.findElement(By.id("username"));

        // Lấy giá trị của placeholder thực tế
        String actualPlaceholder1 = placeholder1.getAttribute("placeholder");

        // Giá trị mong muốn
        String expectedPlaceholder1 = "Tên TK/Email";

        // So sánh giữa giá trị mong muốn và giá trị thực tế
        if (actualPlaceholder1.equals(expectedPlaceholder1)) {
            System.out.println("Test Passed: Placeholder 1 is correct");
        } else {
            System.out.println("Tess failed: Placeholder 1 is incorrect");
            System.out.println("Expect:" + expectedPlaceholder1);
            System.out.println("Actual:" + actualPlaceholder1);
        }
    }

    public void test_UI_placeholder_2() {
        // Tìm phần tử chứa placeholder mong muốn
        WebElement placeholder2 = driver.findElement(By.id("password"));

        // Lấy giá trị của placeholder thực tế
        String actualPlaceholder2 = placeholder2.getAttribute("placeholder");

        // Giá trị mong muốn
        String expectedPlaceholder2 = "Mật khẩu";

        // So sánh giữa giá trị mong muốn và giá trị thực tế
        if (actualPlaceholder2.equals(expectedPlaceholder2)) {
            System.out.println("Test Passed: Placeholder 2 is correct");
        } else {
            System.out.println("Test failed: Placeholder 2 is correct");
            System.out.println("Expect:" + expectedPlaceholder2);
            System.out.println("Actual:" + actualPlaceholder2);
        }
    }

    public void test_UI_text_button() {
        // Tìm phần tử chửa button Đăng Nhập mong muốn
        WebElement textButton = driver.findElement(By.className("register-btn"));

        // Lấy giá trị thực tế của button Đăng nhập
        String actualTextbutton = textButton.getAttribute("value");

        // Giá trị mong muốn
        String expectTextbutton = "Đăng nhập";

        // So sánh kết quả thực tế và kết quả mong đợi
        if (actualTextbutton.equals(expectTextbutton)) {
            System.out.println("Test Passed: Text button is correct");
        } else {
            System.out.println("Test failed: Text button is incorrect");
            System.out.println("Expect:" + expectTextbutton);
            System.out.println("Actual:" + actualTextbutton);
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