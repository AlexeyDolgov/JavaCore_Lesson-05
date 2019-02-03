package ua.lviv.lgs.task5_1;

public class Dog extends Pet {

	public Dog(String name) {
		super(name);
	}

	
@Override
void voice() {
	System.out.println("Я - пес " + super.getName() + ", гав-гав...");
}

}
