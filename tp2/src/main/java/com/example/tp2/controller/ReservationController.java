package com.example.tp2.controller;

import com.example.tp2.entities.Foyer;
import com.example.tp2.entities.Reservation;

import com.example.tp2.service.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Reservation")
public class ReservationController {

    @Autowired
    IReservationService reservationService;

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r){
        return reservationService.addReservation(r);
    }
    @PutMapping("/update-reservation/{reservationId}")
    public Reservation updateReservation(@PathVariable Long reservationId,@RequestBody Reservation r ){
        r.setIdReservation(reservationId);
        Reservation updatedReservation = reservationService.updateReservation(r);
        return updatedReservation;
    }
    @DeleteMapping("/delete-reservation/{reservationId}")
    public void deleteReservation(@PathVariable Long reservationId){
        reservationService.deleteReservation(reservationId);
    }
    @GetMapping("/get-reservation/{reservationId}")
    public Reservation getReservationById(@PathVariable Long reservationId){
        return reservationService.getReservationById(reservationId);
    }
    @GetMapping("/get-all-reservations")
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

}
