package com.peter.study.springmvc.app03a.controller;

import com.peter.study.springmvc.app03a.domain.Product;
import com.peter.study.springmvc.app03a.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * desc    : SaveProductController
 * author  : tanpinghua
 * email   : tan.pinghua@ucsmy.com
 * time    : 2018/7/24
 * version : V1.0
 */
public class SaveProductController implements Controller {
    private static final Log logger = LogFactory
            .getLog(InputProductController.class);

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("SaveProductController called");
        ProductForm productForm = new ProductForm();
        productForm.setDescription(request.getParameter("description"));
        productForm.setName(request.getParameter("name"));
        productForm.setPrice(request.getParameter("price"));

        Product product = new Product();
        product.setDescription(productForm.getDescription());
        product.setName(productForm.getName());

        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (NumberFormatException e) {
            logger.error(e.getMessage());
        }
        return new ModelAndView("ProductDetails","product",product);
    }

}
