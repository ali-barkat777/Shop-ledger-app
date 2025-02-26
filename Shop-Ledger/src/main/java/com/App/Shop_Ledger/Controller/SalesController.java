package com.App.Shop_Ledger.Controller;

import com.App.Shop_Ledger.Service.SalesService;
import com.App.Shop_Ledger.model.Sales;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    SalesService salesService;

    @GetMapping
    public List<Sales> getSales(){
        return salesService.getSales();
    }
}
