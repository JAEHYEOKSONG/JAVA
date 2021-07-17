package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner Humannum = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.println("인원수를 입력하세요: ");
		int numinput = input.nextInt();
		for(int i = 0; i<numinput; i++) {
			System.out.println("사람의 이름을 입력하세요: ");
			String humannum = Humannum.nextLine();
			names.add(humannum);
		}
		
		ArrayList<String> namesfind = new ArrayList<>();
		for(int i = 0; i< names.size(); i++) {
			String namefindlist = names.get(i).substring(0,1);
			if(namefindlist.equals("김")) {
				namesfind.add(names.get(i));
			}
		}
		System.out.println(namesfind.toString());
	}
}
