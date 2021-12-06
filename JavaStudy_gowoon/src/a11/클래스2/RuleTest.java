package a11.클래스2;

/**
 * 
 * @author ITPS
 *
 */

public class RuleTest {

	public static void main(String[] args) {
		Rule rule = new Rule();
		
		
		String name = "홍길동";
		String addr = "조선광역시 번쩍동";
		int year = 2021;
		
		if (rule.isEmpty(name)) {
			System.out.println("이름이 비어있습니다.");
		} else {
			System.out.println("사용자의 이름은 " + name + "입니다.");
		}
		
		if (rule.isEmpty(addr)) {
			System.out.println("주소가 비어있습니다.");
		} else {
			System.out.println("사용자의 주소는 " + addr + "입니다.");
		}
		
		if (rule.isEmpty(year)) {
			System.out.println("연도를 입력해주세요.");
		} else {
			System.out.println("입력한 연도는 " + year + "입니다.");
		}
	}

}
