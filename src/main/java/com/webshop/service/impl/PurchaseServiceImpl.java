package com.webshop.service.impl;

import com.webshop.dao.PurchaseDao;
import com.webshop.model.Purchase;
import com.webshop.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("purchaseService")
@Transactional
public class PurchaseServiceImpl implements PurchaseService
{
    @Autowired
    private PurchaseDao purchaseDao;

    @Override
    public void savePurchase(Purchase purchase)
    {
        purchaseDao.savePurchase(purchase);
    }
}
