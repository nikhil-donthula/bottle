package com.cool.bottle.Controller;

import com.cool.bottle.Model.Numbers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController {

    @PostMapping("/multiply")
    public int multiplyNumbers(@RequestBody Numbers numbers) {

        return numbers.getNum1() * numbers.getNum2();
    }
    // JSON INPUT
    /*
    {
        "num1": 4,
        "num2": 26
    }
     */
}
