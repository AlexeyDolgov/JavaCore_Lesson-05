package ua.lviv.lgs.task5_1;

public abstract class Pet {

	private String name;
	
	public Pet(String name) {
		this.name = name;
	}

	abstract void voice();

	public String getName() {
		return name;
	}
		
}
