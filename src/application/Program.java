package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion;
		Champion championOther;
		
		System.out.println("Digite os dados do primeiro campeao:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		champion = new Champion(name, life, attack, armor);
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeao:");
		System.out.print("Nome: ");
		sc.nextLine();
		String nameB = sc.nextLine();
		System.out.print("Vida inicial: ");
		int lifeB = sc.nextInt();
		System.out.print("Ataque: ");
		int attackB = sc.nextInt();
		System.out.print("Armadura: ");
		int armorB = sc.nextInt();
		championOther = new Champion( nameB, lifeB, attackB, armorB);
		
		
		System.out.println();
		System.out.print("Quantos turnos voce deseja executar? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < n; i++) {
		    champion.takeDamage(attack, armor, attackB, armorB);
		    championOther.takeDamage(attack, armor, attackB, armorB);

		    if (champion.getLife() <= 0 || championOther.getLife() <= 0) {
		    	System.out.println();
		    	System.out.println("FIM DO COMBATE");
		        break;
		    }

		    System.out.println("Resultado do " + (i + 1) + "º turno:\n");
		    System.out.println(champion.status());
		    System.out.println(championOther.status());
		}

		sc.close();
	}

}
