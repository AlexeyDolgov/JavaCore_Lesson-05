package ua.lviv.lgs.task5_2;

public class Coin {

	static void throwCoin() {
		int throwResult = (int) (Math.random() * 2);
		
		if (throwResult == 1)
			System.out.println("����");
		else
			System.out.println("�����");
	}
	
}
