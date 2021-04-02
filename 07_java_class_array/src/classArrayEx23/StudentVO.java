package classArrayEx23;

public class StudentVO {
	
	// 아이디, 비번 받아오기, 출력

	String id = "";
	String pw = "";
	String fname = "";

	void setData(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	void printData() {
		System.out.println("아이디: " + id + ", 비밀번호 : " + pw);
	}

	void fileName(String fname) {
		this.fname = fname;
	}
}
