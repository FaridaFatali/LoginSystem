package org.example;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=Hiv3gwJC5kw">...</a>
 * @author Farida Fatali
 * Creating a simple Login System in Java
 */

public class Main {
    public static void main(String[] args) {
        IDAndPasswords idAndPasswords = new IDAndPasswords();
        LoginPage loginPage = new LoginPage(idAndPasswords.getLoginInfo());
    }
}