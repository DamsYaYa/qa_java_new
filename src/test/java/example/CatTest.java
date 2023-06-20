package example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

///cat test

public class CatTest extends BaseTest {

    @Test
    public void getSoundReturnsCorrectValue() {

        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";

        String actualSound = cat.getSound();

        Assert.assertEquals(expectedSound, actualSound);
    }

    @Mock Predator predator;

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {

        Cat cat = new Cat(new Feline());
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = cat.getFood();

        Assert.assertEquals(expectedFood, actualFood);
    }

}
