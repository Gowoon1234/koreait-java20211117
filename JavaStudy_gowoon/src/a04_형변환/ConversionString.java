package a04_형변환;

public class ConversionString {
	/**
	 * String (문자열)
	 * 
	 */
	public static void main(String[] args) {
		char name1 = '박';
		char name2 = '고';
		char name3 = '운';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.print(name3);
		
		String name = "박고운";
		
		System.out.println("" + name1 + name2 + name3 + "입니다.");
		System.out.println(name + "입니다.");
		System.out.println("10" + "10");
	}

}
