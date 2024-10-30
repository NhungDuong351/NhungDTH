package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DangNhap {
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

    public void dangNhap(){

        //Tìm -> Nhập vào textbox username
        WebElement username_texbox = driver.findElement(By.id("username"));
        username_texbox.sendKeys(Variables.username_login);

        //Gọi hàm chờ 2s
        Common.waitForSeconds(2);

        //Tìm -> Nhập vào textbox password
        WebElement password_texbox = driver.findElement(By.id("password"));
        password_texbox.sendKeys(Variables.password_login);

        //Gọi hàm chờ 2s
        Common.waitForSeconds(2);

        //Tim -> Click vào button Dang Nhap 2
        WebElement button_login2 = driver.findElement(By.className("register-btn"));
        button_login2.click();

        //Tạo đối tượng -> Gọi hàm ClosePopup
        ClosePopup closePopup = new ClosePopup();
        closePopup.closePopup(driver, 3);
    }

    public void quit() {
        // Đóng trình duyệt
        driver.quit();
    }

    public static void main(String[] args) {
        DangNhap dangNhap = new DangNhap();
        dangNhap.setUp();
        dangNhap.redirect_to_DangNhap();
        dangNhap.dangNhap();
        dangNhap.quit();
    }
    
}


