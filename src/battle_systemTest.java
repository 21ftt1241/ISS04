import java.util.*;

public class battle_systemTest {

	public static void main(String[] args) {

//		player choice
		int pInput;
		
//		temp player stats
		int pHealth = 20;
		int pBDmg = 3;
		int pDex = 3;

//		temp enemy stats
		int eHealth = 15;
		int eBDmg = 5;
		int eDex = 5;

		Scanner input = new Scanner(System.in);
		int swap = 0;

		while (true) {
			System.out.println("What would you do?\n(0)Attack\t(1)Dodge\t(2)Item");
			System.out.print("Enter input: ");
			pInput = input.nextInt();

//			Attack system (v1)
			if (pInput == 0) {
				if (swap == 0) {
					if (pDex > eDex) {
						System.out.println("You hit the enemy!");
						eHealth = eHealth - pBDmg;
						System.out.println("You dealt " + pBDmg + " damage to the enemy\n");
						swap = 1;
					} else {
						System.out.println("The enemy hit you!");
						pHealth = pHealth - eBDmg;
						System.out.println("The enemy dealt " + eBDmg + " damage to you\n");
						swap = 0;
					}
				}

				if (swap == 1) {
					System.out.println("The enemy hit you!");
					pHealth = pHealth - eBDmg;
					System.out.println("The enemy dealt " + eBDmg + " damage to you\n");
					swap = 0;
				} else {
					System.out.println("You hit the enemy!");
					eHealth = eHealth - pBDmg;
					System.out.println("You dealt " + pBDmg + " damage to the enemy\n");
					swap = 1;
				}
			}

//			Dodge system

		}

	}

}
