package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {

    private List<Warehouse> warehouseList;

    public WarehouseServiceImplArraylist(){
        warehouseList=new ArrayList<>();
    }

    public List<Warehouse> getAllWarehouses(){
        return warehouseList;
    }

    public int addWarehouse(Warehouse warehouse){
        warehouseList.add(warehouse);
        return warehouseList.size();

    }

    public List<Warehouse> getWarehousesSortedByCapacity(){

        
        Collections.sort(warehouseList,new Comparator<Warehouse>() {
            public int compare(Warehouse w1,Warehouse w2){
                return Integer.compare(w1.getCapacity(), w2.getCapacity());
            }
        });

        return  warehouseList;
    }
   
    

}