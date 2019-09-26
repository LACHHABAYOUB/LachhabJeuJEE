package metier;

import java.util.Scanner;

public class TestJeu {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Jeu nb = new Jeu();

		 while(nb.isEtat() == false){
			 System.out.println("entrer le nombre");
			 int n = sc.nextInt();
			 //nb.Jouer(n);
			 System.out.println(nb.Jouer(n));
		 }

	}

}
