package classArrayEx23;

import java.util.Scanner;

public class JoinUs {
	
	public JoinUs() {
		
		StudentManager manager = new StudentManager();
		Scanner sc = new Scanner(System.in);
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
		
		sc.close();
	}
	
}