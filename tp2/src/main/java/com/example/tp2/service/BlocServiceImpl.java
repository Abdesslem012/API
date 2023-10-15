package com.example.tp2.service;

import com.example.tp2.entities.Bloc;
import com.example.tp2.repository.BlocRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class BlocServiceImpl implements IBlocService {
    @Autowired
    BlocRepository blocRepository;

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void deleteBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }

    @Override
    public Bloc getBlocById(Long blocId) {
        Optional<Bloc> blocOptional = blocRepository.findById(blocId) ;
        return blocOptional.orElseThrow(() -> new EntityNotFoundException("Bloc not found with ID: " + blocId));
    }

    @Override
    public List<Bloc> getAllBlocs() {
        return blocRepository.findAll();
    }

}
