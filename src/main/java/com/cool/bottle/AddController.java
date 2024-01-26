package com.cool.bottle;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    
    @PostMapping("/add")
    public int addNumbers(@RequestBody Numbers numbers) {
        return numbers.getNum1() + numbers.getNum2();
    }
    // JSON INPUT
    /* 
    {
        "num1": 10,
        "num2": 20
    } 
     */
}
