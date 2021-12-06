package a10.클래스;

public class Car {
	// 레퍼런스 변수(참조 변수)
	private String company;  // 제조사
	private String model;  // 차량 모델명
	private String color;  // 차량 색상
	private int year;  // 연식
	
	// getter(가져올 때) && setter(값을 대입할 때)
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void carInfo() {
		System.out.println(company + ", " + model + ", " + color + ", " + year);
	}
}
