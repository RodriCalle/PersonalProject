package com.itana.personalproject.domain.repository;

import com.itana.personalproject.domain.model.Graduate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGraduateRepository extends JpaRepository<Graduate, Long> {
}