package com.learn.amigoscode.entitas;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Manusia {
    @Id
    @GeneratedValue
    private long id;
    private String nama;
    private String notelf;
    @Column(columnDefinition = "TEXT")
    private String alamat;
}
