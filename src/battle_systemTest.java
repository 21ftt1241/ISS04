import java.util.*;

public class battle_systemTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		player choice
		int pInput;

//		temp player stats
		int pHealth = 20;
		int pBDmg = 3;
		int pDex = 8;

//		temp enemy stats
		int eHealth = 15;
		int eBDmg = 5;
		int eDex = 5;

		int swap = 0;

//		random chance variable for dodge and crit chance
		int random = (int) (Math.random() * 100) % 10;

		while (true) {
			System.out.println("What would you do?\n(0)Attack\t(1)Dodge\t(2)Item");
			System.out.print("Enter input: ");
			pInput = input.nextInt();

//			Attack system (v1)
			if (pInput == 0) {
				if (swap == 0) {
					if (pDex > eDex) {
						if (random < pDex) {
							System.out.println("You hit the enemy!");
							eHealth = eHealth - pBDmg;
							System.out.println("You dealt " + pBDmg + " damage to the enemy\n");
							swap = 1;
						} else {
							System.out.println("You missed\n");
							swap = 1;
						}
					} else {
						if (random < eDex) {
							System.out.println("The enemy hit you!");
							pHealth = pHealth - eBDmg;
							System.out.println("The enemy dealt " + eBDmg + " damage to you\n");
							swap = 0;
						} else {
							System.out.println("The enemy missed\n");
							swap = 0;
						}
					}
				}

				if (swap == 1) {
					if (random < eDex) {
						System.out.println("The enemy hit you!");
						pHealth = pHealth - eBDmg;
						System.out.println("The enemy dealt " + eBDmg + " damage to you\n");
						swap = 0;
					}else {
						System.out.println("The enemy missed\n");
						swap = 0;
					}
				} else {
					if (random < pDex) {
					System.out.println("You hit the enemy!");
					eHealth = eHealth - pBDmg;
					System.out.println("You dealt " + pBDmg + " damage to the enemy\n");
					swap = 1;
					}else {
						System.out.println("You missed\n");
						swap = 1;
					}
				}
			}

//			Dodge system

		}

	}

}
