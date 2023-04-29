package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

 class  flowers {
    String name;
    float weight;
    BigDecimal money;
    @Override
    public String toString()
    {
        return name;
    }
    public  String toMoney()
    {
        return money.toString();
    }
}
public interface interflower {
    public static List<flowers> flowersList = new ArrayList<>();
     public List<flowers> getList();
     public  flowers getFlowerClass();

     flowers returnFlowers(boolean sets);

    void setFlowerClass(flowers flower);
}

