package ua.lviv.lgs.task5_1;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);
	}
	

@Override
void voice() {
	System.out.println("Я - кошка " + super.getName() + ", мяууу...");
}

}
