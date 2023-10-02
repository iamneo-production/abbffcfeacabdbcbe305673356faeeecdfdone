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
        if(laptops == null){
            laptops = new ArrayList<>();
        }
        laptops.add(laptop);
        return true;
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptopById(@PathVariable int laptopId){
        return laptops.stream().filter(laptop -> laptop.getLaptopid() == laptopId).findFirst().orElse(null);

    }

    @GetMapping
    public List<Laptop> getAllLaptops(){
        return laptops;
    }

}