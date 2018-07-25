package com.peter.study.springmvc.app04b.service;

import com.peter.study.springmvc.app04b.domain.Product;

/**
 * desc    : 服务类接口
 * author  : tanpinghua
 * email   : tan.pinghua@ucsmy.com
 * time    : 2018/7/25
 * version : V1.0
 */
public interface ProductService {
    Product add(Product product);
    Product get(Long id);
}
