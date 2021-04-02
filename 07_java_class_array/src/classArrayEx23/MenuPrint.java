package classArrayEx23;

import java.io.IOException;
import java.util.Scanner;

public class MenuPrint {
	
	public MenuPrint() throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		StudentManager manager = new StudentManager();
		
		while (true) {

			System.out.println("┌───────────┐");
			System.out.println("│  1.가입   │");
			System.out.println("│  2.탈퇴   │");
			System.out.println("│  3.정렬   │");
			System.out.println("│  4.출력   │");
			System.out.println("│  5.저장   │");
			System.out.println("│  6.로드   │");
			System.out.println("│  7.종료   │");
			System.out.println("└───────────┘");
			System.out.print("\n메뉴번호를 입력해주세요 : ");
			
			int sel = sc.nextInt();

			if (sel == 1) {
			
				StudentVO temp = new StudentVO();
				System.out.print("아이디를 입력해주세요 : ");
				temp.id = sc.next();
				
				int check = manager.checkID(temp);
				
				if (check == -1) {
					System.out.print("비밀번호를 입력해주세요 : ");
					temp.pw = sc.next();
					manager.addStudent(temp);
					System.out.println("가입 성공");
				} else {
					System.out.println("만들 수 없는 ID입니다.");
				}
				
			} else if (sel == 2) {
				manager.print_student();
				StudentVO temp = new StudentVO();
				System.out.print("삭제할 아이디를 입력해주세요 : ");
				temp.id = sc.next();
				
				int check = manager.checkID(temp);
				if (check == -1) {
					System.out.println("없는 ID 입니다.");
				} else {
					manager.removeData(check);
					System.out.println(check + " 님 탈퇴 되었습니다.");
				}
				
			} else if (sel == 3) {
				manager.sort_data();
			} else if (sel == 4) {
				manager.print_student();
			} else if (sel == 5) {
				
				System.out.print("저장할 파일 이름을 입력해주세요 : ");
				String name = sc.next();
				
				manager.fileWriter(name + ".txt");
				
				
			} else if (sel == 6) {
				
				System.out.print("로드할 파일 이름을 입력해주세요 : ");
				String loadname = sc.next();
			
				manager.load_student(loadname + ".txt");
				manager.print_student();
				
			} else if (sel == 7) {
				System.out.println("종료합니다");
				break;
			}

		}
	}
	
}
