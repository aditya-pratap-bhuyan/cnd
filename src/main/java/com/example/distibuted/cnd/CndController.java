package com.example.distibuted.cnd;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController("/cnd")
public class CndController {

    @Value("${request.count}")
    public int restCount;

    @GetMapping
    public String get(){
        ++restCount;
        return "Hello CND Get:"+restCount;
    }

    @PostMapping
    public String set(){
        ++restCount;
        return "Hello CND Post:"+restCount;
    }

    @PutMapping
    public String put(){
        ++restCount;
        return "Hello CND PUT:"+restCount;
    }

    @DeleteMapping
    public String delete(){
        ++restCount;
        return "Hello CND Delete:"+restCount;
    }

    public int getRestCount(){
        return restCount;
    }
}
