package com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.web.webImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.entity.Renta;
import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.repository.RentaRepository;
import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.web.RentaWeb;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Service("rentaWebImpl")
public class RentaWebImpl implements RentaWeb{

	public static final Log Log = LogFactory.getLog(RentaWebImpl.class);
	
	@Autowired
	@Qualifier("RentaRepository")
	private RentaRepository rentaRepository;
	
	@Override
	public List<Renta> listAll() {
		Log.info("RentaWebImpl listAll()");
		return rentaRepository.findAll();
	}

	@Override
	public Renta addRenta(Renta renta) {
		Log.info("Inicia método: addRenta()"); 
		return rentaRepository.save(renta);
	}

}
