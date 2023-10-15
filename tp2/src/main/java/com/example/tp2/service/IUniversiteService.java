package com.example.tp2.service;


import com.example.tp2.entities.Universite;

import java.util.List;

public interface IUniversiteService {

    public Universite addUniversite (Universite u);
    public Universite updateUniversite (Universite u);
    public void deleteUniversite (Long universiteId);
    public Universite getUniversiteById (Long universiteId);
    public List<Universite> getAllUniversites();
}
