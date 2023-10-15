package com.example.tp2.service;

import com.example.tp2.entities.Reservation;
import com.example.tp2.repository.ReservationRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService{

    @Autowired
    ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return reservationRepository.save(r);
    }

    @Override
    public void deleteReservation(Long reservationId) {
        reservationRepository.deleteById(reservationId);
    }

    @Override
    public Reservation getReservationById(Long reservationId) {
        Optional<Reservation> reservationOptional = reservationRepository.findById(reservationId);
        return reservationOptional.orElseThrow(() -> new EntityNotFoundException("Reservation not found with ID: " + reservationId));
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
