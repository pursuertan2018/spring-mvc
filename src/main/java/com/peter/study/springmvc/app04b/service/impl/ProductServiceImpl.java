package com.peter.study.springmvc.app04b.service.impl;

import com.peter.study.springmvc.app04b.domain.Product;
import com.peter.study.springmvc.app04b.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * desc    : 服务类
 * author  : tanpinghua
 * email   : tan.pinghua@ucsmy.com
 * time    : 2018/7/25
 * version : V1.0
 */
@Service
public class ProductServiceImpl implements ProductService{

    Map<Long,Product> mapProducts = new HashMap<Long,Product>();
    AtomicLong generator = new AtomicLong();

    public ProductServiceImpl(){
        Product product = new Product();
        product.setPrice(129.99F);
        product.setName("chinese rice");
        product.setDescription("nice rice");
        add(product);
    }

    public Product add(Product product) {
        long newId  = generator.incrementAndGet();
        product.setId(newId);
        mapProducts.put(newId,product);
        return product;
    }

    public Product get(Long id) {
        return mapProducts.get(id);
    }
}
