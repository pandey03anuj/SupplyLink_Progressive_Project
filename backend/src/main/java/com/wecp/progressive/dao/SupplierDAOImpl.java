package com.wecp.progressive.dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Supplier;

public class SupplierDAOImpl implements SupplierDAO {
        

    public int addSupplier(Supplier supplier){
        return -1;
        
    }

    public Supplier getSupplierById(int supplierId){
        return null;
    }

    public void updateSupplier(Supplier supplier){

    }

    public void deleteSupplier(int supplierId){

    }

    public List<Supplier> getAllSuppliers(){
        return new ArrayList<>();
    }

}
