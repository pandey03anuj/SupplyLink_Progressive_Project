package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;
import com.wecp.progressive.service.impl.SupplierServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    private SupplierServiceImplArraylist supplierServiceImplArraylist;

    @Autowired
    private SupplierServiceImplJpa supplierServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() {    
        return null;  
    }

    @GetMapping("/{supplierID}")
    public ResponseEntity<Supplier> getSupplierById(int supplierId) {
        return null;
    }

    @PostMapping
    public ResponseEntity<Integer> addSupplier(Supplier supplier) {
        return null;
    }

    @PutMapping("/{supplierID}")
    public ResponseEntity<Void> updateSupplier(Supplier supplier) {
        return null;
    }

    @DeleteMapping("/{supplierID}")
    public ResponseEntity<Void> deleteSupplier(int supplierId) {
        return null;
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Supplier>> getAllSuppliersFromArrayList() {

        List<Supplier> suppliers=supplierServiceImplArraylist.getAllSuppliers();
        return new ResponseEntity<>(suppliers,HttpStatus.OK);
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addSupplierToArrayList(Supplier supplier) {
        int listSize=supplierServiceImplArraylist.addSupplier(supplier);
        return new ResponseEntity<>(listSize,HttpStatus.CREATED);        
    }

    @GetMapping("/fromArrayList/all")
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
        List<Supplier> suppliers=supplierServiceImplArraylist.getAllSuppliersSortedByName();
        return new ResponseEntity<>(suppliers,HttpStatus.OK);
    }
}