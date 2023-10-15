package com.example.tp2.service;

import com.example.tp2.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public Bloc addBloc (Bloc b);
    public Bloc updateBloc (Bloc b);
    public void deleteBloc (Long blocId);
    public Bloc getBlocById (Long blocId);
    public List<Bloc> getAllBlocs();
}
