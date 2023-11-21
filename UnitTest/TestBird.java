import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class TestBird {
    Bird b;
    @BeforeEach
    public void before(){
        b = new Bird();
    }
    @Test
    public void testMakeSound(){
        assertTrue(b.makeSound().equals("Chirp!!!!!!1"));
    }
    @Test
    public  void testMove(){
        assertTrue(b.move().equals("I am fly!!!"));
    }
}
