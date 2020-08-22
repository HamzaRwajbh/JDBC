package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    Connection connection = Connectivity.getConnection();

    public void create(User user) {
        try {
            final PreparedStatement state = connection.prepareStatement("insert into users values (?,?,?)");
            state.setInt(1, user.getId());
            state.setString(2, user.getUsername());
            state.setString(3, user.getPassword());
            state.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public void update(User user) {

    }

    public void deleteById(final Integer id) {

    }

    public List<User> list() {
        List<User> users = new ArrayList<>();
        final Statement statement;
        try {
            statement = connection.createStatement();
            final ResultSet result = statement.executeQuery("SELECT * FROM users");
            while (result.next()) {
                final int id = result.getInt("id");
                final String username = result.getString("username");
                final String password = result.getString("password");
                users.add(new User(id, username, password));
            }
            return users;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public User findUserById(final int id) {
        return null;
    }
}
