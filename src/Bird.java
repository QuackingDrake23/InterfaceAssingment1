import javax.print.DocFlavor;
import java.util.Random;

public class Bird implements Animal{
    @Override
    public String move(){
        return "I am fly!!!";
    }
 @Override
    public String makeSound(){
        return "Chirp!!!!!!1";
 }
}
