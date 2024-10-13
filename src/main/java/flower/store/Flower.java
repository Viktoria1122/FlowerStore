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

    public Flower(double sepalLengthh, String colorr, double pricee) {
        //TODO Auto-generated constructor stub
    }

    public Flower() {
        //TODO Auto-generated constructor stub
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException();
        }
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }
}
