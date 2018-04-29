package com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.entity.Renta;
import com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.web.webImpl.RentaWebImpl;

@Controller
public class RentaController {

	public static final String main_view = "main";
	public static final String calcular_view = "calcular";
	
	public static final double uitdescontable = 28350.0;
	public static final double uit = 4050.0;
	public static final double v_max1 = 5*uit;
	public static final double v_max2 = 20*uit;
	public static final double v_max3 = 35*uit;
	public static final double v_max4 = 45*uit;
	public static final double v_max5 = 45*uit;
	
	@Autowired
	@Qualifier("rentaWebImpl")
	private RentaWebImpl rentaWebImpl;
	
	@GetMapping("/")
	public ModelAndView main(@ModelAttribute("renta") Renta renta) {
		ModelAndView mav = new ModelAndView(main_view);
		mav.addObject("rentas", rentaWebImpl.listAll());
		List<Renta> lista = rentaWebImpl.listAll();
		for (Renta rentas : lista) {
			System.out.println(rentas);
		}
		return mav;
	}
	
	@GetMapping("/calcular")
	public ModelAndView calcular(@ModelAttribute("renta") Renta renta) {
		ModelAndView mav = new ModelAndView(calcular_view);
		mav.addObject("renta", renta);
		return mav;
	}
	
	@PostMapping("/grabar")
	public ModelAndView grabar(@ModelAttribute("renta") Renta renta) {
		ModelAndView mav = new ModelAndView(main_view);
		double ingresos = renta.getIngresos();
		double rentagravable = rentaGravable(ingresos);
		double montoafecto1 = montoAfecto1(rentagravable);
		double montoafecto2 = montoAfecto2(rentagravable);
		double montoafecto3 = montoAfecto3(rentagravable,ingresos);
		double montoafecto4 = montoAfecto4(rentagravable,ingresos);
		double montoafecto5 = montoAfecto5(rentagravable,ingresos);
		double impuesto1 = impuesto1(rentagravable);
		double impuesto2 = impuesto2(rentagravable);
		double impuesto3 = impuesto3(rentagravable,ingresos);
		double impuesto4 = impuesto4(rentagravable,ingresos);
		double impuesto5 = impuesto5(rentagravable,ingresos);
		double montoafectototal = montoAfectoTotal(montoafecto1, montoafecto4, impuesto5);
		double montoImpuestos = montoImpuestos(impuesto1, impuesto2, impuesto3, impuesto4, impuesto5);
		double retencionmensual = retencionMensual(impuesto1, impuesto2, impuesto3, impuesto4, impuesto5);
		renta.setIngresos(ingresos);
		renta.setRentagravable(rentagravable);
		renta.setMontoafecto5uit(montoafecto1);
		renta.setMontoafecto20uit(montoafecto2);
		renta.setMontoafecto35uit(montoafecto3);
		renta.setMontoafecto45uit(montoafecto4);
		renta.setImpuestomas45uit(montoafecto5);
		renta.setImpuesto5uit(impuesto1);
		renta.setImpuesto20uit(impuesto2);
		renta.setImpuesto35uit(impuesto3);
		renta.setImpuesto45uit(impuesto4);
		renta.setImpuestomas45uit(impuesto5);
		renta.setMontoafectototal(montoafectototal);
		renta.setImpuestototal(montoImpuestos);
		renta.setRetencionmensual(retencionmensual);
		rentaWebImpl.addRenta(renta);
		return mav;
	}
	
	public double montoAfectoTotal(double ma1,double ma4,double ma5) {
		double total= ma1+ma4+ma5;
		return total;
	}
	
	public double montoImpuestos(double imp1,double imp2,double imp3,double imp4,double imp5) {
		double total = imp1+imp2+imp3+imp4+imp5;
		return total;
	}
	
	public double rentaGravable(double ingresos) {
		double rg = ingresos - uitdescontable;
		return rg;
	}
	
	public double montoAfecto1(double rentagravable) {
		double monto1=0;
		if(rentagravable>0 && rentagravable<v_max1){
			monto1=rentagravable;
		}else if (rentagravable>=v_max1){
			monto1=v_max1;
		} else if (rentagravable<=v_max1){
			monto1=0;
		}
		return monto1;
	}
	
	public double montoAfecto2(double rentagravable) {
		double monto2=0;
		if(rentagravable>v_max1 && rentagravable<v_max2){
			monto2=rentagravable-montoAfecto1(rentagravable);
		}else if (rentagravable>=v_max2){
			monto2=v_max2-v_max1;
		} else if (rentagravable<=v_max2){
			monto2=0;
		}
		return monto2;
	}
	
	public double montoAfecto3(double rentagravable,double ingresos) {
		double monto3=0;
		if(rentagravable>v_max2 && rentagravable<v_max3){
			monto3= ingresos-(v_max2+uitdescontable);
		}else if (rentagravable>=v_max3){
			monto3=(v_max2-v_max1);
		} else if (rentagravable<=v_max3){
			monto3=0;
		}
		return monto3;
	}
	
	public double montoAfecto4(double rentagravable,double ingresos) {
		double monto4=0;
		if(rentagravable>(v_max3+uitdescontable) && rentagravable<(v_max4)){
			monto4=ingresos-(v_max3+uitdescontable);
		}else if (rentagravable>=v_max4){
			monto4=(v_max4-v_max3);
		} else if (rentagravable<=v_max3){
			monto4=0;
		}
		return monto4;
	}
	
	public double montoAfecto5(double rentagravable,double ingresos) {
		double monto5=0;
		if(rentagravable>(v_max4)){
			monto5=ingresos-(v_max4+uitdescontable);
		} else if (rentagravable<=(v_max4+uitdescontable)){
			monto5=0;
		}
		return monto5;
	}
	
	public double impuesto1(double rentagravable) {
		double impuesto=montoAfecto1(rentagravable)*0.08;
		return impuesto;
	}
	public double impuesto2(double rentagravable) {
		double impuesto=montoAfecto2(rentagravable)*0.14;
		return impuesto;
	}
	public double impuesto3(double rentagravable,double ingresos) {
		double impuesto=montoAfecto3(rentagravable,ingresos)*0.17;
		return impuesto;
	}
	public double impuesto4(double rentagravable,double ingresos) {
		double impuesto=montoAfecto4(rentagravable,ingresos)*0.2;
		return impuesto;
	}
	public double impuesto5(double rentagravable,double ingresos) {
		double impuesto=montoAfecto5(rentagravable, ingresos)*0.3;
		return impuesto;
	}
	
	public double retencionMensual(double imp1,double imp2,double imp3,double imp4,double imp5) {
		double retencion=montoImpuestos(imp1, imp2, imp3, imp4, imp5)/12;
		return retencion;
	}
			
}
