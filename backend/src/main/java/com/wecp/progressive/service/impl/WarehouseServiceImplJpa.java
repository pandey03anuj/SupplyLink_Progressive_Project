package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa implements WarehouseService  {

    
    // private WarehouseDAO warehouseDAO;
    private WarehouseRepository warehouseRepository;

    public WarehouseServiceImplJpa (WarehouseRepository warehouseRepository)  {
        this.warehouseRepository = warehouseRepository;
    }

    // @Autowired
    // WarehouseRepository warehouseRepository;

    @Override
    public List<Warehouse> getAllWarehouses() throws SQLException{
        // TODO Auto-generated method stub
        return warehouseRepository.findAll();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) throws SQLException{
        // TODO Auto-generated method stub
        warehouseRepository.save(warehouse);
        return warehouse.getWarehouseId();
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() throws SQLException{
        // TODO Auto-generated method stub
        List<Warehouse> ware = warehouseRepository.findAll();
        Collections.sort(ware);
        return ware;
    }

    @Override
    public void updateWarehouse(Warehouse warehouse) throws SQLException {
        warehouseRepository.save(warehouse);
    }

    @Override
    public void deleteWarehouse(int warehouseId) throws SQLException {
        warehouseRepository.deleteById(warehouseId);
    }

    @Override
    public Warehouse getWarehouseById(int warehouseId) throws SQLException {
        return warehouseRepository.findById(warehouseId).get();
    }

    // @Override
    // public List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
    //     return warehouseRepository.findBy
    // }
    
}