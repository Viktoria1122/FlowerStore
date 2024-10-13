package flower.store;
import java.util.ArrayList;
import java.util.List;
    
public class FlowerBucket {
    // private List<FlowerPack> flowerPacks;

    // public FlowerBucket(List<FlowerPack> flowerPacks) {
    //     this.flowerPacks = flowerPacks;
    // }

    // public FlowerBucket() {
    //     //TODO Auto-generated constructor stub
    // }
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    // Метод для додавання FlowerPack до букету
    public void add(FlowerPack flowerPack) {
        // Додаємо FlowerPack до списку
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double total = 0;
        for (FlowerPack pack : flowerPacks) {
            total += pack.getPrice();
        }
        return total;
    }
}

