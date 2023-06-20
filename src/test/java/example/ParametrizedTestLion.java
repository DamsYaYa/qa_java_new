package example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

///parametrized Lion test

@RunWith(Parameterized.class)

public class ParametrizedTestLion {
    private final String sex;
    @Mock
    Feline feline;
    private final boolean expectedHasMane;

    public ParametrizedTestLion(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters(name = "Пол: {0}; Есть грива: {1}")
    public static Object[] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception {
        Lion lion = new Lion(feline, sex);

        boolean actualHasMane = lion.doesHaveMane();

        Assert.assertEquals(expectedHasMane, actualHasMane);
    }
}
