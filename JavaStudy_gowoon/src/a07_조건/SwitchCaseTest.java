package a07_조건;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char select = 'G';
		
		switch (select) {
			case 'A':
				System.out.println("성적 : 90 ~ 100 사이");
				break;
			case 'B':
				System.out.println("성적 : 80 ~ 89 사이");
				break;
			case 'C':
				System.out.println("성적 : 70 ~ 79 사이");
				break;
			case 'D':
				System.out.println("성적 : 60 ~ 69 사이");
				break;
			case 'F':
				System.out.println("성적 : 0 ~ 59 사이");
				break;
			default:
				System.out.println("" + select + "는 잘못된 성적입니다.");
		}
	}

}
