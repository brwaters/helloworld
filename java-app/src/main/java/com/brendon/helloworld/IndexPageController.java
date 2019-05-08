package com.brendon.helloworld;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexPageController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }
}