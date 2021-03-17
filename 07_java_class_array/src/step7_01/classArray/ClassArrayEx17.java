package step7_01.classArray;

// 접근 제어자 
// public default protected private + getter/setter

class PrivateTest{
	
	private int a;
	public int b;
	int c;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
//	// private 변수를 외부로 꺼내주는 메소드  getter
//	int getA() {
//		return this.a;
//	}
//	
//	// 외부에서 private 변수의 값을 수정하는 메소드 setter
//	void setA(int a) {
//		this.a = a;
//	}
	
	
}


public class ClassArrayEx17 {

	public static void main(String[] args) {
	
		
		PrivateTest obj = new PrivateTest();
		
		//obj.a = 100; 접근불가(is not visible)
		obj.b = 200;
		obj.c = 300;
		System.out.println(obj.b);
		System.out.println(obj.c);
		
		obj.setA(777);					//setter 이용해서 값 대입
		System.out.println(obj.getA()); // getter 이용해서 값 꺼내오기

	}

}
