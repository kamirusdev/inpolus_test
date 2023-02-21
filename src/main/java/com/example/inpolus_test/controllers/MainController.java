package com.example.inpolus_test.controllers;

import com.example.inpolus_test.services.TextHandler;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class MainController {

    @PostMapping("count")
    public String count(@RequestParam String str, @RequestBody String text) {

        int count = TextHandler.countMatches(text, str);
        return "Количество вхождений: " + count;
    }

}
