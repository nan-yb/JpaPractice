package com.practice.jpapractice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member {
    @Id
    @Column(name="MEMBER_ID")
    private String id;

    private String username;

    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;

    public Member(String id, String username) {
        this.id = id;
        this.username = username;
    }
}
