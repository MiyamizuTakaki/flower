package org.example;

import java.math.BigDecimal;
import java.util.List;

public class flower {
    public static void main(String[] args) {
        flowerinfo myfloer = new flowerinfo();

        var flowers = myfloer.getFlowerClass();
        flowers.money = BigDecimal.valueOf(5);
        flowers.name = "first";
        flowers.weight = 50;
        myfloer.setFlowerClass(flowers);

        flowers = myfloer.getFlowerClass();
        flowers.money = BigDecimal.valueOf(10.5);
        flowers.name = "fir";
        flowers.weight = 10;
        myfloer.setFlowerClass(flowers);

        flowers = myfloer.getFlowerClass();
        flowers.money = BigDecimal.valueOf(3);
        flowers.name = "sec";
        flowers.weight = 25;
        myfloer.setFlowerClass(flowers);


        System.out.println("最便宜的花朵");
        System.out.println(myfloer.returnFlowers(false)+"\n"+myfloer.returnFlowers(false).toMoney());
        System.out.println("最贵的花朵");
        System.out.println(myfloer.returnFlowers(true)+"\n"+myfloer.returnFlowers(true).toMoney());
        System.out.println(myfloer);

    }
}