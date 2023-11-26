package com.centime.service3.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @NotBlank(message = "Name is mandatory")
    @JsonProperty("Name")
    private String name;
    @NotBlank(message = "Surname is mandatory")
    @JsonProperty("Surname")
    private String surname;

    @Override
    public String toString() {
        return "{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                '}';
    }


}
