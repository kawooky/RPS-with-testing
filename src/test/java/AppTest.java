import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

class AppTest {

    private User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void testUserSetName() {
        assertEquals("1", "1");

    }

    @Test
    void testUserSetChoice() {
        assertEquals("1", "2");
    }
}
