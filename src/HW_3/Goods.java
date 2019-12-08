package HW_3;

import java.util.Arrays;

public class Goods {
    private int idGoods = 0;
    private static int i = 1;
    private float lenght;
    private float widht;
    private float height;
    private float weight;
    private boolean fragile;


    public Goods(float lenght, float widht, float height, float weight, boolean fragile) {
        this.lenght = lenght;
        this.widht = widht;
        this.height = height;
        this.weight = weight;
        this.fragile = fragile;
        this.idGoods += i;
        i++;
    }

    public static void main(String[] args) {
        Goods goods1 = new Goods(1, 1, 1,1, true);
        Goods goods2 = new Goods(1, 1, 1,1, true);
        System.out.println(goods1.idGoods);
        System.out.println(goods2.idGoods);
    }

    public int getIdGoods() {
        return idGoods;
    }
}
