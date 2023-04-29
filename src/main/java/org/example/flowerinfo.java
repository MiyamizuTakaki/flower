package org.example;

import java.math.BigDecimal;
import java.util.*;

public class flowerinfo implements interflower{
    static int getnumber =0;
    @Override
    public List<flowers> getList(){
        List<flowers> lists = new ArrayList<flowers>();

        return new ArrayList<flowers>();
    }
    @Override
    public flowers getFlowerClass() {
        return new flowers();
    }

    @Override
    public flowers returnFlowers(boolean sets) {
        BigDecimal[] bigDecimals = new BigDecimal[flowersList.size()];
        BigDecimal search;

        for(int i=0;i<bigDecimals.length;i++)
        {
            bigDecimals[i] = flowersList.get(i).money;
        }
        Arrays.sort(bigDecimals);
        if (sets){

            search = bigDecimals[0];
        }else
        {
            search = bigDecimals[bigDecimals.length-1];
        }
        for (flowers flowerr:
             flowersList) {
            if(Objects.equals(search, flowerr.money))
                return flowerr;
        }
        return null;
    }

    @Override
    public void setFlowerClass(flowers flower) {
        getnumber++;
        flowersList.add(flower);
    }
    @Override
    public String toString()
    {
        return String.valueOf(getnumber);
    }
}
