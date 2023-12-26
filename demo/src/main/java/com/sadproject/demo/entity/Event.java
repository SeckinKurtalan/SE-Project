package com.sadproject.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Event {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "VARCHAR(255)")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "date")
    private String date;

    @Column(name = "price")
    private Double price;

    @Column(name = "address")
    private String address;

    @Column(name = "image_link")
    private String imageLink;

    @JoinColumn(name = "product_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Details details;





}
