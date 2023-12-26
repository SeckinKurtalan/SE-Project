package com.sadproject.demo.dto;

import lombok.Data;

@Data
public class EventDTO {

    private String name;
    private String location;
    private String date;
    private Double price;
    private String address;
    private String imageLink;
    private DetailsDTO details;



}
