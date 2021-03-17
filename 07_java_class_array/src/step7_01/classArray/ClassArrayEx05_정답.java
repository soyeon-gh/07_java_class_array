package step7_01.classArray;

import java.util.Scanner;

//class User2 {
//	
//	String id;
//	int money;
//	
//}

public class ClassArrayEx05_정답 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int SIZE = 100;
		
		User2[] user2List = new User2[SIZE];
		
		for (int i = 0; i < SIZE; i++) {
			user2List[i] = new User2();
		}
		
	
		int cnt = 0;
		
		while (true) {
			
			int check = -1;
			
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			System.out.print("1,2,3,4 중 번호를 입력해주세요 : ");
			int select = sc.nextInt();
			
			if (select == 1) {
				
				System.out.print("이름을 입력해주세요");
				user2List[cnt].id = sc.next();
				
				for (int i = 0; i < user2List.length; i++) {
					if (user2List[cnt].id != user2List[i].id) {
						check = 0;
					} 
				}
				
				
				
				System.out.print("금액을 입력해주세요");
				user2List[cnt].money = sc.nextInt();
				cnt++;
			} else if(select == 2) {
				
				
				
			} else if(select == 3) {
				
				System.out.println("======= 출   력 =======");
				
				
				for (int i = 0; i < user2List.length; i++) {
					if (user2List[i].id != null) {
						check = 0;
						break;
					} else if(user2List[i].id == null) {
						check = -1;
						break;
					}
				}
				
				if (check == 0) {
					for (int j = 0; j < cnt; j++) {
						System.out.println(user2List[j].id + " / " + user2List[j].money);
						System.out.println();
					}
				} else if(check == -1){
					System.out.println("출력할 내용이 없습니다.");
				}
				
			} else if(select == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("1,2,3,4 만 입력해주세요");
			}
		}
		sc.close();
		
	}

}
