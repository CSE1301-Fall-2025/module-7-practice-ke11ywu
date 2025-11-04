package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass (defined as int)
 */
public class Planet {

	// Define your instance variables here
	private String name;
	private int mass;
	
	// Write the constructor for the Planet class
	public Planet(String name, int mass){
		this.name = name;
		this.mass = mass;
	}
	
	public String getName() {
		return this.name; //FIXME
	}
	
	public int getMass() {
		return this.mass; //FIXME
	}
	
	public String toString() {
		return this.name + ": " + this.mass; //FIXME
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide(Planet other) {
		int newMass = this.getMass() + other.getMass();
		String newName = this.getName() + "-" + other.getName();
		return new Planet(newName, newMass); //FIXME
	}	
	
	public static void main(String[] args) {
		Planet planet1 = new Planet("Jupitoor", 10005);
		System.out.println(planet1);
		System.out.println(planet1.getMass());
		System.out.println(planet1.mass);
		System.out.println(planet1.getName());
		System.out.println(planet1.name);
		Planet planet2 = new Planet("Satoorn", 2030);
		System.out.println(planet1.collide(planet2));
	}
}

