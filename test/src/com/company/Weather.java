package com.company;

public enum Weather {
    FROST ("Fur coat, boots, hat, thermal underwear"), COLD ("Jacket, boots, hat"),
    WARM ("Sweatshirt, jeans, sneakers"), HOT ("T-shirt, shorts, cap, flip flops"),
    MIX ("The weather is changeable!");

    private  String clothes;
    Weather (String clothes) {
        this.clothes = clothes;
    }
    public String getClothes () {
        return clothes;
    }
    public String toString () {
        return clothes;
    }

}
