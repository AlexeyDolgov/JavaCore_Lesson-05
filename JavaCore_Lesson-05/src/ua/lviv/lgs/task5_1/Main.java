package ua.lviv.lgs.task5_1;

public class Main {

	public static void main(String[] args) {
		Cow cow = new Cow ("Марта");
		Cat cat = new Cat ("Мурка");
		Dog dog = new Dog ("Джек");

		cow.voice();
		cat.voice();
		dog.voice();
	}

}
