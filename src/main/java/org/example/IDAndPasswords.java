package org.example;

import java.util.HashMap;

public class IDAndPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();

    IDAndPasswords() {
        loginInfo.put("John", "pizza");
        loginInfo.put("Selena", "PASSWORD");
        loginInfo.put("Brandon", "abc123");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
