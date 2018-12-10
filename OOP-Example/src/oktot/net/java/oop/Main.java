package oktot.net.java.oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.setName("Tom");
		cat.setType("Mèo Mun");
		dog.setName("Ken");
		dog.setType("Husky");
		
		Zoo zoo = new Zoo();
		zoo.add(cat);
		zoo.add(dog);
		zoo.showListAnimal();
	}

}
