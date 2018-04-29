package com.practica2.GamarraSotoKlimentAlfonso.GamarraSotoKlimentAlfonso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="renta")
public class Renta {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;	
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="ingresos")
	private double ingresos;
	@Column(name="uitdescontable")
	private double uitdescontable;
	@Column(name="rentagravable")
	private double rentagravable;
	@Column(name="retencionmensual")
	private double retencionmensual;
	@Column(name="uit")
	private double uit;
	@Column(name="montoafecto5uit")
	private double montoafecto5uit;
	@Column(name="montoafecto20uit")
	private double montoafecto20uit;
	@Column(name="montoafecto35uit")
	private double montoafecto35uit;
	@Column(name="montoafecto45uit")
	private double montoafecto45uit;
	@Column(name="montoafectomas45uit")
	private double montoafectomas45uit;
	@Column(name="impuesto5uit")
	private double impuesto5uit;
	@Column(name="impuesto20uit")
	private double impuesto20uit;
	@Column(name="impuesto35uit")
	private double impuesto35uit;
	@Column(name="impuesto45uit")
	private double impuesto45uit;
	@Column(name="impuestomas45uit")
	private double impuestomas45uit;
	@Column(name="impuestototal")
	private double impuestototal;
	@Column(name="montoafectototal")
	private double montoafectototal;
	
	public Renta() {
		
	}

	public Renta(Integer id, String nombres, String apellidos, double ingresos, double uitdescontable,
			double rentagravable, double retencionmensual, double uit, double montoafecto5uit, double montoafecto20uit,
			double montoafecto35uit, double montoafecto45uit, double montoafectomas45uit, double impuesto5uit,
			double impuesto20uit, double impuesto35uit, double impuesto45uit, double impuestomas45uit,
			double impuestototal, double montoafectototal) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.ingresos = ingresos;
		this.uitdescontable = uitdescontable;
		this.rentagravable = rentagravable;
		this.retencionmensual = retencionmensual;
		this.uit = uit;
		this.montoafecto5uit = montoafecto5uit;
		this.montoafecto20uit = montoafecto20uit;
		this.montoafecto35uit = montoafecto35uit;
		this.montoafecto45uit = montoafecto45uit;
		this.montoafectomas45uit = montoafectomas45uit;
		this.impuesto5uit = impuesto5uit;
		this.impuesto20uit = impuesto20uit;
		this.impuesto35uit = impuesto35uit;
		this.impuesto45uit = impuesto45uit;
		this.impuestomas45uit = impuestomas45uit;
		this.impuestototal = impuestototal;
		this.montoafectototal = montoafectototal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public double getUitdescontable() {
		return uitdescontable;
	}

	public void setUitdescontable(double uitdescontable) {
		this.uitdescontable = uitdescontable;
	}

	public double getRentagravable() {
		return rentagravable;
	}

	public void setRentagravable(double rentagravable) {
		this.rentagravable = rentagravable;
	}

	public double getRetencionmensual() {
		return retencionmensual;
	}

	public void setRetencionmensual(double retencionmensual) {
		this.retencionmensual = retencionmensual;
	}

	public double getUit() {
		return uit;
	}

	public void setUit(double uit) {
		this.uit = uit;
	}

	public double getMontoafecto5uit() {
		return montoafecto5uit;
	}

	public void setMontoafecto5uit(double montoafecto5uit) {
		this.montoafecto5uit = montoafecto5uit;
	}

	public double getMontoafecto20uit() {
		return montoafecto20uit;
	}

	public void setMontoafecto20uit(double montoafecto20uit) {
		this.montoafecto20uit = montoafecto20uit;
	}

	public double getMontoafecto35uit() {
		return montoafecto35uit;
	}

	public void setMontoafecto35uit(double montoafecto35uit) {
		this.montoafecto35uit = montoafecto35uit;
	}

	public double getMontoafecto45uit() {
		return montoafecto45uit;
	}

	public void setMontoafecto45uit(double montoafecto45uit) {
		this.montoafecto45uit = montoafecto45uit;
	}

	public double getMontoafectomas45uit() {
		return montoafectomas45uit;
	}

	public void setMontoafectomas45uit(double montoafectomas45uit) {
		this.montoafectomas45uit = montoafectomas45uit;
	}

	public double getImpuesto5uit() {
		return impuesto5uit;
	}

	public void setImpuesto5uit(double impuesto5uit) {
		this.impuesto5uit = impuesto5uit;
	}

	public double getImpuesto20uit() {
		return impuesto20uit;
	}

	public void setImpuesto20uit(double impuesto20uit) {
		this.impuesto20uit = impuesto20uit;
	}

	public double getImpuesto35uit() {
		return impuesto35uit;
	}

	public void setImpuesto35uit(double impuesto35uit) {
		this.impuesto35uit = impuesto35uit;
	}

	public double getImpuesto45uit() {
		return impuesto45uit;
	}

	public void setImpuesto45uit(double impuesto45uit) {
		this.impuesto45uit = impuesto45uit;
	}

	public double getImpuestomas45uit() {
		return impuestomas45uit;
	}

	public void setImpuestomas45uit(double impuestomas45uit) {
		this.impuestomas45uit = impuestomas45uit;
	}

	public double getImpuestototal() {
		return impuestototal;
	}

	public void setImpuestototal(double impuestototal) {
		this.impuestototal = impuestototal;
	}

	public double getMontoafectototal() {
		return montoafectototal;
	}

	public void setMontoafectototal(double montoafectototal) {
		this.montoafectototal = montoafectototal;
	}

	@Override
	public String toString() {
		return "Renta [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", ingresos=" + ingresos
				+ ", uitdescontable=" + uitdescontable + ", rentagravable=" + rentagravable + ", retencionmensual="
				+ retencionmensual + ", uit=" + uit + ", montoafecto5uit=" + montoafecto5uit + ", montoafecto20uit="
				+ montoafecto20uit + ", montoafecto35uit=" + montoafecto35uit + ", montoafecto45uit=" + montoafecto45uit
				+ ", montoafectomas45uit=" + montoafectomas45uit + ", impuesto5uit=" + impuesto5uit + ", impuesto20uit="
				+ impuesto20uit + ", impuesto35uit=" + impuesto35uit + ", impuesto45uit=" + impuesto45uit
				+ ", impuestomas45uit=" + impuestomas45uit + ", impuestototal=" + impuestototal + ", montoafectototal="
				+ montoafectototal + "]";
	}

	
	
	
}
