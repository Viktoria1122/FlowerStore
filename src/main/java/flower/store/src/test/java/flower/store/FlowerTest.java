package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testRandomPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals(color.toString(), flower.getColor());
    }

    @Test
    public void testPrice() {
    double expectedPrice = 10.0;
    flower.setPrice(expectedPrice);
    Assertions.assertEquals(expectedPrice, flower.getPrice());
    }

    @Test
    public void testFlowerType() {
    FlowerType expectedType = FlowerType.ROSE;
    flower.setFlowerType(expectedType);
    Assertions.assertEquals(expectedType, flower.getFlowerType());
    }

    @Test
    public void testInvalidPrice() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        flower.setPrice(-5.0);});
    }

    @Test
    public void testInvalidQuantity() {
    FlowerPack pack = new FlowerPack(flower, -1);
    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        pack.setQuantity(-1);});
    }
}
