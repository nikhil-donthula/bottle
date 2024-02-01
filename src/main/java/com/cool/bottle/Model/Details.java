package com.cool.bottle.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Document
public class Details {
    @Id
    private Integer uniqueId;
    private String firstName;
    private String lastName;
    private String country;

    public Integer getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
