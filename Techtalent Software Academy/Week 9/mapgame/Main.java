package mapgame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//system items
		
		Scanner in= new Scanner(System.in);
		
		Random rand=new Random();

		Character Grogu= new Character("Grogu", 3, "Grogu is a small green alien of an unknown species that lives for hundreds of years", "Force User");
		
		
		Map Cantina=new Map(10,10);
		
		
		
		
		Cantina.setCurrentX(rand.nextInt(10));
		Cantina.setCurrentY(rand.nextInt(10));
		
		
		int groguX =Cantina.getCurrentX();
		int groguY=Cantina.getCurrentY();		
		
		System.out.println("Welcome to the Cantina " + Grogu.getName());
		System.out.println("\tYou have "+ Grogu.getLives() + " lives remaining.");
		System.out.println(System.lineSeparator());
		System.out.println("Please choose a direction, find those snackies quick!");
		System.out.println("\tN to go North"+ System.lineSeparator()+"\tS to go South");
		System.out.println("\tE to go East"+ System.lineSeparator()+"\tW to go West");
		System.out.println(System.lineSeparator());
		
		System.out.println("Help Grogu get to the exit and find his snackies!!");
		
		while(groguX!=5||groguY!=5){
			System.out.println("Keep Moving, enter a direction");
			String direction=in.nextLine();
			Cantina.move(direction);
			System.out.println(Cantina.getCurrentX());
			System.out.println(Cantina.getCurrentY());
				
		}
	

}}
