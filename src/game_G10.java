import java.util.*;

public class game_G10 {

	public static void main(String[] args) {
		// Player Stats (name, gender, race, class)

		String pName;
		String pGender;
		String[] pRace = { "Human", "Dwarf", "Elf", "Tiefling" };
		String[] pClassArr = { "Rogue", "Mage", "Warrior" };
		String pClass;
		int pHealth, pExp, pLvl, pChoice;

		// Banner
		System.out.println("\\    /_ | _ _ ._ _  _   /\\  _|   _ .__|_   .__ ._  \r\n"
				+ " \\/\\/(/_|(_(_)| | |(/_ /--\\(_|\\/(/_| ||_|_||(/_|   \r\n"
				+ "                                                   \r\n" + "       \r\n" + "_|_ _  \r\n"
				+ " |_(_)  ");
		System.out.println("     _   ____                                     \r\n"
				+ "    | | |  _ \\ _   _ _ __   __ _  ___  ___  _ __  \r\n"
				+ " _  | | | | | | | | | '_ \\ / _` |/ _ \\/ _ \\| '_ \\ \r\n"
				+ "| |_| | | |_| | |_| | | | | (_| |  __/ (_) | | | |\r\n"
				+ " \\___/  |____/ \\__,_|_| |_|\\__, |\\___|\\___/|_| |_|\r\n"
				+ "                           |___/       ");
		System.out.println("________________________________________________________");

		// Player menu
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		pName = input.next();

		System.out.print("Select your gender Male or Female: ");
		pGender = input.next();

		System.out.print("Select your class Rogue(0), Mage(1), Warrior(2): ");
		pChoice = input.nextInt();
		pClass = pClassArr[pChoice];

		// Opening
		System.out.println("________________________________________________________");
		System.out.println("Your name is " + pName + ", You are a " + pClass + " looking to have an adventure into"
				+ " the unknown,\nthe mysterious dungeon pique your interest, you decided to enter the dungeon\nand"
				+ " uncover what ever mystery or treasure that is hidden deep beneath it");

	}

}
