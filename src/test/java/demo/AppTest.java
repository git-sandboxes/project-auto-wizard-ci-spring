package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test void addsTwoNumbers() { assertEquals(4, App.add(1, 2)); }
}
