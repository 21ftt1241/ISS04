import java.util.*;

public class battle_systemTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String separator = ("------------------------------------------------------------------");

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

//		change the order of play
		int swap = 0;

//		treasure
		int pGold = 20;
		int gold = 0;


		while (true) {
//			random chance variable for dodge and crit chance
			int chance1 = (int) (Math.random() * 100) % 10;
			int chance2 = (int) (Math.random() * 100) % 10;
			System.out.println(separator);
			System.out.println("Your HP: " + pHealth + "\n");
			System.out.println("What would you do?\n(0)Attack\t(1)Dodge\t(2)Item");
			System.out.print("Enter input: ");
			pInput = input.nextInt();

//			Attack system (v1)
			if (pInput == 0) {
				if (swap == 0) {
					if (pDex > eDex) {
						if (chance1 < pDex) {
							System.out.println("\nYou hit the enemy!");
							eHealth = eHealth - pBDmg;
							System.out.println("You dealt " + pBDmg + " damage to the enemy");
							System.out.println("Enemy health left: " + eHealth + "\n");
							swap = 1;
							if (pHealth <= 0) {
								System.out.println("You are dead!");
								break;
							} else {
								if (eHealth <= 0) {
									System.out.println("The enemy is dead");
									break;
								}
							}
						} else {
							System.out.println("\nYou missed");
							swap = 1;
						}
					} else {
						if (chance2 < eDex) {
							System.out.println("The enemy hit you!");
							pHealth = pHealth - eBDmg;
							System.out.println("The enemy dealt " + eBDmg + " damage to you\n");
							swap = 0;
							if (pHealth <= 0) {
								System.out.println("You are dead!");
								break;
							} else {
								if (eHealth <= 0) {
									System.out.println("The enemy is dead");
									break;
								}
							}
						} else {
							System.out.println("\nThe enemy missed");
							swap = 0;
						}
					}
				}

				if (swap == 1) {
					if (chance2 < eDex) {
						System.out.println("The enemy hit you!");
						pHealth = pHealth - eBDmg;
						System.out.println("The enemy dealt " + eBDmg + " damage to you\n");
						swap = 0;
						if (pHealth <= 0) {
							System.out.println("You are dead!");
							break;
						} else {
							if (eHealth <= 0) {
								System.out.println("The enemy is dead");
								break;
							}
						}
					} else {
						System.out.println("\nThe enemy missed");
						swap = 0;
					}
				} else {
					if (chance1 < pDex) {
						System.out.println("You hit the enemy!");
						eHealth = eHealth - pBDmg;
						System.out.println("You dealt " + pBDmg + " damage to the enemy\n");
						System.out.println("Enemy health left: " + eHealth + "\n");
						swap = 1;
						if (pHealth <= 0) {
							System.out.println("You are dead!");
							break;
						} else {
							if (eHealth <= 0) {
								System.out.println("The enemy is dead");
								break;
							}
						}
					} else {
						System.out.println("\nYou missed");
						swap = 1;
					}
				}
			}
		}
	}
}
