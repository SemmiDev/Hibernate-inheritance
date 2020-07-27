package com.learn.amigoscode.dao;

import com.learn.amigoscode.entitas.Guru;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface GuruDao extends PagingAndSortingRepository<Guru, Long> {
}