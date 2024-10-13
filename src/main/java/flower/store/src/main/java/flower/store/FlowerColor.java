package flower.store;

import lombok.Getter;

@Getter
public enum FlowerColor {

    RED("#FF0000"), WHITE("#FFFFFF"), YELLOW("#FFFF00");

    String code;

    FlowerColor(String code) {
        this.code = code;
    }
}
