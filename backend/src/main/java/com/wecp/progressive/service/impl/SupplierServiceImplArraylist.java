package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplArraylist implements SupplierService{

    private List<Supplier> supplierList;

    public SupplierServiceImplArraylist(){
        supplierList=new ArrayList<>();
    }

    public List<Supplier> getAllSuppliers(){
        return supplierList;
    }

    public int addSupplier(Supplier supplier){
        supplierList.add(supplier);
        return supplierList.size();
    
        
    }

    public List<Supplier> getAllSuppliersSortedByName(){

        List<Supplier> sortedSupplier=supplierList;
        Collections.sort(sortedSupplier,new Comparator<Supplier>() {
            public int compare(Supplier s1,Supplier s2){
                return s1.getSupplierName().compareTo(s2.getSupplierName());
            }
            
        });
        return sortedSupplier;
        
    }

   



    





}