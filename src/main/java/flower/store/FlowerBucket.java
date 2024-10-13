package flower.store;
import java.util.ArrayList;
import java.util.List;
    
public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public void add(FlowerPack flowerPack) {
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

