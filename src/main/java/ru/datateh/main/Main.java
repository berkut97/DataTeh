package ru.datateh.main;

import java.sql.*;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?autoReconnect=true&useSSL=false";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Driver driver;
        Statement statement;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        }catch (SQLException ex) {
            System.out.println("Ошибка при создании/регистрации драйвера");
            return;
        }

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection != null){
                System.out.println("ok");
            }
            statement = connection.createStatement();
            statement.execute("insert into datateh.person (FirstName, SecondName, Patronymic, DateOfBirth, Wpost, Post) values (\"Тимур\", \"Богданов\", \"Рустемович\", \"03.04.1997\", \"Ассистент системного архитектора\", \"Инженер-тестировщик\")");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        finally {
            connection.close();
        }
    }
}
