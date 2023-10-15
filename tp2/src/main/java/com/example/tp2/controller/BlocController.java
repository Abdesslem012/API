package com.example.tp2.controller;

import com.example.tp2.entities.Bloc;
import com.example.tp2.service.IBlocService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {

    @Autowired
    IBlocService blocService;

    @PostMapping("/add-bloc")
    public Bloc addbloc(@RequestBody Bloc b){
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    @PutMapping("/update-bloc/{blocId}")
    public Bloc updateBloc(@PathVariable Long blocId, @RequestBody Bloc b){
        b.setIdBloc(blocId);
        Bloc updatedBloc = blocService.updateBloc(b);
        return  updatedBloc;
    }
    @DeleteMapping("/delete-bloc/{blocId}")
    public void deletebloc(@PathVariable Long blocId){
        blocService.deleteBloc(blocId);
    }
    @GetMapping("/get-bloc/{blocId}")
    public Bloc getBlocById(@PathVariable Long blocId){
        return blocService.getBlocById(blocId);
    }
    @GetMapping("/get-all-blocs")
    public List<Bloc> getAllBlocs(){
        return blocService.getAllBlocs();
    }
}
