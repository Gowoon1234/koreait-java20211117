package a09_�޼ҵ�;

/*
 * �����ε�
 * �޼ҵ� �̸��� ������ �ŰԺ����� �ٸ��� �ٸ� �޼ҵ�� ����Ѵ�.
 */

public class OverloadingEx {

	static void �޿�Method(int ����, int ���̳ʽ��ݾ�) {
		System.out.println(���� - ���̳ʽ��ݾ�);
		System.out.println("����� �޿� ���");
	}
	
	/*
	 * ���ڿ��� ����ȯ
	 * 1. ���ڿ� -> int, dauble
	 * Interger.parseInt("1000000");  ���ڿ��� ������ ��ȯ
	 * Doble.parseDouble("1000000.1");  ���ڿ��� �Ǽ��� ��ȯ
	 * Long, Boolean
	 * 
	 * 2. int, double ->  ���ڿ�
	 * Interger.toString("1000000");  ������ ���ڿ��� ��ȯ
	 * Doble.toString("1000000.1");  �Ǽ��� ���ڿ��� ��ȯ
	 */
	
	static void �޿�Method(int ����, String ���̳ʽ��ݾ�) {
		System.out.println(���� - Integer.parseInt(���̳ʽ��ݾ�));
		System.out.println("����� �޿� ���");
	}
	
	static void �޿�Method(int ����) {
		System.out.println(����);
		System.out.println("���� �޿� ���");
	}
	
	static void �޿�Method(String ����) {
		System.out.println(����);
		System.out.println("���� �޿� ���(���ڿ�)");
	}
	
	public static void main(String[] args) {
		�޿�Method(1000000, "500000");
		System.out.println(Integer.toString(100005555));
	}

}
