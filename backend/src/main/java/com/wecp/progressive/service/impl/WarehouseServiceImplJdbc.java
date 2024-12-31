    package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJdbc implements WarehouseService {

    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplJdbc(WarehouseDAO warehouseDAO){
        this.warehouseDAO=warehouseDAO;
    }

    public List<Warehouse> getAllWarehouses(){
        return null;
    }

    public  int addWarehouse(Warehouse warehouse){
        return 1;
    }

    public List<Warehouse> getWarehousesSortedByCapacity(){
        return null;
    }

    



}