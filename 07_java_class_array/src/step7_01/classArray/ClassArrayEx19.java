package step7_01.classArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassArrayEx19 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("///////////////////////////////");
		
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
		// add(value) : arraylist의 맨뒤에 value를 추가한다.
		// add(index, value) : arraylist의 index위치에 value를 추가한다.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("///////////////////////////////");
		
		
		System.out.println(arr.length);
		//size() : arraylist의 데이터의 개수를 반환한다.
		System.out.println(list.size());
		
		arr[0] = 1000;
		arr[1] = 2000;
		arr[2] = 3000;
		// set(index, value) : ArrayList의 index번째의 값을 value값으로 수정한다.
		list.set(0, 1000);
		list.set(1, 2000);
		list.set(2, 3000);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
		
		System.out.println("///////////////////////////////");
		
		arr[0] = 0;
		arr[1] = 0;
		arr[2] = 0;
		
		// remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		
		
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

}
