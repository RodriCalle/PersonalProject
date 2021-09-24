package com.itana.personalproject.domain.service;

import com.itana.personalproject.domain.model.Graduate;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IGraduateService {
    Graduate createGraduate(Graduate graduate);
    Graduate getGraduateById(Long id);
    Graduate updateGraduate(Long id, Graduate graduateDetails);
    ResponseEntity<?> deleteGraduate(Long id);

    List<Graduate> getAllGraduates();
}
