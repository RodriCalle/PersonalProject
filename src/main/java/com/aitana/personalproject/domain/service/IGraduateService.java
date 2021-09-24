package com.aitana.personalproject.domain.service;

import com.aitana.personalproject.domain.model.Graduate;
import org.springframework.http.ResponseEntity;

public interface IGraduateService {
    Graduate createGraduate(Graduate graduate);
    Graduate getGraduateById(Long id);
    Graduate updateGraduate(Long id, Graduate graduateDetails);
    ResponseEntity<?> deleteGraduate(Long id);
}
