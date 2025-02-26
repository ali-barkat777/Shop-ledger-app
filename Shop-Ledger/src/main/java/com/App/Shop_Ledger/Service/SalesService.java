package com.App.Shop_Ledger.Service;

import com.App.Shop_Ledger.Repository.SalesRepository;
import com.App.Shop_Ledger.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService {
    @Autowired
    SalesRepository salesRepository;
    public List<Sales> getSales() {
        return salesRepository.findAll();
    }
}
