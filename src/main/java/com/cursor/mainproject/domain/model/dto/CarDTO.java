package com.cursor.mainproject.domain.model.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CarDTO {

    @NotNull(message = "Mark can not be NULL")
    @Size(min = 1, max = 30, message = "From 1 to 30 chars")
    private String mark;
    @NotNull(message = "Model can not be NULL")
    @Size(min = 1, max = 30, message = "From 1 to 30 chars")
    private String model;
    @NotNull(message = "Type can not be NULL")
    @Size(min = 1, max = 30, message = "From 1 to 30 chars")
    private String type;
    @NotNull(message = "Price can not be NULL")
    private Double price;
    @NotNull(message = "Year can not be NULL")
    @DecimalMin(value = "1900", message = "Year must be between 1900 and current year")
    @DecimalMax(value = "3000", message = "Year must be between 1900 and current year")
    private Integer year;
    @NotNull(message = "Country of registration can not be NULL")
    @Size(min = 1, max = 20, message = "From 1 to 20 chars")
    private String countryOfRegistration;
    @NotNull(message = "Description can not be NULL")
    @Size(min = 1, max = 255, message = "From 1 to 255 chars")
    private String description;
}
