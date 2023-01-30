package org.java.shop;

public class Televisore extends Prodotto {
	private double larghezza;
	private double altezza;
	private boolean smart;
	
	public Televisore(String nome, String marca, double prezzo, double altezza, double larghezza, boolean smart) {
		super(nome, marca, prezzo);
		setLarghezza(larghezza);
		setAltezza(altezza);
		setSmart(smart);
	}
	public void setAltezza(double altezza) {
		this.altezza=altezza;
	}
	public double getAlteza() {
		return this.altezza;
	}
	public void setLarghezza(double larghezza) {
		this.larghezza=larghezza;
	}
	public double getLarghezza() {
		return this.larghezza;
	}
	public void setSmart(boolean smart) {
		this.smart=smart;
	}
	public boolean getSmart() {
		return this.smart;
	}
	@Override
    public String toString() {
        return "Televisore -> " + super.toString() + " Dimensioni: " + this.larghezza  + "cm larghezza e " + this.altezza + "cm di altezza, la televisione e' smart: " + this.smart;
    }
}
