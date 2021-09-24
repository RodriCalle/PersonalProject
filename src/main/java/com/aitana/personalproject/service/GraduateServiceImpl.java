package com.aitana.personalproject.service;

import com.aitana.personalproject.domain.model.Graduate;
import com.aitana.personalproject.domain.repository.IGraduateRepository;
import com.aitana.personalproject.domain.service.IGraduateService;
import com.aitana.personalproject.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GraduateServiceImpl implements IGraduateService {
    @Autowired
    private IGraduateRepository graduateRepository;

    @Override
    public Graduate createGraduate(Graduate graduate) {
        return graduateRepository.save(graduate);
    }

    @Override
    public Graduate getGraduateById(Long id) {
        return graduateRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Graduate", "id", id));
    }

    @Override
    public Graduate updateGraduate(Long id, Graduate graduateDetails) {
        return graduateRepository.findById(id).map(graduate -> {
            graduate.setYear(graduateDetails.getYear());
            graduate.setSex(graduateDetails.getSex());
            graduate.setTypeOfCourse(graduateDetails.getTypeOfCourse());
            graduate.setNoOfGraduates(graduateDetails.getNoOfGraduates());
            return graduate;
        }).orElseThrow(() -> new ResourceNotFoundException("Graduate", "id", id));
    }

    @Override
    public ResponseEntity<?> deleteGraduate(Long id) {
        return graduateRepository.findById(id).map(graduate -> {
            graduateRepository.delete(graduate);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Graduate", "id", id));
    }
}
