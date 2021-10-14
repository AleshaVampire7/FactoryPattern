package com.company.Factory;

import com.company.Product.IProductA;
import com.company.Product.IProductB;
import com.company.Product.ProductA.Cows;
import com.company.Product.ProductB.FarmForCows;

public class CowFarmFactory implements IFactory{
    @Override
    public String createDweller() {
        IProductB productB=new Cows();
        return "Dweller does:"+productB.whatdoesdweller();
    }

    @Override
    public String createFarm() {
        IProductA iProductA=new FarmForCows();
        return "Size:"+iProductA.getSize()+"\nIt does:"+iProductA.getDoes();
    }
}
