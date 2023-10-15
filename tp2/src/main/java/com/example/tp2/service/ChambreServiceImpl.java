package com.example.tp2.service;

import com.example.tp2.entities.Bloc;
import com.example.tp2.entities.Chambre;
import com.example.tp2.repository.ChambreRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ChambreServiceImpl implements IChambreService{

    @Autowired
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public void deleteChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }

    @Override
    public Chambre getChambreById(Long chambreId) {
        Optional<Chambre> chambreOptional = chambreRepository.findById(chambreId) ;
        return chambreOptional.orElseThrow(() -> new EntityNotFoundException("Chambre not found with ID: " + chambreId));
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }
}
