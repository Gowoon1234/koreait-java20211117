package a10.Ŭ����;

public class Car {
	// ���۷��� ����(���� ����)
	private String company;  // ������
	private String model;  // ���� �𵨸�
	private String color;  // ���� ����
	private int year;  // ����
	
	// getter(������ ��) && setter(���� ������ ��)
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
