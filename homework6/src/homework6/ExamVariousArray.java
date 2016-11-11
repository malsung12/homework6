package homework6;

import java.util.Scanner;

public class ExamVariousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		int select;
		
		for(;;){
		System.out.print("***********\n배열 연습하기\n***********\n"
				+ "1.두번째로 큰 수 찾기\n2.심사 점수 계산\n3.학생 총점, 평균값 구하기\n4.5층 아파트의 거주자 숫자 구하기\n5.겹치지 않는 숫자 10개입력받기\n"
				+ "6.종료하기\n원하는 메뉴는 >>> ");
		select = a.nextInt();
		/************
		if(select == 1)
			new SencondMax().condMax();
		if else (select == 2)
			new AvgScore().Score();
		if else (select == 3)
			new StudentScore.dentScore();
		if else (select == 4)
			new AptPersonCount.PersonCount();
		if else (select == 5)
			new OnlyNumber.Number();*/
		if (select == 6)
			break;
		else
			System.out.println("잘못입력하셧습니다.");
		}
	}

}