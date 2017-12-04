package com.monetware.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.monetware.demo.xml.*;

@RestController
@RequestMapping("/create")
public class CreationController {

    @GetMapping("/xml")
    public String GenerateXML(@RequestParam(value = "name", defaultValue = "test") String name){
        String response = "success";
        try{
            CreateXML xml = new CreateXML();
            response = xml.CreateFile(name);

        }catch (Exception e){
            response = "No such a file!";
        }
        return response;
    }

    @GetMapping("/prep")
    public String GeneratePREP(@RequestParam(value = "name", defaultValue = "test")String name){
        return "Success!";
    }
}
