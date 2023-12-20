package com.example.capstone3.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(20) not null")
    private String name;
    @Column(columnDefinition = "varchar(20) not null")
    private String idea;
    @Column(columnDefinition = "double") //////////////
    private double grade=0.0;

    @OneToOne
    @MapsId
    @JsonIgnore
    private Team team;

    @ManyToOne
    @JoinColumn(name = "committee_id",referencedColumnName = "id")
    @JsonIgnore
    private Committee committee;

}
