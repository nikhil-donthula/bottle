package com.cool.bottle.Controller;


import com.cool.bottle.Model.Numbers;
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
    /* http://localhost:8080/add
    {
        "num1": 10,
        "num2": 20
    } 
     */
}
