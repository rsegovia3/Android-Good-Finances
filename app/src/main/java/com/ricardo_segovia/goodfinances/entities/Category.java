package com.ricardo_segovia.goodfinances.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Category implements Serializable {

    private long id;

    private String name;

    private String color;

    private String icon;

    private List<Category> listSubcategory;

}