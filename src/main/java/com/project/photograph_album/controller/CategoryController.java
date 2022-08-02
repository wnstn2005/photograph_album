package com.project.photograph_album.controller;

import com.project.photograph_album.dto.CategoryDto;
import com.project.photograph_album.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @RequestMapping("/categoryAll")
    public List<CategoryDto> findCategoryList() {
        return categoryService.selectCategoryList();
    }



    Integer cateKey = 2;

    @RequestMapping("/categoryDetail")
    public CategoryDto findCategoryDetail() {
        return categoryService.selectCategoryDetail(cateKey);
    }



    @RequestMapping("/categoryInsert")
    public void registerCategory() {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setCateName("테스트");
        categoryDto.setUserId("테스트");
        categoryService.insertCategoryDetail(categoryDto);
    }

}
