package ua.lviv.lgs.task5_1;

public class Cow extends Pet {

	public Cow(String name) {
		super(name);
	}

	
@Override
void voice() {
	System.out.println("� - ������ " + super.getName() + ", ����...");
}

}
