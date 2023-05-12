package com.makuska.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Omanik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "omanik_id")
    private int id;

    private String nimi;

    @OneToMany(mappedBy = "omanik")
    private List<Lemmikloom> lemmikloomad = new ArrayList<>();


}
