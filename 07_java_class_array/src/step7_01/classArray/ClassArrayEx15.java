package step7_01.classArray;


// 생성자를 이용한 멤버 변수 초기화
class Fruit {
	
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void printData() {
		System.out.println("이름 : " + this.name + ", 가격 : " + this.price);
	}
	
//	public void setData(String name, int price) {
//		this.name = name;
//		this.price = price;
//	}
//	
//	public String getData() {
//		
//		return name+ price;
//	}
//}
	
}


public class ClassArrayEx15 {

	public static void main(String[] args) {
		
		Fruit apple = new Fruit("사과", 5000);
		apple.printData();
		
		Fruit banana = new Fruit("바나나", 2500);
		banana.printData();
		
		
		
		
	}
	
	
}
