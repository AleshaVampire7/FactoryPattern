package com.company;

import com.company.Factory.CowFarmFactory;
import com.company.Factory.IFactory;
import com.company.Factory.PlantsFarmFactory;

public class Main {

    public static void main(String[] args) {
        IFactory cowFarm=new PlantsFarmFactory();
        System.out.println(cowFarm.createFarm());
        System.out.println(cowFarm.createDweller());
    }
}
