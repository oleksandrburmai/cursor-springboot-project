package com.cursor.mainproject.domain.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CARS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "MARK")
    private String mark;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "PRICE")
    private Double price;
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "COUNTRY_OF_REGISTRATION")
    private String countryOfRegistration;
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User userId;

}
