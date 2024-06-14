package org.gen.italy;

/*
 Scrivere un programma per gestire i “Buoni propositi per il futuro”: il
programma all’avvio visualizza 5 “buoni propositi” (es: “fare più
attività fisica”, “esercitarsi sulla OOP”, ecc.).
Si chiede all’utente di indicare quale dei propositi visualizzati è stato
conseguito, e viene riproposto l’elenco solo con quelli non ancora
conseguiti.
Si continua a chiedere all’utente fino a quando tutti i propositi saranno
conseguiti.
 */

import java.util.Scanner; 
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> buoniPropositi = new ArrayList<String>();
		buoniPropositi.add("Fare più attività fisica.");
		buoniPropositi.add("Esercitarsi sulla programmazione orientata agli oggetti.");
		buoniPropositi.add("Mangiare sano.");
		buoniPropositi.add("Leggere più libri.");
		buoniPropositi.add("Risparmiare.");

		int checkProposito; //per indicare il proposito conseguito
		
		//dowhile + for che si ripete finché la lista dei buoni propositi non è completata (isEmpty)
		do {
			System.out.println("Lista buoni propositi");
			for (int i=0; i<buoniPropositi.size(); i++) {
				System.out.println((i+1) + " - " + buoniPropositi.get(i));
			}
				System.out.println("Inserisci il numero del proposito conseguito (1-5)");
				checkProposito=sc.nextInt()-1;
				sc.nextLine();
				
				if (checkProposito>=0 && checkProposito<buoniPropositi.size()) {
					buoniPropositi.remove(checkProposito);
					System.out.println("Complimenti! Sei sempre più vicinoa al tuo obiettivo.");

				} else {
					System.out.println("Inserimento non valido. Riprova!!");
				}
				
		}while(!buoniPropositi.isEmpty());
		
		//stampo uscita dal ciclo
		System.out.println("Complimenti! Hai completato la lista dei buoni propositi. Keep up the good work e al prossimo anno! ;)");
		sc.close();

	}

}
