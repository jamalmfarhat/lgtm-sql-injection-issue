package lgtm.client;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import lgtm.jdbc.wrapper.WrappedConnection;

public class MyQueryRunner {

    private final WrappedConnection wrappedConnection;

    MyQueryRunner() {
        wrappedConnection = new WrappedConnection(null);
    }

    public void runQuery(String firstColValue, int secColValue) throws SQLException {
        String sql = "update TABLE_X set COLUMN_X = '" + firstColValue + "' where USER = " + secColValue;
        try (PreparedStatement pStmt = wrappedConnection.prepareStatement(sql)) {
            pStmt.executeUpdate();
        }
    }
}
