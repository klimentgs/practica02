package com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.web;

import java.util.List;

import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.entity.Renta;

public interface RentaWeb {
	public abstract List<Renta> listAll();
	public abstract Renta addRenta(Renta renta);
}
