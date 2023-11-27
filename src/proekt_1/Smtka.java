package proekt_1;

import java.util.Scanner;

public class Smtka {

	public static void main(String[] args) {
	//jabolki-50 den kg.krusi-60 den kg.grojze-100 den kg
		double smetka = 0;
		System.out.println("Vnesi sto si pazaruval vo kg");
		Scanner tastatura= new Scanner (System.in);
		System.out.println("jbolki:");
		double jabolki=tastatura.nextDouble();
		System.out.print("krusi:");
		double krusi=tastatura.nextDouble();
		System.out.println("grojze:");
		double grojze=tastatura.nextDouble();
		smetka = jabolki*50+krusi*60+grojze*100;
		System.out.println("Smetkata iznesuva:");
		
		
		
		

	}

}
