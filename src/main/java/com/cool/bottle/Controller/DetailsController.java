package com.cool.bottle.Controller;

import com.cool.bottle.Model.Details;
import com.cool.bottle.Service.DetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetailsController {
//    @Autowired
//    private DetailsRepository detailsRepository;
    @Autowired
    private DetailsService detailsService;

    @PostMapping("/addDetails")
    public ResponseEntity addDetails(@RequestBody Details details){
        detailsService.addDetails(details);
        //detailsRepository.save(details);
       return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/getName/{id}")
    public Details getName(@PathVariable Integer id){
        return detailsService.getName(id);

    }

}
