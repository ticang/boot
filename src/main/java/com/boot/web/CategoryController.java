package com.boot.web;
import java.util.List;

import com.boot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.mapper.CategoryMapper;

@Controller
public class CategoryController {
    @Autowired CategoryMapper categoryMapper;
     
    @RequestMapping("/listCategory")
    public String listCategory(Model m) throws Exception {
        List<Category> cs=categoryMapper.findAll();
         
        m.addAttribute("cs", cs);
         
        return "listCategory";
    }
     
}