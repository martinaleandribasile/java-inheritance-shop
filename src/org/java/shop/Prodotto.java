package org.java.shop;

import java.text.DecimalFormat;
import java.util.Random;


public class Prodotto {
	Random r = new Random();
	private int codice;
	private String nome;
	private String marca;
	private double prezzo;
	private double iva= 22;
	int id;
	private static int itemsNumber=0;
	
	public Prodotto( String nome, String marca, double prezzo) {
		this.codice=r.nextInt(1000);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		this.id= itemsNumber;
		itemsNumber++;
		
		
	}
	
	public int getCodice() {
		return this.codice;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public String getMarca() {
		return this.marca;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo=prezzo;
	}
	public double getPrezzo() {
		return this.prezzo;
	}
	public String getPrezzoIva() {
		DecimalFormat df = new DecimalFormat("0.00");
        double prezzoFinale = prezzo+((prezzo/100)*iva);
        return df.format(prezzoFinale);
	}
	public int getID() {
		return this.id;
	}
	
	@Override
    public String toString() {
        return " Codice Prodotto: "+ codice + " Nome: " + nome + " Marca: " + marca +" Prezzo con Iva: " + getPrezzoIva() + " euro";
    }
}


