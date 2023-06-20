package example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

///Feline test
public class FelineTest {
    @Test
    public void eatMeatReturnsCorrectValue() throws Exception {

        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        List<String> actualFood = feline.eatMeat();

        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {

        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        String actualFamily = feline.getFamily();

        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnsCorrectMethod() {

        Feline feline = new Feline();
        int expectedCount = 1;

        int actualCount = feline.getKittens();

        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void getKittensReturnsCorrectValue() {

        Feline feline = new Feline();
        int expectedCount = 2;

        int actualCount = feline.getKittens(expectedCount);

        Assert.assertEquals(expectedCount, actualCount);
    }
}
