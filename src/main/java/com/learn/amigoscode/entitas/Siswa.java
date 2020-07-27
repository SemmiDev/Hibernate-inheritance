package com.learn.amigoscode.entitas;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
public class Siswa extends Manusia {
    @Column(unique = true)
    private String nisn;
}
