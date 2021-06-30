package springbootstudy.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    // 第一种异常处理的方式, 返回model and view
    // ArithmeticException 数学运算错误
    // NullPointerException 空指针错误
    @ExceptionHandler({ArithmeticException.class, NullPointerException.class})
    public String handleArithException(Exception e){

        log.error("异常：{}", e);

        // return 视图地址 model and view
        return "/mm/5xx.html";
    }


}
