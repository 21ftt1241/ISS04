import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class game_G10 {

	public static void main(String[] args) throws IOException {

		String separator = ("________________________________________________________");

		// Player Stats (name, gender, race, class)
		String pName;
		String[] pRaceArr = { "Human", "Dwarf", "Dark Elf", "Tiefling" };
		String[] pClassArr = { "Rogue", "Mage", "Warrior" };
		String pClass, pRace;
		int pHealth, pExp, pLvl, pChoice;

		// Save function
		String[] saveArr = new String[3];

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

		System.out.println(separator + "\n");

		// Player menu
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your name: ");
		pName = input.next();
		saveArr[0] = pName;

		System.out.print("Select your race (0)Human, (1)Dwarf, (2)Dark Elf, (3)Tiefling: ");
		pChoice = input.nextInt();
		saveArr[1] = String.valueOf(pChoice);
		pRace = pRaceArr[pChoice];

		System.out.print("Select your class (0)Rogue, (1)Mage, (2)Warrior: ");
		pChoice = input.nextInt();
		saveArr[2] = String.valueOf(pChoice);
		pClass = pClassArr[pChoice];

		FileWriter writer = new FileWriter(
				"C:\\Users\\Nitro 5\\Desktop\\Poly\\Semester 2\\IS2203 - Introduction to Programing\\Assignments\\ISS04\\save/Save.txt",
				true);
		writer.write(saveArr[0] + saveArr[1] + saveArr[2]);
		writer.close();

		// Opening
		System.out.println(separator + "\n");
		System.out.println("Your name is " + pName + ", You are a " + pRace + " " + pClass
				+ " looking to have an adventure into"
				+ " the unknown,\nthe mysterious dungeon pique your interest, you decided to enter the dungeon\nand"
				+ " uncover what ever mystery or treasure that is hidden deep beneath it");

		// Room 1
		System.out.println(separator + "\n");
		System.out.println("");

	}

}
