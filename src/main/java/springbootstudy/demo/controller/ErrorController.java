package springbootstudy.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @GetMapping("/error500")
    public String Error500(){
        int err = 50/0;
        return "error500";
    }

    @GetMapping("/error409")
    public String Error409(Integer num){
        if(num > 2) {
            throw new ArithmeticException();
        }
        return "main";
    }
}
