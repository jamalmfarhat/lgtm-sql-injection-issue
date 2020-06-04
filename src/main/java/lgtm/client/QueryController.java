package lgtm.client;

import java.sql.SQLException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xxx/ttt")
public class QueryController {

    @PutMapping(path = "/{name}/users/{userId}")
    public ResponseEntity<String> addUserToLicenseCategory(@PathVariable("name") String name,
                                                           @PathVariable("userId") int userId) throws SQLException {
        MyQueryRunner runner = new MyQueryRunner();
        runner.runQuery(name, userId);
        return ResponseEntity.ok(null);
    }
}
