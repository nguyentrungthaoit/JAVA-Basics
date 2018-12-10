package oktot.net.java.oop;

public class Cat extends Animal{
	
	private String name;
	private int age;
	private String type;
	private String sex;
	
	//Constructor
	public Cat() {

	}
	//Constructor được custom
	public Cat(String name, int age, String type, String sex) {

		this.name = name;
		this.age = age;
		this.type = type;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello! I'm" + name + ".I'm a " + type + ".");
	}
	
}
