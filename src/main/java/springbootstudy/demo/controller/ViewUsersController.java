package springbootstudy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ViewUsersController {

    @GetMapping("/users")
    public Map<String ,Object> ViewUser(){
        Map<String, Object> map = new HashMap<>();

//        map.put("id", id);
//        map.put("name",name);
        return map;
    }
}
