package com.sadproject.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Details {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "VARCHAR(255)")
    private String id;

    @Column
    private String description;

    @Column(name = "artists")
    private String artists;

    @Column
    private String genre;

    @Column
    private String Type;

    @Column(name = "ticket_info")
    private Boolean ticketInfo;
}
