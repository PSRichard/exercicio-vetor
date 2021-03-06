package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
				
		Product[] vect = new Product[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0 ; i<n ; i++) {
			System.out.printf("Rent #%d: ", i+1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			vect[room] = new Product(name, email);			
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i=0 ; i<10 ; i++) {
			if(vect[i]!= null) {
				System.out.println(i + (": " + vect[i]));				
			}
		}
		
		sc.close();
	}

}
