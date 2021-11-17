package a08_반복;

public class DobleFor {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + "번째 바퀴");
			for (int j = 1; j < 6; j++) {
				System.out.println("코끼리코" + j + "번째");
			}
		}
	}

}
