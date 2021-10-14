package com.company.Factory;

import com.company.Product.IProductA;
import com.company.Product.IProductB;
import com.company.Product.ProductA.Cows;
import com.company.Product.ProductA.Plants;
import com.company.Product.ProductB.FarmForCows;
import com.company.Product.ProductB.FarmForPlants;

public class PlantsFarmFactory implements  IFactory{
    @Override
    public String createDweller() {
        IProductB productB=new Plants();
        return "Dweller does:"+productB.whatdoesdweller();
    }

    @Override
    public String createFarm() {
        IProductA iProductA=new FarmForPlants();
        return "Size:"+iProductA.getSize()+"\nIt does:"+iProductA.getDoes();
    }
}
