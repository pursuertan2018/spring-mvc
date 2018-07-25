package com.peter.study.springmvc.app04a.controller;

import com.peter.study.springmvc.app04a.domain.Product;
import com.peter.study.springmvc.app04a.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * desc    : ProductController
 * author  : tanpinghua
 * email   : tan.pinghua@ucsmy.com
 * time    : 2018/7/24
 * version : V1.0
 */
@Controller
public class ProductController {

    private static final Log logger = LogFactory
            .getLog(ProductController.class);

    @RequestMapping(value = "/product_input")
    public String product_input(){
        //return new ModelAndView("ProductForm");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save")
    public String product_save(ProductForm productForm, Model model){
        logger.info("product_save called.");
        Product product = new Product();
        product.setDescription(productForm.getDescription());
        product.setName(productForm.getName());

        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        model.addAttribute("product",product);
        return "ProductDetails";
    }


}
