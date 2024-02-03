package com.cool.bottle.Repository;

import com.cool.bottle.Model.Details;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DetailsRepository extends MongoRepository<Details,Integer> {

}
