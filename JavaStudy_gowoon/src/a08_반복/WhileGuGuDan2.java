package a08_�ݺ�;

import java.util.Scanner;

public class WhileGuGuDan2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int gugudanStart = 0;
		int gugudanEnd = 0;
		
		System.out.print("���� �ܼ� : ");
		gugudanStart = in.nextInt();
		System.out.print("������ �ܼ� : ");
		gugudanEnd = in.nextInt();
		
		int dan = gugudanStart;
		
		while(dan < gugudanEnd+1) {
			if (dan%2 != 0) {
				dan++;
				continue;
			}
			System.out.println(dan + "��");
			int number = 1;
			while (number < 10) {
				System.out.println(dan + " X " + number + " = " + dan*number);
				number++;
			}
			System.out.println();
			dan++;
		}
	}

}
