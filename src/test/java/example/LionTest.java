package example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

///Lion test

public class LionTest extends BaseTest {
    @Mock
    Feline feline;
    @Test
    public void getKittensReturnsCorrectValue() throws Exception {
        Lion lion = new Lion(feline,"Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);

        int expectCount = 1;
        int actualCount = lion.getKittens();

        Assert.assertEquals(expectCount, actualCount);
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {
        Lion lion = new Lion(feline,"Самка");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        // Act
        List<String> actualFood = lion.getFood();
        // Assert
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void getExceptionOneCorrectValue() throws Exception {
        new Lion(feline,"ошибка");
    }


    @Test
    public void getExceptionTwoCorrectValue() {
        String expectedText = "Используйте допустимые значения пола животного - самей или самка";
        Exception exception = null;
        try {
            new Lion(feline,"ошибка");
        } catch (Exception ex) {
            exception = ex;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals(expectedText, exception.getMessage());
    }
}
