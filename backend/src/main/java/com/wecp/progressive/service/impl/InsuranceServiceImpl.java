package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Insurance;
import com.wecp.progressive.service.InsuranceService;

public class InsuranceServiceImpl implements InsuranceService  {
    
    @Override
    public List<Insurance> getAllInsurances() {        
        return List.of();
    }

    @Override
    public int addInsurance(Insurance insurance) {        
        return -1;
    }

    @Override
    public Insurance getInsuranceById(int insuranceId) {        
        return null;
    }

    @Override
    public void updateInsurance(Insurance insurance) {        
        
    }

    @Override
    public void deleteInsurance(int insuranceId) {        
    }

}