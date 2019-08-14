
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {

    public final static Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.logFoo();

        Foo localFoo = new Foo() {
            @Override
            public void logFoo() {
                LOG.log(Level.INFO, this.getClass().toString());
            }
        };
        localFoo.logFoo();
    }
}
