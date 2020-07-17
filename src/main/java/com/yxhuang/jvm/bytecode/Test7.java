package com.yxhuang.jvm.bytecode;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test7 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cont = DriverManager.getConnection("wwww", "username", "password");

    }
}
