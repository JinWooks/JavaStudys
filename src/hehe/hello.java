package hehe;

import java.util.Scanner;

public class hello {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String std;
		while(true) {
			System.out.println("값을 입력하세요: ");
			std = sc.nextLine();
			if(std.equals("exit")) {
				System.out.println("종료 합니다.");
				break;
			}
		}
		sc.close();
	}
}
