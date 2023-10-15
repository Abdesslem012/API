package com.example.tp2.service;


import com.example.tp2.entities.Chambre;

import java.util.List;

public interface IChambreService {

    public Chambre addChambre (Chambre c);
    public Chambre updateChambre (Chambre c);
    public void deleteChambre (Long chambreId);
    public Chambre getChambreById (Long chambreId);
    public List<Chambre> getAllChambres();
}
