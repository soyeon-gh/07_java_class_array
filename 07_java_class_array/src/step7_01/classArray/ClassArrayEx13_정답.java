package step7_01.classArray;

import java.util.Scanner;


class StudentEx{
	
	String id = "";
	String pw = "";
	
	void set_data(String id , String  pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	
	void print_data() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
	}
	
}

class Manager{
	
	StudentEx [] list = null;
	int stdCnt = 0;
	
	// 추가
	void add_StudentEx(StudentEx st) {
		
		if (stdCnt == 0) {
			list = new StudentEx[1];
		}else if(stdCnt > 0){
			StudentEx [] temp = list;
			
		}
		
		
	}
	
	// 삭제
	StudentEx remove_StudentEx (int index) {
		
	}
	
	// id 체크
	int check_id(StudentEx st) {
		
		int check = -1;
		
		for (int i = 0; i < stdCnt; i++) {
//			if (list[i].id.equals) {
//				
//			}
		}
		
		return check;
		
	}
	
	//출력
	void print_StudentEx() {
		
	}	
	//삭제
	String out_data() {
		
	}
	// 정렬
	void sort_data() {
		
	}
	// 불러오기
	void load_StudentEx (StudentEx [] temp , int count) {
		
	}
	
}


public class ClassArrayEx13_정답
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Manager manager = new Manager();
		
		while (true) {
			System.out.println("┌─────────────┐");
			System.out.println("│  회원 가입  │");
			System.out.println("├─────────────┤");
			System.out.println("│   1.가입    │");
			System.out.println("│   2.탈퇴    │");
			System.out.println("│   3.정렬    │");
			System.out.println("│   4.출력    │");
			System.out.println("│   5.저장    │");
			System.out.println("│   6.로드    │");
			System.out.println("│   7.종료    │");
			System.out.println("└─────────────┘");
			
			System.out.print("(1~7) 숫자를 입력해주세요 : ");
			int sel = sc.nextInt();
			
			/*
			 * [1] 가입하기 : ID 중복검사 구현
			 * [2] 탈퇴하기 : ID를 입력받아 탈퇴
			 * [3] 정렬하기 : 이름을 국어사전 순으로 정렬
			 * [4] 출력하기 : 데이터들을 화면에 출력
			 * [5] 저장하기 : 아래와 같은 형식으로 저장
			 * [6] 불러오기 : 파일에 저장된 내용을 불러오기
			 * [7] 종료하기 : 반복문을 종료
			 * 
			 * 			예) 
			 * 			2				// 회원 수
			 *			qwer,1234		// id,pw	
			 *			abcd,1111		// id, pw
			 */
			
			// 가입하기
			if		(sel == 1) {
				System.out.println("====== 가입하기 ======");
				
				StudentEx temp = new StudentEx();
				System.out.print("ID를 입력해주세요 : ");
				temp.id = sc.next();
				
				
				
				
			}
			
			// 탈퇴하기
			else if (sel == 2) {
				System.out.println("====== 탈퇴하기 ======");
				
			}
			
			// 정렬하기
			else if (sel == 3) {
				System.out.println("====== 정렬하기 ======");
			}
			
			// 출력하기
			else if (sel == 4) {
				System.out.println("====== 출력하기 ======");
			}
			
			// 저장하기
			else if (sel == 5) {
				System.out.println("====== 저장하기 ======");
			}
			
			// 불러오기
			else if (sel == 6) {
				System.out.println("====== 불러오기 ======");
			}
			
			// 종료하기
			else if (sel == 7) { 
				System.out.println("┌─────────────────────────────┐");
				System.out.println("│    프로그램을 종료합니다    │");
				System.out.println("└─────────────────────────────┘");
				break; 
			}
			
		}

	}

}
