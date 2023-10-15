package com.example.tp2.service;

import com.example.tp2.entities.Universite;
import com.example.tp2.repository.UniversiteRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class UniversiteServiceImpl  implements IUniversiteService{

    @Autowired
    UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void deleteUniversite(Long universiteId) {
        universiteRepository.deleteById(universiteId);
    }

    @Override
    public Universite getUniversiteById(Long universiteId) {
        Optional<Universite> universiteOptional = universiteRepository.findById(universiteId);
        return universiteOptional.orElseThrow(() -> new EntityNotFoundException("Bloc not found with ID: " + universiteId));
    }

    @Override
    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }
}
