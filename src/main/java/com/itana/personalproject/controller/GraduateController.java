package com.itana.personalproject.controller;

import com.itana.personalproject.domain.model.Graduate;
import com.itana.personalproject.domain.service.IGraduateService;
import com.itana.personalproject.resource.GraduateResource;
import com.itana.personalproject.resource.SaveGraduateResource;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class GraduateController {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IGraduateService graduateService;

    private Graduate convertToEntity(SaveGraduateResource resource){
        return modelMapper.map(resource,Graduate.class);
    }

    private GraduateResource convertToResource(Graduate entity){
        return modelMapper.map(entity,GraduateResource.class);
    }


    @PostMapping("/graduation")
    public GraduateResource createGraduate(@Valid @RequestBody SaveGraduateResource resource){
        Graduate graduate = convertToEntity(resource);
        return convertToResource(graduateService.createGraduate(graduate));
    }

    @GetMapping("/graduation/{id}")
    public GraduateResource getGraduateById(@PathVariable Long id){
        return convertToResource(graduateService.getGraduateById(id));
    }

    @PutMapping("/graduation/{id}")
    public GraduateResource updateGraduate(@PathVariable Long id, @Valid @RequestBody SaveGraduateResource resource){
        Graduate graduate = graduateService.updateGraduate(id, convertToEntity(resource));
        return convertToResource(graduate);
    }

    @DeleteMapping("/graduation/{id}")
    public ResponseEntity<?> deleteGraduate(@PathVariable Long id){
        return graduateService.deleteGraduate(id);
    }

    @GetMapping("/graduation")
    public List<GraduateResource> getAllGraduates(){
        return graduateService.getAllGraduates().stream().map(this::convertToResource)
                .collect(Collectors.toList());
    }

}
