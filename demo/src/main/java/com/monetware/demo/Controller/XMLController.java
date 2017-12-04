package com.monetware.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.monetware.demo.CreateXML.*;

@RestController
@RequestMapping("/create")
public class XMLController {

    @GetMapping("/xml")
    public String GenerateXML(@RequestParam(value = "name", defaultValue = "test") String name){
        try{
            CreateXML xml = new CreateXML();
            xml.CreateFile(name);

        }catch (Exception e){
            return "Create Error!";
        }
        return "Success!";
    }
}
