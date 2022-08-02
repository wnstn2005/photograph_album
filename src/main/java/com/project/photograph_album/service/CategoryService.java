package com.project.photograph_album.service;

import com.project.photograph_album.dto.CategoryDto;
import com.project.photograph_album.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryDto> selectCategoryList() {
        return categoryMapper.selectCategoryList();
    }

    public CategoryDto selectCategoryDetail(Integer catekey) {
        return categoryMapper.selectCategoryDetail(catekey);
    }

    public void insertCategoryDetail(CategoryDto categoryDto){
        categoryMapper.insertCategoryDetail(categoryDto);
    }
}
