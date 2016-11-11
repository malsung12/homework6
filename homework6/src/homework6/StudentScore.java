package homework6;

import java.util.Scanner;

public class StudentScore {
	Scanner scan = new Scanner(System.in);
	
	int[][] num = new int[5][3];
	int[] ssum = new int[5];
	int[] aavg = new int[5];
	int i, j, k, kor = 0, mat = 0, eng = 0;
	double avgk, avgm, avge;
	
	public void dentScore(){
		for(i = 0; i < 5; i++){
				System.out.print(i+1+"번째 학생 국어, 영어, 수학: ");
				num[i][0] = scan.nextInt();num[i][1] = scan.nextInt();num[i][2] = scan.nextInt();
		}
		for(i = 0; i < 5; i++){
				kor = kor + num[i][0];
				mat = mat + num[i][1];
				eng = eng + num[i][2];
		}
		avgk = kor / 5;
		avgm = mat / 5;
		avge = eng / 5;
		System.out.println("국어 총점은 "+kor+"점이고 평균은 "+avgk+" 입니다.");
		System.out.println("영어 총점은 "+eng+"점이고 평균은 "+avge+" 입니다.");
		System.out.println("수학 총점은 "+mat+"점이고 평균은 "+avgm+" 입니다.");
		
		for(i = 0; i < 5;  i ++){
			for(j = 0; j < 3; j++){
			ssum[i] = ssum[i] + num[i][j];
			aavg[i] = ssum[i] / 3;
			}
			System.out.println(i+1+"번 학색의 총점은 "+ssum[i]+" 평균은 "+aavg[i]+"이다.");
		}
	}
}
