package com.company;

import java.sql.*;

public class Main {

    // 1. import driver search key ( JDBC DATABASE_NAME diver maven) - done
    // 2. register driver by name - Done
    // 3. connect to database by (url, username, password) - Done
    // 4. create statement
    // 5. execute sql command

    public static void main(String[] args) {
        UserRepo repo = new UserRepo();
        System.out.println(repo.list());
        Connectivity.close();
    }
}
