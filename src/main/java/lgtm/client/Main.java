package lgtm.client;

import java.sql.SQLException;

public class Main {

    @SuppressWarnings("java:S2440")
    public static void main(String[] args) throws SQLException {
        MyQueryRunner connection = new MyQueryRunner();
        String firstColValue = args[0];
        int secColValue = Integer.parseInt(args[1]);
        connection.runQuery(firstColValue, secColValue);
    }
}
