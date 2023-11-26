package com.practice.jpapractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @Embedded
    private Address address;

    public Team(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
