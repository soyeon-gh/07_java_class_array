package classArrayEx23;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManager {

	ArrayList<StudentVO> studentList = new ArrayList<StudentVO>();

	
	// 1. 추가
	
	void addStudent(StudentVO st) {
		studentList.add(st);
	}
	
	//-----------------------------------------------------
	// 5. 파일 입력 ( 저장 )
	
	void fileWriter(String fname) throws IOException {
		
		FileWriter fw = new FileWriter(fname);
		String data = "";
		int count = studentList.size();
		data += count;
		data += "\n";
		for (int i = 0; i < count; i++) {
			data += studentList.get(i).id;
			data += ",";
			data += studentList.get(i).pw;
			if (count - 1 != i) {
				data += "\n";
			}
		}
		fw.write(data);
		fw.close();
	}
	
	//-----------------------------------------------------
	// 2. 삭제
	
	StudentVO removeData(int index) {
		StudentVO deleteData = studentList.get(index);
		studentList.remove(index);
		return deleteData;
	}

	//-----------------------------------------------------
	// 체크
	
	int checkID(StudentVO st) {

		int check = -1;

		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).id.equals(st.id)) {
				check = i;
				break;
			}
		}

		return check;
	}

	//-----------------------------------------------------
	// 3. 정렬 ( 오름차순, 내림차순 )

	void sort_data() {
		
	}

	//-----------------------------------------------------
	// 4. 출력
	
	void print_student() {
		for (StudentVO printList : studentList) {
			System.out.print("id : " + printList.id + "/ password : " + printList.pw);
			System.out.println();
		}
		
	}

	//-----------------------------------------------------
	// 6. 로드
	
	void load_student(String fname) throws IOException {
		
			File file = new File(fname);
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			int count = Integer.parseInt(line);
			
			for (int i = 0; i < count; i++) {
				StudentVO temp = new StudentVO();
				line = br.readLine();
				String value[] = line.split(",");
				temp.id = value[0];
				temp.pw = value[1];
				studentList.add(temp);
			}
			fr.close();
			br.close();
	}

}
