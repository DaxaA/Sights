package com.daxa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Sights {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long cityid;
    @Column
    private String name;
    @Column
    private String category;
    @Column
    private double coordinates;
    @Column
    private String information;
    @Column
    private double midrate;
    @Column
    private Long reviewid;
}
