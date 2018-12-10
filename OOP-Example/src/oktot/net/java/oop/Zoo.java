package oktot.net.java.oop;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animals = new ArrayList<Animal>();

	public void add(Animal animal) {
		this.animals.add(animal);
	}

	public void remove(Animal animal) {
		this.animals.remove(animal);
	}
	public void showListAnimal() {
		for(Animal animal : this.animals){
			animal.sayHello();
		}
	}
}
