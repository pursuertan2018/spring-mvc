package com.peter.study.springmvc.app04b.controller;

import com.peter.study.springmvc.app04b.domain.Product;
import com.peter.study.springmvc.app04b.form.ProductForm;
import com.peter.study.springmvc.app04b.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * desc    : 控制器
 * author  : tanpinghua
 * email   : tan.pinghua@ucsmy.com
 * time    : 2018/7/25
 * version : V1.0
 */
@Controller
public class ProductController {

    //Spring 自动将service实例注入到ProductController实例中
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/product_input")
    public String product_input(){
        //return new ModelAndView("ProductForm");
        return "ProductForm";
    }

    @RequestMapping(value = "/product_save")
    public String product_save(ProductForm productForm, RedirectAttributes redirectAttributes){
        Product product = new Product();
        product.setName(productForm.getName());
        product.setDescription(productForm.getDescription());

        try {
            product.setPrice(Float.parseFloat(productForm.getPrice()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Product savedProduct = productService.add(product);
        redirectAttributes.addFlashAttribute("message","this product was successfully added.");
        return "redirect:/product_view/" + savedProduct.getId();
    }

    @RequestMapping(value="/product_view/{id}")
    public String viewProduct(@PathVariable Long id,Model model){
        Product viewProduct = productService.get(id);
        model.addAttribute("product",viewProduct);
        return "ProductDetails";
    }
}
