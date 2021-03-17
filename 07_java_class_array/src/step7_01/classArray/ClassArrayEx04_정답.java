package step7_01.classArray;

import java.util.Scanner;

//class User1{
//	
//	String id; 
//	int money;
//	
//}


public class ClassArrayEx04_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 3;
		User1[] userList = new User1[SIZE];

		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User1();
		}
		
		userList[0].id = "abcd";
		userList[0].money = 1000;
		
		userList[1].id = "efgh";
		userList[1].money = 2000;
		
		int userListCount = 2;
		
		for (int i = 0; i < userListCount; i++) {
			System.out.println(userList[i].id + " / " + userList[i].money);
		}
		
		User1 temp = userList[1];
		temp.id = "zxcv";
		System.out.println("==============================");
		
		for (int i = 0; i < userListCount; i++) {
			System.out.println(userList[i].id + " / " + userList[i].money);
		}
		
		scan.close();


	}

}
