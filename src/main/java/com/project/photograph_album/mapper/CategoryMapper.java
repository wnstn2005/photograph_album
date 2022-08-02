package com.project.photograph_album.mapper;

import com.project.photograph_album.dto.CategoryDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<CategoryDto> selectCategoryList();

    CategoryDto selectCategoryDetail(Integer catekey);

    void insertCategoryDetail(CategoryDto categoryDto);

}
