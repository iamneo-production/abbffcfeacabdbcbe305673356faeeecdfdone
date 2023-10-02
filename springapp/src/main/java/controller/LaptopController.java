package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController{
    private List<Laptop> laptops = new ArrayList<>();

    @PostMapping
    public boolean addLaptop(@RequestBody Laptop laptop){
        
    }
}