/**
 * Pet
 */
// public class Pet {

// 	private String name;
// 	private int age;
// 	private String location;
// 	private String type;

// 	public Pet() {
// 		this.name = "gengar";
// 		this.age = 5;
// 		this.location = "kanto";
// 		this.type = "ghost";
// 	}

// 	public String pokemon(){
// 		return (name+" is a "+age+" year old "+type+" type Pokemon from "+location+".");
// 	}
// }

public class Pokemon {

	private String name;
	int age;
	private String location;
	private String type;
	private boolean fainted;

	Pokemon() {
		this.name = "gengar";
		this.age = 5;
		this.location = "kanto";
		this.type = "ghost";
		this.fainted = false;
	}

	Pokemon(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
		this.fainted = false;
	}

	public boolean checkFainted() {
		return fainted;
	}

	public void type() {
		System.out.println(this.type);
	}

	public int age() {
		return this.age;
	}

	public void name() {
		System.out.println(this.name);
	}

	public String evolution(String pokemon) {
		return this.name = pokemon;
	}

}