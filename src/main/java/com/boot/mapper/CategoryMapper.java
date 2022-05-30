package com.boot.mapper;

import java.util.List;

import com.boot.pojo.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

 
    List<Category> findAll();


}