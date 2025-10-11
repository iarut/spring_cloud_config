package controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Value("${text.copyright}")
    String textCopyright;

    @GetMapping("/get")
    public String getText(){
        return textCopyright;
    }
}
