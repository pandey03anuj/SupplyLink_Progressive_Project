package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplArraylist implements WarehouseService {

    ArrayList<Warehouse> warehouses=new ArrayList<>();

    public List<Warehouse> getAllWarehouses(){
        return null;
    }

    public int addWarehouse(Warehouse warehouse){
        // return warehouses.add(warehouse) ? 1: 0 ;
        return 1;
    }

    public List<Warehouse> getWarehousesSortedByCapacity(){

        return null;
        // Collections.sort(warehouses,new Comparator<Warehouse>() {
        //     public int compare(Warehouse w1,Warehouse w2){
        //         return Integer.compare(w1.getCapacity(), w2.getCapacity());
        //     }
        // });

        // return  warehouses;
    }
   
    

}