import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class DogTest {
    Dog d;
 @BeforeEach
 public void before(){
     d = new Dog();
 }
    @Test
    public void testMakeSound(){
        assertTrue(d.makeSound().equals("I bark!!!!"));
    }
    @Test
    public  void testMove(){
        assertTrue(d.move().equals("I'm run"));
    }
    @Test
    public void testMisbehave(){
     assertTrue(d.misbehave("home work").equals("I chewed your home work"));
    }
}
