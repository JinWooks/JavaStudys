package hehe;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String std;
		while(true) {
			System.out.println("���� �Է��ϼ���: ");
			std = sc.nextLine();
			if(std.equals("exit")) {
				System.out.println("���� �մϴ�.");
				break;
			}
		}
		sc.close();
	}
}
