package Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//���� ���� ã�Ƽ� ���� 
		//���� �۾��� ����� ã�Ƽ� ���
		Scanner input = new Scanner(System.in);
		Scanner Humannum = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		System.out.println("�ο����� �Է��ϼ���: ");
		int numinput = input.nextInt();
		for(int i = 0; i<numinput; i++) {
			System.out.println("����� �̸��� �Է��ϼ���: ");
			String humannum = Humannum.nextLine();
			names.add(humannum);
		}
		
		ArrayList<String> namesfind = new ArrayList<>();
		for(int i = 0; i< names.size(); i++) {
			String namefindlist = names.get(i).substring(0,1); //substring�� ���� �߶���
			if(namefindlist.equals("��")) {
				namesfind.add(names.get(i));
			}
		}
		System.out.println(namesfind.toString()); //toString�� ������ ����
	}
}
