package flower.store;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    private FlowerColor color;
    @Getter
    private FlowerType flowerType;
    @Getter
    private double price;
    @Getter
    private double sepallength;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepallength = flower.sepallength;
    }

    public Flower(double sepalLength, String color, double price) {
        this.sepallength = sepalLength;
        this.color = FlowerColor.valueOf(color.toUpperCase());
        this.price = price;
    }

    public Flower() {}

    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = newPrice;
    }
    

    public String getColor() {
        return color.toString();
    }
}
