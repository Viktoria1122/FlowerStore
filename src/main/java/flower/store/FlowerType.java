package flower.store;

public enum FlowerType {
    CHAMOMILE, ROSE, TULIP;

    public class Rose extends Flower {
        public Rose(double sepalLength, String color, double price) {
            super(sepalLength, color, price);
        }
    }

    public class Chamomile extends Flower {
        public Chamomile(double sepalLength, String color, double price) {
            super(sepalLength, color, price);
        }
    }

    public class Tulip extends Flower {
        public Tulip(double sepalLength, String color, double price) {
            super(sepalLength, color, price);
        }
    }
}