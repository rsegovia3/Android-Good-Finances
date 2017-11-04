package com.ricardo_segovia.goodfinances.dao;

import android.content.Context;

import com.ricardo_segovia.goodfinances.data.CategoryDataSource;
import com.ricardo_segovia.goodfinances.entities.Category;

public class CategoryDao {

    CategoryDataSource dataSource;

    public CategoryDao(Context context){
        dataSource = new CategoryDataSource(context);
    }

    public long guardar(Category entity){
        return 0L;
    }

}