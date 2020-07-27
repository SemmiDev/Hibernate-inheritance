package com.learn.amigoscode.dao;

import com.learn.amigoscode.entitas.Mahasiswa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MahasiswaDao extends PagingAndSortingRepository<Mahasiswa, Long> {
}
