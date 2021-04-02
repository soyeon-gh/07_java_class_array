package step7_01.classArray;

import java.util.HashMap;

// 컬렉션 프레임워크

/*

# HashMap

- HashMap은 K(Key)에 V(Value)를 할당하는 방식으로 데이터가 저장된다.

*/

public class ClassArrayEx20 {

	public static void main(String[] args) {
		
		// HashMap<key, value>
		// Key : 대부분 String 으로 함
		
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		
		// put(key, value) : HashMap에 데이터를 추가한다.
		// key 가 기존에 있는 데이터면 변경
		// 없는 데이터면 추가
		System.out.println("\n=====  put  =====");
		hMap.put("data1", 1000);
		hMap.put("data2", 2000);
		hMap.put("data3", 3000);
		
		hMap.put("data1", 10000);
		hMap.put("data2", 20000);
		
		System.out.println(hMap);
		
		// ---------------------------------------------
		
		// size() : 데이터 갯수를 반환한다.
		System.out.println("\n=====  size  =====");
		System.out.println(hMap.size());
		
		// ---------------------------------------------
		
		// get() : HashMap의 key에 할당된 value를 얻어온다.
		System.out.println("\n=====  get  =====");
		System.out.println(hMap.get("data1"));
		System.out.println(hMap.get("data2"));
		System.out.println(hMap.get("data3"));
		
		// ---------------------------------------------
		
		// keySet() : HashMap의 key만 얻어온다.
		System.out.println("\n=====  keySet  =====");
		System.out.println(hMap.keySet());
		
		// ---------------------------------------------
		
		System.out.println("\n=====  for each get(key)  =====");
		
		for (String key : hMap.keySet()) {
			System.out.println(hMap.get(key));
		}
		
		// ---------------------------------------------
		
		// remove(key) : HashMap의 key에 해당되는 값을 제거한다.
		System.out.println("\n=====  remove(key)  =====");
		hMap.remove("data2");
		hMap.remove("data3");
		System.out.println(hMap);
		
		// ---------------------------------------------
		
		// clear() : HashMap의 모든값을 제거한다.
		System.out.println("\n=====  clear()  =====");
		hMap.clear();
	}

}
