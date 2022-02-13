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
public class Reviews {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private int rate;
    @Column
    private String review;
}
