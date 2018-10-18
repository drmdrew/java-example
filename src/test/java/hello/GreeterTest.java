package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class GreeterTest {
    @Test
    public void testSayHello() {
        Greeter greeter = new Greeter();
        String message = greeter.sayHello();
        assertThat(message, is(equalTo("Hello world!")));
    }
}
