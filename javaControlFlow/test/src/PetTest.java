public class PetTest {
	public static void main(String[] args) throws Exception {

		Pokemon gengar = new Pokemon();
		Pokemon charizard = new Pokemon("Charizard", 5, "Kanto", "fire");

		// code below prints the name
		// charizard.name();

		System.out.print("Charizard is " + charizard.age() + " years old!!!");

	}
}
