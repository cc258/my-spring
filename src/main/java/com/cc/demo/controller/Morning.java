package com.cc.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Morning {

    @GetMapping("/morning")
    public String getMorning(){
        return "Get - mm";
    }

    @PostMapping("/morning/{id}/{name}")
    public Map<String ,Object> postMorning(
            @PathVariable("id") Integer id,
            @PathVariable("name") String name,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader Map<String,String> header
    ){
        Map<String, Object> map = new HashMap<>();

        map.put("id", id);
        map.put("name",name);
        map.put("useAgent", userAgent);
        map.put("headers", header);
        return map;
    }

    @DeleteMapping("/morning")
    public String delMorning(){
        return "Delete - mm";
    }

    @PatchMapping("/morning")
    public String patchMorning(){
        return "Patch - mm";
    }

    @PutMapping("/morning")
    public String putMorning(){
        return "Put - mm";
    }

}
