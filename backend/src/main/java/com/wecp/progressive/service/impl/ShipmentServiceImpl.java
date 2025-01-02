package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Shipment;
import com.wecp.progressive.service.ShipmentService;

public class ShipmentServiceImpl implements ShipmentService  {


    @Override
    public List<Shipment> getAllShipments() {        
        return List.of();
    }

    @Override
    public Shipment getShipmentById(int shipmentId) {        
        return null;
    }

    @Override
    public int addShipment(Shipment shipment) {        
        return -1;
    }

    @Override
    public void updateShipment(Shipment shipment) {        
    }

    @Override
    public void deleteShipment(int shipmentId) {        
    }

}