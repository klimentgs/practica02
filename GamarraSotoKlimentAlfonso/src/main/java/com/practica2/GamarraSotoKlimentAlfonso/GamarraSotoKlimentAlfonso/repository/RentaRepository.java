package com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.entity.Renta;

@Repository("RentaRepository")
public interface RentaRepository extends JpaRepository<Renta, Integer>{

}
