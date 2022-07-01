import org.gremlin.Util.ConnectionPoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionTest {



    @Test
    public void checkIfConnectionWorks () throws SQLException {
        ConnectionPoint connectionPoint = new ConnectionPoint();
        Connection connection = connectionPoint.getConnection();

        Assertions.assertNotNull(connection);

    }
}
