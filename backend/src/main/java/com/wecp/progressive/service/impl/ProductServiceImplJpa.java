package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJpa implements ProductService  {

    private ProductDAO productDAO;

    public ProductServiceImplJpa (ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
   
    @Override
    public List<Product> getAllProducts() {        
        return List.of();
    }

    @Override
    public Product getProductById(int productId) {        
        return null;
    }

    @Override
    public int addProduct(Product product) {        
        return -1;
    }

    @Override
    public void updateProduct(Product product) {        
    }

    @Override
    public void deleteProduct(int productId) {        
    }

}