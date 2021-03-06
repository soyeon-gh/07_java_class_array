package step7_01.classArray;

import java.util.Scanner;

public class ClassArrayEx08_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// # 학생 추가 삭제 컨트롤러
		// => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		// 김철수 : 과목3개 수학 50 국어50 영어 60
		// 이만수 : 과목2개 수학 20 국어 30
		// 이영희 : 과목1개 수학 100

		Student[] stdList = new Student[3];
		
		int stdCnt = 0; // 학생 수

		while (true) {

			for (int i = 0; i < stdCnt; i++) {
				System.out.print(stdList[i].name);
				if (stdList[i].subjects != null) {
					for (int j = 0; j < stdList[i].subjects.length; j++) {
						System.out.println(
								"과목 : " + stdList[i].subjects[j].name + " " + stdList[i].subjects[j].score + " 점");
					}
				}
				System.out.println();
			}

			System.out.println("[1]학생 추가하기"); // 이름 입력받아 추가
			System.out.println("[2]과목 추가하기"); // 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기"); // 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();

			if (choice == 1) {

				System.out.print("이름을 입력해주세요 : ");
				String name = scan.next();
				stdList[stdCnt] = new Student();
				stdList[stdCnt].name = name;

				stdCnt++;

			} else if (choice == 2) {

				for (int i = 0; i < stdCnt; i++) {
					System.out.println("[ " + i + " ]" + stdList[i].name);
				}

				System.out.print("(번호를 입력하세요)학생을 선택해주세요 : ");
				int stuNumber = scan.nextInt();
				
				stuNumber--;
				
				if (stdCnt < stuNumber) {
					System.out.println("존재하지 않는 번호입니다.");
				} else {
					System.out.print("과목을 입력해주세요 : ");
					String subject = scan.next();
					
					if (stdList[stuNumber].subjects == null) {
						
						stdList[stuNumber].subjects = new Subject[1];
						stdList[stuNumber].subjects[0] = new Subject();
						
						stdList[stuNumber].subjects[0].name = subject;
						
					}
					else {
						
					}
				}

				

			} else if (choice == 3) {

			}

		}

	}

}
