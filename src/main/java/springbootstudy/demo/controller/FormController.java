package springbootstudy.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@RestController
public class FormController {

    @GetMapping("/upload")
    public String uploadForm(){
        return "upload.html";
    }

    @PostMapping("/upload")
    public String uploadSubmit(
            @RequestPart("headImg") MultipartFile headImg,
            @RequestPart("photos") MultipartFile[] photos
    ) {

        log.info("==== 上传的信息： 头像的大小{}, 照片有{}张", headImg.getSize(), photos.length);
        return "上传成功";
    }

}
