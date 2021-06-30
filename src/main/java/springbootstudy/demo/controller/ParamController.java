package springbootstudy.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParamController {

    // /car/3/owner/cc?age=18&inters=swimming&inters=run
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader Map<String, String> header,

                                      @RequestParam("age") Integer age,
                                      @RequestParam("inters") List<String> inters){
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name",name);
        map.put("pv", pv);
        //map.put("header", header);

        map.put("age", age);
        map.put("inters", inters);
        return map;

    }

    @PostMapping("/car/save")
    public Map postCar(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }
}
