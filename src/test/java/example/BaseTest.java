package example;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

///Base test
public class BaseTest {
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
}
