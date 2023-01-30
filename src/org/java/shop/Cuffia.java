package org.java.shop;

public class Cuffia extends Prodotto {
	private String colore;
	private String tipologia;
	public Cuffia(String nome, String marca, double prezzo, String tipologia, String colore) {
		super(nome, marca, prezzo);
		setTipologia(tipologia);
		setColore(colore);
	};
	
	public void setTipologia(String tipologia) {
		this.tipologia=tipologia;
	}
	public void setColore(String colore) {
		this.colore=colore;
	}
	 public String getTipologia() {
		 return this.tipologia;
	 }
	public String colore() {
		return this.colore;
	}
	@Override
    public String toString() {
        return "Cuffia -> " + super.toString() + " Colore: " + this.colore  + " Tipologia: " + this.tipologia ;
    }
}
