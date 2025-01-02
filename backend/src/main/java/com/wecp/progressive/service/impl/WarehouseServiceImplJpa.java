package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa implements WarehouseService  {


    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplJpa (WarehouseDAOImpl warehouseDAO)  {
        this.warehouseDAO = warehouseDAO;
    }

    @Override
    public List<Warehouse> getAllWarehouses() {        
        return List.of();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {        
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {        
        return List.of();
    }
    
}