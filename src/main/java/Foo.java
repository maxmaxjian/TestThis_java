
import java.util.logging.Level;

public class Foo {

    public void logFoo() {
        Solution.LOG.log(Level.INFO, this.getClass().toString());
    }
}
