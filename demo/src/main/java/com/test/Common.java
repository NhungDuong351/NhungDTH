package com.test;

public class Common {
// Hàm chờ theo số giây được truyền vào
public static void waitForSeconds(int seconds) {
    try {
        Thread.sleep(seconds * 2000);  // Đơn vị mili giây
    } catch (InterruptedException e) {
        e.printStackTrace();  // In ra lỗi nếu có
    }
}
}