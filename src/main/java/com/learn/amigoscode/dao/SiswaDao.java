package com.learn.amigoscode.dao;

import com.learn.amigoscode.entitas.Siswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SiswaDao extends PagingAndSortingRepository<Siswa, Long> {
}
