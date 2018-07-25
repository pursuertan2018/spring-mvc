package com.peter.study.springmvc.app04b.domain;

import java.io.Serializable;

/**
 * desc    :
 * author  : tanpinghua
 * email   : tan.pinghua@ucsmy.com
 * time    : 2018/7/24
 * version : V1.0
 */
public class Product implements Serializable {
    private static final long serialVersionUID = 1231313231L;
    private String name;
    private String description;
    private float price;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
