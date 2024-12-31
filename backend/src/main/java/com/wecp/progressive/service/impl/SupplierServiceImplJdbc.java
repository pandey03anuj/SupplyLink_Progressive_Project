package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierService {

    private SupplierDAO supplierDAO;
    
    public SupplierServiceImplJdbc(SupplierDAO supplierDAO){
        this.supplierDAO=supplierDAO;
    }

    public List<Supplier> getAllSuppliers(){
        // return supplierDAO.getAllSuppliers();
        return null;
    }

    public int addSupplier(Supplier supplier){
        // return supplierDAO.addSupplier(supplier);
        return 1;
    }

    public List<Supplier> getAllSuppliersSortedByName(){
        // return supplierDAO.getAllSuppliers();
        return null;
    }
    

}