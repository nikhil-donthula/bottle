package com.cool.bottle.Service;

import com.cool.bottle.Model.Details;
import com.cool.bottle.Repository.DetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class DetailsService {
    @Autowired
    private DetailsRepository detailsRepository;

    public Details addDetails(@RequestBody Details details)
    {
        return detailsRepository.insert(details);
    }

    public Details getName(@PathVariable Integer id) {
        //if we pass an id that is not found in db then it returns null
        return detailsRepository.findById(id).orElse(null);
    }
}
