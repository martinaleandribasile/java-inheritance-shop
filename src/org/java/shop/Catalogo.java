package org.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 Prodotto[] listaProdotti= new Prodotto[10];
		 int items=0;
		 String choice="";
		 String nome;
		 String marca;
		 double prezzo;
		 while(!choice.equals("4")) {
			 System.out.println("Che prodotto vuoi aggiungere? Digita: 1 -> Smartphone 2 -> Televisore 3 -> Cuffie o 4 -> per Uscire");
			 choice= s.next();
			 switch (choice) {
			 case "1":
				 System.out.println("Inserisci nome prodotto");
                 nome = s.next();
                 System.out.println("Inserisci marca prodotto");
                 marca = s.next();
                 System.out.println("Inserisci prezzo prodotto");
                 prezzo = s.nextDouble();
                 System.out.println("Inserisci imei prodotto");
                 String imei = s.next();
                 System.out.println("Inserisci memoria prodotto");
                 int memoria = s.nextInt();
                 Smartphone newSmartphone= new Smartphone(nome, marca, prezzo, imei, memoria);
                 listaProdotti[newSmartphone.getID()]= newSmartphone;
                 items++;
                 break;
			 case "2":
				 System.out.println("Inserisci nome prodotto");
                 nome = s.next();
                 System.out.println("Inserisci marca prodotto");
                 marca = s.next();
                 System.out.println("Inserisci prezzo prodotto");
                 prezzo = s.nextDouble();
                 System.out.println("Inserisci larghezza prodotto");
                 double larghezza = s.nextDouble();
                 System.out.println("Inserisci altezza prodotto");
                 double altezza = s.nextDouble();
                 System.out.println("Se il televisore e' smart digita 1 senno' digita 0");
                 boolean smart;
                 if(s.next().equals("1")) {smart =true;}else {smart=false;}
                 Televisore newTelevisore = new Televisore(nome, marca, prezzo, altezza, larghezza, smart);
                 listaProdotti[newTelevisore.getID()]= newTelevisore;
                 items++;
                 break;
			 case "3":
				 System.out.println("Inserisci nome prodotto");
                 nome = s.next();
                 System.out.println("Inserisci marca prodotto");
                 marca = s.next();
                 System.out.println("Inserisci prezzo prodotto");
                 prezzo = s.nextDouble();
                 System.out.println("Inserisci il colore del prodotto");
                 String colore=s.next();
                 System.out.println("Scrivi cablata o wireless in base alla tipologia del tuo prodotto");
                 String tipologia=s.next();
                 Cuffia newCuffia= new Cuffia(nome, marca, prezzo, tipologia, colore);
                 listaProdotti[newCuffia.getID()]= newCuffia;
                 items++;
                 break;
			 case "4":
				 System.out.println("Grazie per aver usato in nostro shop!");
				 break;
              default:
                   System.out.println("Il comando non e' valido, riprovi!");
                   break;
			 }
			 
		 }
		  System.out.println("Ecco il catalogo aggiornato");
	        for (int i=0;i<items ;i++) {
	            System.out.println(listaProdotti[i].toString());
	        }
		 s.close();
	}

}