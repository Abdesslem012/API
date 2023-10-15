package com.example.tp2.service;


import com.example.tp2.entities.Reservation;

import java.util.List;

public interface IReservationService {

    public Reservation addReservation (Reservation r);
    public Reservation updateReservation (Reservation r);
    public void deleteReservation (Long reservationId);
    public Reservation getReservationById (Long reservationId);
    public List<Reservation> getAllReservations();
}
