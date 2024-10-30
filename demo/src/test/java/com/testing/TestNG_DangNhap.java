package com.testing;

import com.test.DangNhap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_DangNhap {
    private DangNhap dangNhap;

    // Thiết lập trước khi chạy test
    @BeforeTest
    public void setUp() {
        dangNhap = new DangNhap();
        dangNhap.setUp();
    }

    // Kiểm thử việc chuyển hướng đến màn hình đăng nhập
    @Test(priority = 1)
    public void testRedirectToDangNhap() {
        dangNhap.redirect_to_DangNhap();
    }

    // Kiểm thử việc đăng nhập
    @Test(priority = 2)
    public void testDangNhap() {
        dangNhap.dangNhap();
    }

    // Đóng trình duyệt sau khi chạy test
    @AfterTest
    public void tearDown() {
        dangNhap.quit();
    }
}
