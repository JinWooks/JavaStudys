package hehe;

import java.util.Scanner;

public class gugu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("출력하고 싶은 단을 입력하세요.(0:종료): ");
			num = sc.nextInt();
			if(num == 0) {
				System.out.println("종료 합니다.");
				break;
			}
			for(int j=1;j<10;j++) {
				if(j%2 == 0)
					System.out.println();
				System.out.print(num+"*"+j+"="+num*j+"\t");
			}
			System.out.println();
		}
		System.out.println("변동");
		sc.close();
	}
}
