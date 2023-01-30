package org.java.shop;

public class Smartphone extends Prodotto {
	private String codiceIMEI;
	private int memoria;
	public Smartphone(String nome, String marca, double prezzo, String imei, int memoria) {
		super(nome, marca, prezzo);
		setCodiceImei(imei);
		setMemoria(memoria);
	}
	
	public void setCodiceImei(String imei) {
		this.codiceIMEI= imei;
	}
	public String getCodiceImei() {
		return this.codiceIMEI;
	}
	public void setMemoria(int memoria) {
		this.memoria= memoria;
	}
	public int getMemoria() {
		return this.memoria;
	}
	   @Override
	    public String toString() {
	        return "Smartphone -> " + super.toString() + " Codice Imei:'" + this.codiceIMEI + "' con: " + this.memoria + " Gb di memoria";
	    }
}
