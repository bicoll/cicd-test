package cn.bicoll.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: bicoll
 * @Since: 2024-03-29 9:37
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String getBook(){
        return "西游记";
    }
}
